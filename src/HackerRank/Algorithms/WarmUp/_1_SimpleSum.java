package HackerRank.Algorithms.WarmUp;

import java.util.Scanner;

public class _1_SimpleSum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a here");
        int a = scanner.nextInt();

        System.out.println("Enter value of b here");
        int b = scanner.nextInt();

        int result = sum(a,b);
        System.out.println(a + " + " + b + " = " + result);

        scanner.close();
    }

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
