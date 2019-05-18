public interface DoubleLinkedListInterface<T> {
    public boolean IsEmpty();
    public void AddFront (T item);
    public void AddBack(T item);
    public void Add(T item, int position);
    public void RemoveFront ();
    public void RemoveBack();
    public void Remove(int position);
    public String Search(T item);
    public void Display();
}