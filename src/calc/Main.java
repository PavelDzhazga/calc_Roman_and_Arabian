package calc;



import java.util.Scanner;

public class Main {


    private static Logic logic = new Logic();

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение: ");

        System.out.println(calc(sc.nextLine()));


    }

    public static String calc(String input) throws Exception {
        return logic.logical(input);
    }
}