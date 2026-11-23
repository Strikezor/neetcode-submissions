class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mp.merge(nums[i],1,Integer::sum);
        }
        List<Pair> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            list.add(new Pair(entry.getKey(), entry.getValue()));
        }
        list.sort(Comparator.comparingInt((Pair p) -> p.second).reversed());
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getFirst();
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
        public int getFirst(){
            return first;
        }
    }
}
