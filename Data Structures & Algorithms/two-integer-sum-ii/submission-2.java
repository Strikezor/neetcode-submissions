class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        int[] res = new int[2];

        while(i<j){
            if(numbers[j]==target-numbers[i]){
                res[0] = i+1;
                res[1] = j+1;
                return res;
            } else if(numbers[j] > target-numbers[i]) {
                j--;
            } else {
                i++;
            }
        }
        return res;
    }
}
