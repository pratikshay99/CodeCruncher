package Beginner.advanced.collectionsEg;

import java.util.HashMap;
import java.util.Map;

public class MapEg {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // ✅ put() - adding entries
        map.put("name", "Alice");
        map.put("city", "Mumbai");
        map.put("language", "Java");
        System.out.println(map);                 //{city=Mumbai, name=Alice, language=Java}

        // ✅ put() - overwrite existing key
        map.put("name", "Bob");                 // "name" was "Alice", now replaced by "Bob"
        System.out.println(map);                //{city=Mumbai, name=Bob, language=Java}

        // ✅ null key & null values
        map.put(null, "NullKey1");              // One null key allowed
        map.put("nullValue1", null);            // Multiple null values allowed
        map.put("nullValue2", null);
        map.put(null, "NullKey2");              //duplicate key Overwrites
        System.out.println(map);            //{null=NullKey2, city=Mumbai, nullValue2=null, name=Bob, nullValue1=null, language=Java}

        // ✅ size()
        System.out.println("Size: " + map.size());      // 7

        // ✅ .get() only works with keys.
        System.out.println("Get value by key 'city': " + map.get("city"));         // Mumbai: -> get value by key
        System.out.println("Get value 'Mumbai': " + map.get("Mumbai"));         // null

        System.out.println("Get null key: " + map.get(null));         // NullKey2
        System.out.println("Get missing key: " + map.get("unknown")); // null

        // ✅ containsKey() & containsValue()
        System.out.println("Contains key 'name'? " + map.containsKey("name"));     // true
        System.out.println("Contains value 'Java'? " + map.containsValue("Java")); // true

        // ✅ remove()
        map.remove("language");
        System.out.println("\nAfter removing 'language': " + map);

        // ✅ keySet() -> only need keys and don't care about values.
        System.out.println("\nKeys:");
        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }

        // ✅ values() -> only need values, not keys.
        for (String value : map.values()) {
            System.out.print(value + " ");
        }
        // ✅ entrySet() & Map.Entry -> need both the key and the value in your loop.
        System.out.println("\nEntries:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        //❌ Less efficient alternative:
        //In HashMap, this is O(1), but in TreeMap or custom maps, it can be O(log n) or worse. So if you iterate over keySet() and call get(), you're doing N lookups, which can be costly.

        for (String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));  // ❌ inefficient
        }

        // ✅ clear()
        map.clear();
        System.out.println("Map is empty? " + map.isEmpty()); // true
    }
}
/*
Map Type                | Insertion Order Maintained?
HashMap                 | ❌ No | Order is unpredictable
LinkedHashMap           | ✅ Yes | Maintains insertion order
TreeMap                 | ❌ No | Orders by key (sorted)
ConcurrentHashMap       | ❌ No | Focused on concurrency
 */