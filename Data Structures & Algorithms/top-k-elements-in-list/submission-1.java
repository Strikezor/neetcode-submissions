class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mp.merge(nums[i], 1, Integer::sum);
        }
        PriorityQueue<Pair> pq =
            new PriorityQueue<>(Comparator.comparingInt((Pair p) -> p.second).reversed());

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll().getFirst();
        }
        return res;
    }
    public class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
        public int getFirst() {
            return first;
        }
    }
}
