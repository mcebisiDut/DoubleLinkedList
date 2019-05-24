public class ListNode<T> {
    private T item;
    private ListNode<T> next;
    private ListNode<T> previous;

    ListNode(T item, ListNode next, ListNode previous) {
        SetItem(item);
        SetNext(next);
        SetPrevious(previous);
    }

    ListNode(T item) {
        this(item,null);
    }

    public void SetItem(T item){
        this.item = item;
    }

    public T GetItem(){
        return item;
    }

    public void SetNext(ListNode next){
        this.next = next;
    }

    public ListNode<T> GetNext(){
        return next;
    }

    public void SetPrevious(ListNode previous){
        this.previous = previous;
    }

    public ListNode<T> GetPrevious(){
        return previous;
    }
}