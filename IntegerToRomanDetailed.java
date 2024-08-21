public class IntegerToRomanDetailed {
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder roman = new StringBuilder();
        
        // Iterate through the values and symbols
        for (int i = 0; i < values.length; i++) {
            System.out.println("Checking symbol: " + symbols[i] + " with value: " + values[i]);
            while (num >= values[i]) {
                // Append the corresponding Roman numeral
                roman.append(symbols[i]);
                System.out.println("Appending: " + symbols[i]);
                
                // Subtract the value from num
                num -= values[i];
                System.out.println("Subtracting value: " + values[i] + ", Remaining number: " + num);
            }
        }
        
        System.out.println("Final Roman numeral: " + roman.toString());
        return roman.toString();
    }
    
    public static void main(String[] args) {
        System.out.println("Input: 3749");
        System.out.println("Output: " + intToRoman(3749)); // Output: MMMDCCXLIX
    }
}
