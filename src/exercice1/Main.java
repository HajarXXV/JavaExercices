package exercice1;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static int effectuerOperation(int a, int b, operation op){
        return op.calculer(a,b);
    }

    public static void main(String[] args) {
        operation addition = (x, y) -> x + y;
        operation soustraction = (x, y) -> x - y;
        operation multiplication = (x, y) -> x * y;
        operation division = (x, y) -> {
            if (y != 0) return x / y;
            else throw new ArithmeticException("Cannot divide by zero!");
        };

        Map<Integer, operation> map = Map.of(
                1, addition,
                2, soustraction,
                3, multiplication,
                4, division
        );

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scan.nextInt();
        System.out.println("Enter second number: ");
        int b = scan.nextInt();
        System.out.println("choose the operation: ");
        int op;
        do {
            System.out.println("1: addition\n2: soustraction\n3: multiplication\n4: division");
            op = scan.nextInt();
        } while (op < 1 || op > 4);

        operation operationChoice = map.get(op);

        try {
            System.out.println("Result = " + effectuerOperation(a, b, operationChoice));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

//    if(op == 1) {
//        System.out.println(a + "+" + b + " = " + effectuerOperation(a, b, addition));
//    }else if(op == 2) {
//        System.out.println(a + "-" + b + " = " + effectuerOperation(a, b, soustraction));
//    }else if(op == 3) {
//        System.out.println(a + "*" + b + " = " + effectuerOperation(a, b, multiplication));
//    }else if(op == 4) {
//        try{
//            System.out.println(a + "/" + b + " = " + effectuerOperation(a, b, division));
//        }catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//
//    }

    }
}

