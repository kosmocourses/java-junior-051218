package org.kosmocourse.junior.leesson15.ashan;

public interface FNStorage<K, V> {
    V get(K key);

    void save(K key, V value);
}
