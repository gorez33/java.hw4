import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Program to sum values");
        System.out.println("Please enter integer to sum");

        int[] sum1 = new int[5];
        double[] sum2 = new double[3];

        for (int i = 0; i < sum1.length; i++) {
            sum1[i] = i;
            System.out.println(sum1[i]);
        }

        for (int i = 0; i < sum2.length; i++) {
            sum2[i] = i;
            System.out.println(sum2[i]);
        }


        int sum = 0;
        while (true){
            String nextLine = scanner.nextLine();
            if ("q".equals(nextLine)) break;
            sum=sum + Integer.parseInt(nextLine);
            System.out.println("sum ="+ sum);
            System.out.println("Please enter integer to sum press q to finish");
        }

    }
}