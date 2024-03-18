public class Fibonacci {
    public static boolean contains(Integer num) {
        if (num < 1) {
            return false;
        }
        Integer aux1 = 0;
        Integer aux2 = 0;
        Integer value = 1;
        while (value < num) {
            aux2 = aux1;
            aux1 = value;
            value = aux1 + aux2;
        }
        if (value == num) {
            return true;
        }
        return false;
    }

}
