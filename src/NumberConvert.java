public class NumberConvert {
    public String ArabToRoman(int number) {
        int[] romanValue = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanChar = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < romanValue.length; i++) {
            while (number >= romanValue[i]){
                number -= romanValue[i];
                result.append(romanChar[i]);
            }
        }
        return result.toString();
    }
}
