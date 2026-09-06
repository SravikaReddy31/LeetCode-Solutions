class Solution {
    public int findDuplicate(int[] arr) {
        HashSet <Integer> set = new HashSet<>();
        int ans = 0;
        for(int num:arr) {
            if(set.contains(num)) {
                ans = num;
            }
            set.add(num);
        }
        return ans;
    }
}