public class MyString {
    public static String invert(String string) {
        String newString = "";
        int size = string.length();
        while (size > 0) {
            newString = newString + string.charAt(size - 1);
            size--;
        }
        return newString;
    } 
}
