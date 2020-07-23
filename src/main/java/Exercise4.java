//Your task is to write a function maskify, which changes all but the last four characters into '#'.
//Examples:
//Maskify.Maskify("4556364607935616"); // should return "############5616"

public class Exercise4 {
    public static String maskify(String str) {
        if (str.length() <= 4)
            return str;
        String result = "";
        for (int i = 0; i < str.length() - 4; i++) {
            result += "#";
        }
        return result + str.substring(str.length() - 4);
    }
}
