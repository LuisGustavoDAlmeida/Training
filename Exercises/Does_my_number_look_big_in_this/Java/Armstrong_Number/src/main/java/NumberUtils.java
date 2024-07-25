public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        String strNum = String.valueOf(number);
        Double total = 0.0;

        for (int i = 0; i < strNum.length(); i++) {
            Integer actualNum = Character.getNumericValue(strNum.charAt(i));
            total += Math.pow(actualNum, strNum.length());
        }
        return total == number;
    }
}
