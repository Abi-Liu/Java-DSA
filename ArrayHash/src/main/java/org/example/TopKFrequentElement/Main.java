package org.example.TopKFrequentElement;

// https://leetcode.com/problems/top-k-frequent-elements/

public class Main {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            if(map.get(num) != null){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer> arr = new ArrayList<>(map.keySet());
        arr.sort((a,b) -> map.get(b) - map.get(a));

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = arr.get(i);
        }

        return res;
    }
}
