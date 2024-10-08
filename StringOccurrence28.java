class Solution {
    public int strStr(String haystack, String needle) {
        
        // return -1 is needle is empty
        if (needle.isEmpty()) {
            return -1;
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        // return -1 if needle is larger then the haystack

        if (needleLength > haystackLength) {
            return -1;
        }

        for (int i = 0; i <= haystackLength - needleLength; i++) {

            // using substring() method of String class

            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}