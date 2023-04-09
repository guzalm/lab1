import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the  n: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = findMinFromArr(arr, n);
        System.out.println("minimum in the array: " + min);
        double findAvg = findAvFromArr(arr);
        System.out.println("avg of all elements is: " + findAvg);
        boolean prime = checkPrime(n);
        System.out.println(prime);
        int findFac = factorial(n);
        System.out.println("factorial of n: " + findFac);
        int findFib= fibonacci(n);
        System.out.println(" n-th element in Fibonacci sequence is: " + findFib);
        int findSqrt = sqrt(a, n);
        System.out.println("a^n: " + findSqrt);
        int[] reversedArr = reverse(arr, n);
        System.out.print("Reversed array: ");
        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }
        Scanner sca = new Scanner(System.in);
        System.out.print("\n"+"Enter a string to check is all consists of digits: ");
        String s = sca.nextLine();
        boolean isAllDigits = isAllDigits(s);
        if (isAllDigits) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        int binomial = findBinCoeff(a, n);System.out.println(binomial);







    }

    public static int findMinFromArr(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        else {
            int min = findMinFromArr(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }

    public static double findAvFromArr(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = 0;
        average = sum / arr.length;
        return average;
    }

    public static boolean checkPrime(int n) {
        {
            boolean isprime=true;


            if (n < 2)
                System.out.println("Number needs to be more than 1");
            else if (n == 2)
                System.out.println("2 is a Prime number");
            else {
                for (int divisor = 2; divisor <= (n / 2); divisor++) {
                    if ((n % divisor) == 0) {
                        isprime=false;
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
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int result = (int) (n * factorial(n - 1));
            return result;
        }
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int sqrt(int a, int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= a;
        }
        return res;
    }
    public static int[] reverse(int arr[], int n) {
        int[] reversedArr = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - 1 - i];
        }
        return reversedArr;
    }

    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int findBinCoeff(int a, int n) {
        if (n == 0 || n == a) {
        return 1;    } else {
        int binomial = findBinCoeff(a - 1, n - 1) + findBinCoeff(a - 1, n);
        return binomial;
    }
    }


}










