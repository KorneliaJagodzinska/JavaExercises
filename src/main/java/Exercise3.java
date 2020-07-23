//Your task is to convert strings to how they would be written by Jaden Smith.
//Example:
//Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
//Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"

public class Exercise3 {
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) return null;

        char[] array = phrase.toCharArray();

        for (int x = 0; x < array.length; x++) {
            if (x == 0 || array[x - 1] == ' ') {
                array[x] = Character.toUpperCase(array[x]);
            }
        }

        return new String(array);
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }
}
