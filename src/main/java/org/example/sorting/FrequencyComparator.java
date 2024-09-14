package org.example.sorting;
import java.util.*;

    public class FrequencyComparator implements Comparator<Integer> {
        private Map<Integer, Integer> frequencyMap;

        public FrequencyComparator(int[] arr) {
            frequencyMap = new HashMap<>();
            for (int num : arr) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        @Override
        public int compare(Integer num1, Integer num2) {
            int freqCompare = frequencyMap.get(num2).compareTo(frequencyMap.get(num1));
            if (freqCompare != 0) {
                return freqCompare;
            }
            return num1.compareTo(num2);
        }

        public static void main(String[] args) {
            int[] arr = {1,2,2,3};
            Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);

            FrequencyComparator comparator = new FrequencyComparator(arr);
            Arrays.sort(array, comparator);

            System.out.println(Arrays.toString(array));
        }
    }



