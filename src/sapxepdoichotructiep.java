import java.util.Scanner;

public class sapxepdoichotructiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i = 0; i<n-1; i++) {
            System.out.printf("Buoc %d: ",i+1);
            for(int j = i+1; j<n; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            for(int j = 0; j<n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
