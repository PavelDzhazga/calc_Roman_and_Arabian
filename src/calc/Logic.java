package calc;

import java.util.Arrays;
import java.util.List;

public class Logic extends Operarion {


    RomanNumerals romanNumerals =  new RomanNumerals();

    public String logical(String input) throws Exception {

        //Делю строку по пробелам
        List<String> arrStr = Arrays.asList(input.split(" "));

        // Проверка что элементов в выражении не больше трёх
        if (arrStr.size() != 3) {
            throw new Exception("Строка не является математической операцией, либо формат математической операции " +
                    "не удовлетворяет заданию - два операнда и один оператор (+, -, /, *) ");
        }

        // Присваиваем переменным значение из массива для  проверки на арабские  числа
        String arabStr1 = arrStr.get(0);
        String arabStr2 = arrStr.get(2);
        String operator = arrStr.get(1);

        //Проверка на арабское число, если нет то проверка на римское число, иначе ошибка
        if (romanNumerals.ArabOrNot(arabStr1) && romanNumerals.ArabOrNot(arabStr2)) {
            int num1 = romanNumerals.formatToArab(arabStr1);
            int num2 = romanNumerals.formatToArab(arabStr2);

            correcrNumbers(num1, num2);
            operandBoo(operator);
            String rezArab = signChek(num1, num2, operator);
            if (Integer.parseInt(rezArab) < 1) {
                throw new Exception("ERROR! В римской системе нет отрицательных чисел");
            }
            return romanNumerals.formatToRoman(Integer.parseInt(rezArab));

        } else if (!romanNumerals.ArabOrNot(arabStr1) && !romanNumerals.ArabOrNot(arabStr2)) {
            // Присваиваем переменным значение из массива
            int a = Integer.parseInt(arrStr.get(0));
            int b = Integer.parseInt(arrStr.get(2));
            correcrNumbers(a, b);
            operandBoo(operator);
            return signChek(a, b, operator);
        } else
            throw new Exception("ERROR! Используются одновременно разные системы счисления");


    }

    // Проверка что числа от 1 до 10 включительно
    public boolean correcrNumbers(int a, int b) {
        if (!(a >=1 && a <= 10)) {
            try {
                throw new Exception("ERROR! Числа должны быть от 1 до 10 включительно!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (!(b >= 1 && b <= 10)) {
            try {
                throw new Exception("ERROR! Числа должны быть от 1 до 10 включительно!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else return true;
    }


    //Проверка на знак и вывод соответствующего метода из класса Operation.
    public String signChek(int a, int b, String sign){
        int rezult = 0;

        if (sign.equals("+")) {
            return String.valueOf(addition(a, b));
        } else if (sign.equals("-")) {
            return String.valueOf(rezult = subtraction(a, b));
        } else if (sign.equals("*")) {
            return String.valueOf(rezult = multiplication(a, b));
        } else if (sign.equals("/")) {
            return String.valueOf(rezult = division(a, b));
        } else System.out.println("Error! Не корректный арифметический знак действия");
        return String.valueOf(rezult);
    }

    //Проверка оператора (+, -, /, *)
    public boolean operandBoo(String operand) {
        if (operand.equals("+")) {
            return true;
        } else if (operand.equals("-")) {
            return true;
        } else if (operand.equals("*")) {
            return true;
        } else if (operand.equals("/")) {
            return true;
        } else return false;
    }

}
