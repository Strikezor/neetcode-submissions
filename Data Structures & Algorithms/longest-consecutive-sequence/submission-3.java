class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> count = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            count.add(nums[i]);
        }
        ArrayList<Integer> seqStarters = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(!count.contains(nums[i]-1)) seqStarters.add(nums[i]);
        }
        int maxSeq = 0;
        for(Integer s : seqStarters){
            int currSeq = 0;
            while(count.contains(s)){
                currSeq++;
                s++;
            }
            maxSeq = Math.max(maxSeq,currSeq);
        }

        return maxSeq;
    }
}
