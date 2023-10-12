
public class clock {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String x, y, z;
        System.out.println("Enter 24 hour time");
        x = scan.next();
        y = x.substring(0,2);z = x.substring(2,4);
        int h = Integer.parseInt(y);
        int min = Integer.parseInt(z);
        if (h<0 || h>23) {
            System.out.println("What are you on, metric time?");
        }
        if (min<0 || min>59) {
            System.out.println("What are you on, metric time?");
        }
        else if (h<5) {
            System.out.println("Your're up late!");
        }
        else if (h<12) {
            System.out.println("Good morning!");
        }
        else if (h<17) {
            System.out.println("Good afternoon!");
        }
        else {
            System.out.println("Good Evening!");
        }
            System.out.println(h);
        System.out.println(min);
    }
}
