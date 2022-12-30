import java.util.*;
public class pattern2 {
    public static void main(String args[]) {
        int r=0;
        System.out.println("Enter the Size of the Pattern:");
        System.out.print("Row:");
        Scanner obj = new Scanner(System.in);
        r = obj.nextInt();
        System.out.print("Column:");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for(int i = 1; i <= r; i++) {
            for(int j = 1; j <= c; j++) {
                if(i==1||j==1||j==c||i==r) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            
    }
}
System.out.println();
}
}
}
