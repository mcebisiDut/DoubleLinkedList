public class DoubleLinkedList<T> implements DoubleLinkedListInterface<T> {
    private int size;
    private ListNode<T> head;

    DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean IsEmpty() {
        return (size == 0);
    }

    public void AddFront(T item) {
        if (IsEmpty()) {
            AddFirst(item);
        } else {
            ListNode current = head;
            head = new ListNode<>(item, head, null);
            current.SetPrevious(head);
        }
        size++;
    }

    public void AddBack(T item) {
        if (IsEmpty()) {
            AddFirst(item);
        } else {
            ListNode oldLastNode = GetLastNode();
            ListNode lastNode = new ListNode<>(item, null, oldLastNode);
            oldLastNode.SetNext(lastNode);
        }
        size++;
    }

    public void Add(T item, int position) {
        if (Valid(position) | position == 1) {
            ListNode nodeAtPosition = GetNodeAt(position);
            ListNode newNode = new ListNode<>(item, nodeAtPosition, nodeAtPosition.GetPrevious());
            nodeAtPosition.GetPrevious().SetNext(newNode);
            nodeAtPosition.SetPrevious(newNode);
            size++;
        }
    }

    public void RemoveFront() {
        if (size==1) {
            RemoveFirst();
        } else {
        head = head.GetNext();
        head.SetPrevious(null);
        size--;
        }
    }

    public void RemoveBack() {
        if (size==1) {
            RemoveFirst();
        } else {
            ListNode lastNode = GetLastNode();
            lastNode.GetPrevious().SetNext(null);
            size--;            
        }
    }

    public void Remove(int position) {
        if (position == 1) {
            RemoveFirst();
        }else if(position == size){
            RemoveBack();
        } else if (Valid(position)) {
            ListNode removeNode = GetNodeAt(position);
            removeNode.GetPrevious().SetNext(removeNode.GetNext());
            removeNode.GetNext().SetPrevious(removeNode.GetPrevious().GetPrevious());
            size--;
        }
    }

    public String Search(T item) {
        if (!IsEmpty()) {
            ListNode current = head;
            for (int position = 1; position <= size; position++) {
                if (current.GetItem().equals(item)) {
                    return item + " found at position: " + position;
                }
            }
        }
        return item + " not found";
    }

    public void Display() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.GetItem());
            current = current.GetNext();
        }
    }

    private void AddFirst(T item) {
        head = new ListNode<T>(item, null, null);
    }

    private ListNode GetLastNode() {
        ListNode current = head;
        while (current.GetNext() != null) {
            current = current.GetNext();
        }
        return current;
    }

    private ListNode GetNodeAt(int position) {
        ListNode current = head;
        for (int index = 1; index < position; index++) {
            current = current.GetNext();
        }
        return current;
    }

    private boolean Valid(int position) {
        return (position > 0 && position <= size);
    }

    private void RemoveFirst() {
        head = null;
        size = 0;
    }
}