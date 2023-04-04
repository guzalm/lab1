import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        int[] arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        int min = findMinFromArr(arr, n);

        System.out.println(min);
        double findAvg = findAvFromArr(arr, n);
        System.out.println(findAvg);
    }

    public static int findMinFromArr(int[] arr, int n){
        if(n==1)
            return arr[0];
        else {
            int min = findMinFromArr(arr, n-1);
            return Math.min(min, arr[n-1]);
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





}
