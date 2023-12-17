import java.util.Scanner;

public class Que1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Put no = ");
        String line = sc.nextLine();
        String[] t = line.split("\\s+"); 
        boolean dup = false;
        int[] n = new int[t.length];

        for (int i = 0; i < t.length; i++) {
         try {
                n[i] = Integer.parseInt(t[i]); 
            } catch (NumberFormatException e) {
                System.err.println("invalid  = " + t[i]);
                return;
    }  
                    for (int j = 0; j < i; j++) { 
                        if (n[i] == n[j]) {
                        dup = true;
                        break;
    }
        }
            if (dup) {
                System.err.println("duplicate no " + n[i]);
                break;
            }
        }
        if (!dup) {
            System.out.println("duplicates not found");
        }
    }
}