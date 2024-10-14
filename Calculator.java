import java.util.*;

public class Calculator{
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNum = inputDevice.nextDouble();
        System.out.println("Enter the second number: ");
        double secondNum = inputDevice.nextDouble();
        System.out.println("Enter the type of operation: +, -, /, *: ");
        String operationType = inputDevice.next();

        if(operationType.equals("+")){
            double result = addNumbers(firstNum, secondNum);
            System.out.println(result);
        } else if(operationType.equals("-")){
            double result = subtractNums(firstNum, secondNum);
            System.out.println(result);
        }else if(operationType.equals("/")){
            double result = divideNums(firstNum, secondNum);
            System.out.println(result);
        }else if(operationType.equals("*")){
            double result = multiplyNums(firstNum, secondNum);
            System.out.println(result);
        }else{
            System.out.println("Invalid operation type!");
        }
    }

    public static double addNumbers(double num1, double num2){
        return num1 + num2;
    }

    public static double subtractNums(double num1, double num2){
        return num1 - num2;
    }

    public static double divideNums(double num1, double num2){
        return num1 / num2;
    }

    public static double multiplyNums(double num1, double num2){
        return num1 * num2;
    }
}
