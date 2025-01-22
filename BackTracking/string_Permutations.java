class string_Permutations{
    //this code written by other laptop and try to how to update file in other device
    public static void permute(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        // recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1,str.length());
            permute(newStr,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permute(str, "");
    }
}