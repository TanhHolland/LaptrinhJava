import java.util.Scanner;

public class sapxepchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i = 0; i<n; i++) {
            int j = i-1;
            int temp = a[i];
            while(j >= 0 && a[j] > temp) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
            System.out.print("Buoc " + i + ": ");
            for(int k = 0; k <=i; k++)
                System.out.print(a[k] + " ");
            System.out.println();
        }
    }
}
// 5 7 3 2
