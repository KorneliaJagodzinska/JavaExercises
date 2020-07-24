//In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function
// with one side of the DNA
// you need to get the other complementary side. DNA strand is never empty or there is no DNA at all

public class Exercise9 {
    public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = getComplement(chars[i]);
        }

        return new String(chars);
    }

    private static char getComplement(char c) {
        switch (c) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
        }
        return c;
    }
}
