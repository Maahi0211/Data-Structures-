import java.util.*;

public class Cache {

    static class LFUCache {
        private int capacity;
        private Map<Integer, Integer> keyToValue;
        private Map<Integer, Integer> keyToFrequency;
        private Map<Integer, LinkedHashSet<Integer>> frequencyToKeys;
        private int minFrequency;

        public LFUCache(int capacity) {
            this.capacity = capacity;
            this.keyToValue = new HashMap<>();
            this.keyToFrequency = new HashMap<>();
            this.frequencyToKeys = new HashMap<>();
            this.minFrequency = 0;
        }

        public int get(int key) {
            if (!keyToValue.containsKey(key)) {
                return -1;
            }
            int frequency = keyToFrequency.get(key);
            keyToFrequency.put(key, frequency + 1);
            frequencyToKeys.get(frequency).remove(key);

            if (frequencyToKeys.get(frequency).isEmpty()) {
                frequencyToKeys.remove(frequency);
                if (minFrequency == frequency) {
                    minFrequency++;
                }
            }

            frequencyToKeys.computeIfAbsent(frequency + 1, k -> new LinkedHashSet<>()).add(key);
            return keyToValue.get(key);
        }

        public void put(int key, int value) {
            if (capacity == 0) {
                return;
            }

            if (keyToValue.containsKey(key)) {
                keyToValue.put(key, value);
                get(key); // Update frequency
                return;
            }

            if (keyToValue.size() == capacity) {
                int evict = frequencyToKeys.get(minFrequency).iterator().next();
                frequencyToKeys.get(minFrequency).remove(evict);
                if (frequencyToKeys.get(minFrequency).isEmpty()) {
                    frequencyToKeys.remove(minFrequency);
                }
                keyToValue.remove(evict);
                keyToFrequency.remove(evict);
            }

            keyToValue.put(key, value);
            keyToFrequency.put(key, 1);
            frequencyToKeys.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
            minFrequency = 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read capacity of the LFU cache
        int capacity = scanner.nextInt();

        // Read the number of operations
        int operationsCount = scanner.nextInt();

        // Create the LFUCache object
        LFUCache cache = new LFUCache(capacity);

        // Process operations
        for (int i = 0; i < operationsCount; i++) {
            int operationType = scanner.nextInt();
            int key = scanner.nextInt();

            if (operationType == 1) {
                // Perform get operation
                System.out.println(cache.get(key));
            } else if (operationType == 2) {
                // Perform put operation
                int value = scanner.nextInt();
                cache.put(key, value);
            }
        }

        scanner.close();
    }
}
