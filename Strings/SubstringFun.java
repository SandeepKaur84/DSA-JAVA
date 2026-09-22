package Strings;

public class SubstringFun {
    public static String SubStr(int si, int ei, String str) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = "HelloJi";
        String res = SubStr(3, 6, str);
        System.out.println(res);
    }
}
