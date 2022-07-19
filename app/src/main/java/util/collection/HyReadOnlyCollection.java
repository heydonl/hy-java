package util.collection;

public interface HyReadOnlyCollection<E> {
    HyReadOnlyIterator<E> getIterator();
}
