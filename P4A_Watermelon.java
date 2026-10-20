import java.util.*;

public class P4A_Watermelon {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        // Read the input weight
        int w = obj.nextInt();
        
        // Checking if the weight is even and greater than 2
        if (w % 2 == 0 && w > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
