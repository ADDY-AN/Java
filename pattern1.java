import java.util.*;
public class pattern1 {
    public static void main(String args[]) {
        int r=0;
        System.out.println("Enter the Size of the Pattern:");
        System.out.print("Row:");
        Scanner obj = new Scanner(System.in);
        r = obj.nextInt();
        System.out.print("Column:");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for(int i = 0; i < c; i++) {
            System.out.print(" ");
            for(int j = 0; j < r; j++) {
                System.out.print("*");
            }
            System.out.println();
    }
}
}
