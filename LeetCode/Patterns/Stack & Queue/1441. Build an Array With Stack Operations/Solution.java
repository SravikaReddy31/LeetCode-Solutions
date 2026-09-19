class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> s = new ArrayList<>();
        int j=0;
        for(int i=1;i<=n;i++) {
            if(i == target[j]) {
                s.add("Push");
                j++;
            } else {
                s.add("Push");
                s.add("Pop");
            }
            if(j == target.length) {
                break;
            }
        }
        return s;
    }
}