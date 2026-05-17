class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        java.util.HashMap<Object, Integer> map = new java.util.HashMap<>();

        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);

            if (!java.util.Objects.equals(map.put(ch, i), map.put(words[i], i))) {
                return false;
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna