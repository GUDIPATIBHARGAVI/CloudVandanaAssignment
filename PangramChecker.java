public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
      
        s = s.toLowerCase();
        boolean[] letters = new boolean[26];

        int uniqueLetterCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!letters[index]) {
                    letters[index] = true;
                    uniqueLetterCount++;
                }
            }
        }

        // A pangram should have 26 unique lowercase letters (a to z)
        return uniqueLetterCount == 26;
    }
}
