package com.example.demo.hashmap;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "2");
        String oldValue = hashMap.put("1", "3");
        System.out.println(oldValue);
        /*public V put(K key, V value) {
            if (table == EMPTY_TABLE) {
                inflateTable(threshold);
            }
            if (key == null)
                return putForNullKey(value);
            int hash = hash(key);
            int i = indexFor(hash, table.length);
            for (HashMap.Entry<K,V> e = table[i]; e != null; e = e.next) {
                Object k;
                if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
                    V oldValue = e.value; 保留旧的值
                    e.value = value; 新的值覆盖e.value
                    e.recordAccess(this);
                    return oldValue;  返回旧的值
                }
            }

            modCount++;
            addEntry(hash, key, value, i);
            return null;
        }*/
    }
}
