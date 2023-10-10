public class PangramChecker {
    public static boolean isPangram(String input) {
        
        boolean[] alphabetPresent = new boolean[26];

        
        input = input.toLowerCase();

        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }

        
        for (boolean letterPresent : alphabetPresent) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}