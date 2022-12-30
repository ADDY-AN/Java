import java.util.*;
public class IO_OP {
    public static void main(String[] args){
        System.out.println("Enter the number of player");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the name of the player");
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        System.out.println(name +" "+n);

    }
    
}
