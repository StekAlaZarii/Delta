import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.print("Równanie kwadratowe ma postać: ");
        System.out.println("Ax^2+Bx+C");
        System.out.println("Podaj jego parametry: ");
        System.out.println();

        System.out.print("A = ");
        Scanner skaner = new Scanner(System.in);
        int a = skaner.nextInt();

        System.out.print("B = ");
        int b = skaner.nextInt();

        System.out.print("C = ");
        int c = skaner.nextInt();
        skaner.close();
        System.out.println();

        double delta;
        double d;
        double x, x0, x1, x2, Re, Im;

        delta = Math.pow(b, 2.0) - (4.0 * a * c);
        d = Math.sqrt(delta);

        if (a == 0) {
            System.out.println("Równanie liniowe!");

            if (b == 0) {
                if (b == c) {
                    System.out.println("Równanie tożsamościowe");
                    System.out.println("Nieskończenie wiele rozwiązań!");
                } else {
                    System.out.println("Równanie sprzeczne");
                    System.out.println("Brak rozwiązań!");
                }
            } else {
                x = -(c / b);
                System.out.println("Rozwiązanie x = " + x);
            }
        } else {
            if (delta < 0) {
                System.out.println("Rozwiązania to: ");

                Re = (-b / (2.0 * a));
                Im = Math.sqrt(-delta) / (2.0 * a);

                System.out.println("x1 = " + Re + " + " + "i" + Im);
                System.out.println("x2 = " + Re + " - " + "i" + Im);
            } else {
                if (delta == 0) {
                    x0 = -(b / (2.0 * a));
                    System.out.println("Rozwiązanie x0 = " + x0);
                } else {
                    x1 = (-b + d) / (2.0 * a);
                    x2 = (-b - d) / (2.0 * a);
                    System.out.println("Rozwiązania to: ");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }
            }
        }
    }
}
