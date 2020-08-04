import java.util.Scanner;
public class anagrams {


    static boolean isAnagram(String a, String b) {
        // Complete the function
        int a_length = a.length();
        int b_length = b.length();

        if (a_length != b_length) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] charFrequency = new int[26];
        for (int i = 0; i < a_length; i++) {
            char currentChar = a.charAt(i);
            int index = currentChar - 'a';
            charFrequency[index]++;
        }
        for (int i = 0; i < b_length; i++) {
            char currentChar = b.charAt(i);
            int index = currentChar - 'a';
            charFrequency[index]--;
        }
        for (int i = 0; i < 26; i++) {
            if (charFrequency[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
