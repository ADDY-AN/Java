import java.util.*;
public class conditional {
    public static void main(String args[]) {
        System.out.println("Enter the number to be checked:");
        int a=0;
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        if(a%2==0){
            System.out.println("Even");
    }
        else{
            System.out.println("Odd");
        }
    }
}
