package util.collection;

public interface HyImmutableCollection<E> extends HyReadOnlyCollection<E>{
    HyImmutableCollection<E> add(E element);
    HyImmutableIterator<E> getIterator();
}
