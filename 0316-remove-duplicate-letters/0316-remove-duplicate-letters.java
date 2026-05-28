class Solution {
    public String removeDuplicateLetters(String s) {

        int[] last = new int[26];
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++)
            last[s.charAt(i) - 'a'] = i;

        char[] st = new char[26];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (seen[c - 'a']) continue;

            while (top >= 0 &&
                   st[top] > c &&
                   last[st[top] - 'a'] > i) {

                seen[st[top--] - 'a'] = false;
            }

            st[++top] = c;
            seen[c - 'a'] = true;
        }

        return new String(st, 0, top + 1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna