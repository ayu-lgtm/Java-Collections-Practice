public class FindOneEXtraCharacter {
    public static void main(String args[]){
        String s1="bdcaf";
        String s2="abcdfe";

        int n = Math.min(s1.length(),s2.length());

        int res=0;

        for(int x=0;x<n;x++){
            res=res^s1.charAt(x)^s2.charAt(x);
        }

        if(s1.length()<s2.length()){
            res=res^s2.charAt(n);
        }
        else{
            res=res^s1.charAt(n);
        }

        System.out.print((char)res);
    }
}
