import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = findMinFromArr(arr, n);

        System.out.println("minimum in the array" + min);
        double findAvg = findAvFromArr(arr, n);
        System.out.println("avg of all elements is" + findAvg);
        boolean prime = checkPrime(arr, n);
        System.out.println(prime);
    }

    public static int findMinFromArr(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        else {
            int min = findMinFromArr(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }


    public static double findAvFromArr(int[] arr, int n) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = 0;
        average = sum / arr.length;
        return average;
    }

    public static boolean checkPrime(int[] arr, int n) {
        boolean isprime = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = input.nextInt();
        input.close();

        if (n < 1)
            System.out.println("Number needs to be more than 1");
        else if (n == 1)
            System.out.println("1 is neither Prime nor Composite");
        else {
            for (int divisor = 2; divisor <= (n / 2); divisor++) {
                if ((n % divisor) == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime)
                System.out.printf("%d is a Prime number", n);
            else
                System.out.printf("%d is a Composite number", n);


        }


        return isprime;
    }
}
