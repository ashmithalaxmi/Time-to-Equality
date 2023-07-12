import java.util.Scanner;

public class TimeToEquality {
    public static int findEquality(int n, int[] arr){
        int max = Integer.MIN_VALUE, equality = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<max){
                equality += max-arr[i];
            }
        }
        return equality;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int equality = findEquality(n, arr);
        System.out.println(equality);
    }
}
