class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxdepth=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
                maxdepth=Math.max(maxdepth,count);
            }
            else if(ch==')'){
                count--;
            }
        }
        return maxdepth;
    }
}
