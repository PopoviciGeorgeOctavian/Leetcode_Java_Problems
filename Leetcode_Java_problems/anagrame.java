import java.util.HashMap;
import java.util.Map;


class anagrame {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        // Assuming lowercase ASCII characters
        int[] frequencyVector = new int[26];

        // Increment frequency for characters in string s
        for (int i = 0; i < s.length(); i++) {
            frequencyVector[s.charAt(i) - 'a']++;
        }

        // Decrement frequency for characters in string t
        for (int i = 0; i < t.length(); i++) {
            frequencyVector[t.charAt(i) - 'a']--;

            // If at any point a character's frequency becomes negative, strings are not anagrams
            if (frequencyVector[t.charAt(i) - 'a'] != 0) {
                return false;
            }
        }

        // Check if all frequencies are zero
        for (int frequency : frequencyVector) {
            if (frequency != 0) {
                return false;
            }
        }

        return true;
    }
}