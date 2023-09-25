public class RomanToInteger {
    class Solution {
        public String intToRoman(int num) {
            int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
            String[] romanSymbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < values.length; i++) {
                while (num >= values[i]) {
                    result.append(romanSymbols[i]);
                    num -= values[i];
                }
            }

            return result.toString();
        }
    }

    public static void main(String args[]) {
        int num = 1000;
        RomanToInteger romanConverter = new RomanToInteger();
        Solution sol = romanConverter.new Solution();
        String roman = sol.intToRoman(num);
        System.out.println(roman);
    }
}