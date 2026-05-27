import java.util.Scanner;

public class TamGiac {
    public static String classify(int a, int b, int c) {
        if (!isValidSide(a) || !isValidSide(b) || !isValidSide(c)) {
            return "Invalid Input";
        }
        if (!(a + b > c && a + c > b && b + c > a)) {
            return "Not a Triangle";
        }
        if (a == b && b == c) {
            return "Equilateral";
        }
        if (a == b || b == c || a == c) {
            return "Isosceles";
        }
        return "Scalene";
    }
    private static boolean isValidSide(int x) {
        return x >= 1 && x <= 100;
    }
    public static void main(String[] args) {
        Integer a = null, b = null, c = null;
        if (args != null && args.length == 3) {
            try {
                a = Integer.parseInt(args[0].trim());
                b = Integer.parseInt(args[1].trim());
                c = Integer.parseInt(args[2].trim());
            } catch (NumberFormatException ex) {
                System.out.println("Invalid Input");
                return;
            }
        } else {
            Scanner sc = new Scanner(System.in);
            try {
                if (sc.hasNext()) a = Integer.parseInt(sc.next().trim());
                if (sc.hasNext()) b = Integer.parseInt(sc.next().trim());
                if (sc.hasNext()) c = Integer.parseInt(sc.next().trim());
            } catch (Exception ex) {
                System.out.println("Invalid Input");
                return;
            } finally {
                sc.close();
            }
        }
        if (a == null || b == null || c == null) {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println(classify(a, b, c));
    }
}
