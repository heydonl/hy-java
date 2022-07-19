package util.collection;

public interface HyImmutableCollection<E> extends HyCollection<E>{
    HyImmutableCollection<E> add(E element);
    HyImmutableIterator<E> getIterator();
}
