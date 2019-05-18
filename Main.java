public class Main {
    public static void main(String[] args) {
        DoubleLinkedListInterface myList = new DoubleLinkedList<>();
        myList.AddBack(4);
        myList.AddFront(2);
        myList.AddFront(1);
        myList.AddBack(5);
        myList.Display();
        System.out.println("============================");
        myList.Add(3, 3);
        myList.Display();
        System.out.println("============================");
        myList.RemoveFront();
        myList.Display();
        System.out.println("============================");
        myList.RemoveBack();
        myList.Display();
        System.out.println("============================");
        myList.Remove(2);
        myList.Display();
        System.out.println("============================");
        String item = myList.Search(2);
        System.out.println(item);
        System.out.println("============================");
        item = myList.Search(8);
        System.out.println(item);
        System.out.println("============================");
    }
}