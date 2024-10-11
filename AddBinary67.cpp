class Solution {
public:
    string addBinary(string a, string b) {
        
        // length of both the strings
        int aLength = a.length();
        int bLength = b.length();

        // i variable to iterate 
        int i = 0;

        // carry variable initially at 0
        int carry = 0;

        // output string to return
        string result = "";

        // iteration using while loop
        while (i < aLength || i < bLength || carry != 0) {
            // for a value
            int x = 0;

            // a[aLength - i - 1] --> the last index
            if (i < aLength && a[aLength - i - 1] == '1') {

                // if last index is 1 change x to 1
                x = 1;
            }

            // similary for y
            
            int y = 0;
            if (i < bLength and b[bLength - i - 1] == '1') {

                y = 1;
            }

            // coverting the result to toString 
            result = to_string ((x + y + carry) % 2) + result;
            carry = (x + y + carry) / 2;

            // increase index value
            i += 1; 
        }

        // return the final result

        return result;
    }
};