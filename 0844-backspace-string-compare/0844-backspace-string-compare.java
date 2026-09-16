public class Solution {
    public boolean backspaceCompare(String s, String t) {
        return convert(s).equals(convert(t));
    }

    private List<Character> convert(String s) {
        List<Character> res = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!res.isEmpty()) {
                    res.remove(res.size() - 1);
                }
            } else {
                res.add(c);
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna