class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap <Character,Integer> freqs = new HashMap<>();
        HashMap <Character,Integer> freqt = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            freqs.put(s.charAt(i),freqs.getOrDefault(s.charAt(i),0)+1);
            freqt.put(t.charAt(i),freqt.getOrDefault(t.charAt(i),0)+1);
        }
        return freqs.equals(freqt);
    }
}
