package util.collection;

public interface HyImmutableCollection<E> extends HyCollection<E>{
    HyImmutableIterator<E> getIterator();
}
