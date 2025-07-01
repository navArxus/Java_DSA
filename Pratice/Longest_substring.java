public class Longest_substring {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;

        int maxLength = 0;
        String tempString = "";

        for (int i = 0; i < s.length(); i++) {
            String currentChar = Character.toString(s.charAt(i));

            if (tempString.contains(currentChar)) {
                int index = tempString.indexOf(currentChar);
                tempString = tempString.substring(index + 1);
            }

            tempString += currentChar;
            maxLength = Math.max(maxLength, tempString.length());
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
