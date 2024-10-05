class Solution {
    public int romanToInt(String s) {
        int result = 0;

        //Set up hashmap

        Map <Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i = 0; i < s.length(); i++) {
            // Check for the letters if it's I X C
            if(s.charAt(i) == 'I') {    
                // If it's the last letter, just end it.
                if(i == s.length() - 1) {
                    result += 1;
                }
                else if(s.charAt(i+1) == 'V') {
                    result += 4;
                    i++;
                }
                else if(s.charAt(i+1) == 'X') {
                     result += 9;
                    i++;
                }
                else {
                    result += 1;
                }
                continue;
            } 
            else if(s.charAt(i) == 'X') {
                 // If it's the last letter, just end it.
                if(i == s.length() - 1) {
                    result += 10;
                }
                else if(s.charAt(i+1) == 'L') {
                    result += 40;
                    i++;
                }
                else if(s.charAt(i+1) == 'C') {
                     result += 90;
                    i++;
                }
                else {
                    result += 10;
                }
                continue;

            } 
            else if(s.charAt(i) == 'C') {   
                 // If it's the last letter, just end it.
                if(i == s.length() - 1) {
                    result += 100;
                }
                else if(s.charAt(i+1) == 'D') {
                    result += 400;
                    i++;
                }
                else if(s.charAt(i+1) == 'M') {
                     result += 900;
                    i++;
                }
                else {
                    result += 100;
                }
                continue;
            } 

            // Now check if it's simply a normal letter
            else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
	
}