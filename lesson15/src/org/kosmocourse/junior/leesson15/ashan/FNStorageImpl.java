package org.kosmocourse.junior.leesson15.ashan;

import java.util.HashMap;
import java.util.Map;

public class FNStorageImpl<K, V> implements FNStorage<K, V> {

    private Map<K, V> storage = new HashMap<>();

    @Override
    public V get(K key) {
        return storage.get(key);
    }

    @Override
    public void save(K key, V value) {
        storage.put(key, value);
    }
}
