package data_structures;

public class Array {

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        char tempBox;
        for (int i = 0; i < chars.length / 2; i++) {
            tempBox = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = tempBox;
        }
        return String.valueOf(chars);
    }

}
