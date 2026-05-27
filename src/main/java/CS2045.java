import java.util.Scanner;

public class CS2045 {
    public static String eval(int age, double income, int score, char emp) {
        if (!okAge(age) || !okIncome(income) || !okScore(score) || !okEmp(emp)) {
            return "Invalid Input";
        }
        int r = risk(score);
        if (r == 0) {
            return "REJECT";
        }
        if (income < 15.0) {
            if (emp == 'F' || r == 1) {
                return "REJECT";
            }
            return "MANUAL REVIEW";
        }
        if (emp == 'C') {
            return "APPROVE";
        }
        return "MANUAL REVIEW";
    }
    public static String decide(int age, double income, int creditScore, char employment) {
        return eval(age, income, creditScore, employment);
    }
    private static boolean okAge(int age) {
        return age >= 18 && age <= 65;
    }
    private static boolean okIncome(double income) {
        if (Double.isNaN(income) || Double.isInfinite(income)) return false;
        if (income < 5.0 || income > 500.0) return false;
        double s = income * 10.0;
        double r = Math.rint(s);
        return Math.abs(s - r) < 1e-9;
    }
    private static boolean okScore(int score) {
        return score >= 300 && score <= 850;
    }
    private static boolean okEmp(char emp) {
        return emp == 'C' || emp == 'F';
    }
    private static int risk(int score) {
        if (score <= 500) return 0;
        if (score <= 700) return 1;
        return 2;
    }
    public static void main(String[] args) {
        Integer age = null;
        Double income = null;
        Integer creditScore = null;
        Character employment = null;
        if (args != null && args.length == 4) {
            try {
                age = Integer.parseInt(args[0].trim());
                income = Double.parseDouble(args[1].trim());
                creditScore = Integer.parseInt(args[2].trim());
                String e = args[3].trim();
                employment = e.isEmpty() ? null : e.charAt(0);
            } catch (Exception ex) {
                System.out.println("Invalid Input");
                return;
            }
        } else {
            Scanner sc = new Scanner(System.in);
            try {
                if (sc.hasNext()) age = Integer.parseInt(sc.next().trim());
                if (sc.hasNext()) income = Double.parseDouble(sc.next().trim());
                if (sc.hasNext()) creditScore = Integer.parseInt(sc.next().trim());
                if (sc.hasNext()) {
                    String e = sc.next().trim();
                    employment = e.isEmpty() ? null : e.charAt(0);
                }
            } catch (Exception ex) {
                System.out.println("Invalid Input");
                return;
            } finally {
                sc.close();
            }
        }
        if (age == null || income == null || creditScore == null || employment == null) {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println(eval(age, income, creditScore, employment));
    }
}
