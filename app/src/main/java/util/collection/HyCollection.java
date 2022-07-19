package util.collection;

public interface HyCollection<E> extends HyReadOnlyCollection<E>{
    public HyCollection<E> add(E element);
    public HyCollection<E> remove(E element);
    HyIterator<E> getIterator();
}
