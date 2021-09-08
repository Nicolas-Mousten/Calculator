import java.util.Scanner;

public class Calculator_Main_Menu {
    public static double multi(int num1, int num2){
        double sum = 0;
        sum = num1 * num2;
        return sum;
    }
    public static double divison(int num1, int num2){
        double sum = 0;
        sum = num1 / num2;
        return sum;
    }
    public static double add(int num1, int num2){
        double sum = 0;
        sum = num1 + num2;
        return sum;
    }
    public static double sub(int num1, int num2) {
        double sum = 0;
        sum = num1 - num2;
        return sum;
    }
    public static void main(String[] args) {
        double sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose 2 whole numbers to calculate");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Choose what operation to use by their icons");
        String operations = scanner.nextLine();
        if(operations=="*"){
            sum = multi(num1,num2);
            System.out.println(sum);
        }
        else if(operations=="/"){
            sum = divison(num1,num2);
            System.out.println(sum);
        }
        else if(operations=="+"){
            sum = add(num1,num2);
            System.out.println(sum);
        }
        else if(operations=="-"){
            sum = sub(num1,num2);
            System.out.println(sum);
        }
    }
}
