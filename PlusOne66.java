class Solution {
    public int[] plusOne(int[] digits) {
        
        // length of array
        int length = digits.length;

        // loop from last digit to the the first
        for (int i = length-1; i >= 0; i--) {

            // if last element is less than 9 just add 1
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }

            // if it is not less than 9
            // only one case that is 9 like {1,9}

            // set the digit as 0
            digits[i] = 0;

            // loop will run again to change the previous number
        }

        // if the array is somethig like {9} 
        // we need to take new array with size length+1

        int [] newArray = new int [length+1];

        // the first index should be 1
        newArray[0] = 1;

        //return the new array
        return newArray;
    }
}