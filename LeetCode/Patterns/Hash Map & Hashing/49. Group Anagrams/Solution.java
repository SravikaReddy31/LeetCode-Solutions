class Solution {
    boolean find(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int[] arr = new int[26];
        for(int i=0;i<s1.length();i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        for(int i:arr) {
            if(i != 0) return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] arr) {
        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(arr[i].equals("#")) continue;
            ArrayList<String> al = new ArrayList<>();
            al.add(arr[i]);
            for(int j=i+1;j<arr.length;j++) {
                if(find(arr[i], arr[j])) {
                    al.add(arr[j]);
                    arr[j] = "#";
                }
            }
            ans.add(al);
        }
        return ans;
    }
}