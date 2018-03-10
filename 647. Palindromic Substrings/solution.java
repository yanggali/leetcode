class Solution {
    int count = 0;
    public int countSubstrings(String s) {
        if(s == null&& s.length() == 0) return 0;
        for(int i = 0;i < s.length();i++){
            // calculate the Palindromic Substrings numbers at the a[i] center
            calCountCenteredI(s,i,i);
            calCountCenteredI(s,i,i+1);
        }
        return count;

    }
    public void calCountCenteredI(String s,int left,int right){
        int i = left,j = right;
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            count ++;
            i--;
            j++;
        }
    }
}