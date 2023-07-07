package calc;




public class RomanNumerals extends Operarion{

    //Массив арабских строк
     String[] arabNum = new String[] {
            "0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
            "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",
            "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
            "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
            "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII",
            "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV",
            "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
            "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
            "XCVIII", "XCIX", "C"
    };

     //Преобразование в арабские
    public int formatToArab(String roman) {
        for (int i = 0; i < arabNum.length; i++) {
            if (roman.equals(arabNum[i])) {
                return i;
            }
        }
        return Integer.parseInt("Error! Такого числа не сужествует");
    }
    //Преобразование в римские
    public String formatToRoman(int arab) {
        return arabNum[arab];
    }

    //Проверка арабские или нет
    public boolean ArabOrNot(String arab) {
        for (int i = 0; i < arabNum.length; i++) {
            if (arab.equals(arabNum[i])) {
                return true;
            }
        }
        return false;
    }
}
