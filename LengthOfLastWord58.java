class Solution {
    public int lengthOfLastWord(String s) {

        // remove extra space
        String newString = s.trim();
        int stringLength = newString.length();

        // counter to cont the length of the last word
        int counter = 0;

        // reverse loop until we find a space
        for (int i = stringLength - 1; i >= 0; i--) {

            if (newString.charAt(i)  != ' '){
                counter++;
            }
            else {
                break;
            }
        }
        // return counter value
        return counter;
}
    }