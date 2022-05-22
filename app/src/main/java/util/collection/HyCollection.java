package util.collection;

/**
 * 集合接口，对元素的一种组织接口，比如增删改查
 */
public interface HyCollection<E> {
    HyIterator<E> getIterator();
}
