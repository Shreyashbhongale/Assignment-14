import java.util.Scanner;

public class Que2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("put String = ");
        String u = sc.nextLine();
        try {
            if (!u.equals("India")) {
                throw new NoMatchException("String must be India"  );
            }
            System.out.println("matched");
        } catch (NoMatchException e) {
            System.err.println(e.getMessage()); 
    }
    }
    }

class NoMatchException extends Exception {

    public NoMatchException(String m) {
        super(m); 
}
}