class Solution {
    public boolean isAnagram(String s, String t) {
        String a1 = s.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        String a2 = t.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        return a1.equals(a2);
    }
}
