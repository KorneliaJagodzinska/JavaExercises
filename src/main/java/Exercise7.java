import java.lang.reflect.Array;
//A string of braces is considered valid if all braces are matched with the correct brace.
public class Exercise7 {
    public boolean isValid(String braces) {
        int parenCount = 0;
        int squareBracketCount = 0;
        int curlyBraceCount = 0;

        String[] split = braces.split("");

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("(")) {
                parenCount -= 1;
            }
            if (split[i].equals (")")) {
                parenCount += 1;
            }
            if (split[i].equals("[")) {
                squareBracketCount -= 1;
            }
            if (split[i].equals ("]")) {
                squareBracketCount += 1;
            }
            if (split[i].equals ("{")) {
                curlyBraceCount -= 1;
            }
            if (split[i].equals ("}")) {
                curlyBraceCount += 1;
            }
        }
        if (parenCount == 0 && squareBracketCount == 0 && curlyBraceCount == 0) {
            return true;
        } else {
            return false;
        }
    }
}
