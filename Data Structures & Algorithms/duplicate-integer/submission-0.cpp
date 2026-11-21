class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int,int> ump;
        for(int i : nums){
            if(ump.contains(i)) return true;
            ump[i]++;
        }
        return false;
    }
};