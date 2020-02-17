package pasha;

import java.util.Scanner;

public class calculator2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str = getStr();
        int num1 = getInt1();
        int num2 = getInt2();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);

    }

    public static String getStr(){
        System.out.println("Введите пример вида a+b");
        String str = scanner.nextLine();       //ввожу строку и перегоняю ее в char, чтобы посимвольно считать
            char[] chars = str.toCharArray();
        return str;
    }
    public static int getInt1(){
        int num1 = getStr().charAt(1);  //беру из введенной строки 1ый символ (цифра)
        return num1;
    }
    public static int getInt2(){
        int num2 = getStr().charAt(3);  //беру из введенной строки 3ий символ (цифра)
        return num2;
    }
    public static char getOperation(){
        char operation = getStr().charAt(2); //беру из введенной строки 2ой символ (операция)
        return operation;

        // дальше непосредственно калькулякую, в зависимости от 2го символа, но не работает
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }


}
}




