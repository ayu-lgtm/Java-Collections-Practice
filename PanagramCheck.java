import java.util.Arrays;

class PanagramCheck {
    public static void main(String args[]) {
        String s = "the quick brown fox jumps over the lazy dog";

        if(s.length()<26){
            System.out.print("Not paragram ");
        }
        boolean arr[] = new boolean[26];

        Arrays.fill(arr, false);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                arr[c - 'a'] = true;
            }
            if (c >= 'A' && c <= 'Z') {
                arr[c - 'A'] = true;
            }
        }


        //System.out.print(Arrays.toString(arr));
        boolean b = true;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == false) {
                b = false;
            }
        }
        if (b == false) {
            System.out.print("Not Panagram");
        } else {
            System.out.print("Panagram");
        }
    }
}