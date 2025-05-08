
package src;
public class VowelFinder {
    public static void main(String[] args) {
        String[] words = {"Sunshine", "Umbrella", "Major", "Resourceful"};
        System.out.println("String with most vowels: " + getStringWithMostVowels(words));
    }

    public static String getStringWithMostVowels(String[] words) {
        String result = "";
        int maxVowelsCount = 0;

        for (String word : words) {
            int vowelCount = countVowels(word);
            if (vowelCount > maxVowelsCount) {
                maxVowelsCount = vowelCount;
                result = word;
            }
        }

        return result;
    }

    public static int countVowels(String word) {
        int count = 0;
        word = word.toLowerCase();
        for (char c : word.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
