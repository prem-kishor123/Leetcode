class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int currentWidth = 0;

        for (char ch : s.toCharArray()) {
            int w = widths[ch - 'a'];

            if (currentWidth + w > 100) {
                lines++;
                currentWidth = w;
            } else {
                currentWidth += w;
            }
        }

        return new int[]{lines, currentWidth};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna