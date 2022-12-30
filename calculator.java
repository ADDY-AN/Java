import java.util.*;
public class calculator {
    public static void main(String args[]) {
        System.out.println("Calculator for Addition & Subtraction:-");
        System.out.println("No. of Variables:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]= new int[n];
        String b[] = new String[n];
        System.out.println("Calculate:");
        for(int i=0;i<n;i++)
        {
            int c=i+1;
            System.out.println(c+" "+"Value:");
            Scanner obj = new Scanner(System.in);
            a[i]=obj.nextInt();
            if(i<n-1){
            System.out.println(c+" "+"Operand:");
            Scanner z =new Scanner(System.in);
            b[i] = z.nextLine();
            }
            else{
                b[i]="=";
            }
        }
            int ans=a[0];
    for(int j=0;j<n;j++){
        switch (b[j]) {
            case "+":
                ans = ans+a[j+1];
                break;
            case "-":
                ans = ans-a[j+1];
                break;
            case "=":
                break;
            default:
            System.out.println("Invalid Input");
                break;
        }
        
    
        }
        System.out.println("Your Answer is:"+ ans);

    }
    
}
