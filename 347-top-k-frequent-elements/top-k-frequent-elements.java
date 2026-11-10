class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        for(int key : map.keySet()){
            heap.add(key);
        }

        int[] arr = new int[k];

        for(int i = 0; i < k; i++){
            arr[i] = heap.remove();
        }

        return arr;
    }
}