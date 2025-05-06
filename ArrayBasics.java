import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        //input
        System.out.println("Enter 5 integers:");
        for (int i  = 0 ; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        //output
        System.out.println("You entered:");
        for ( int num : arr){
            System.out.println(num);
        }
    }
}