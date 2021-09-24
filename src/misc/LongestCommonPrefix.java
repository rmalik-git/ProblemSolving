package misc;

public class LongestCommonPrefix {


    public static String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(s) != 0) {
                s = s.substring(0, s.length() - 1);
            }
            i++;
        }
        return s;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
//                {"dog","racecar","car"};
//                {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

}
