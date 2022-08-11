import java.util.Scanner;
public class Alan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi, r, a, alan;

        System.out.println("yarı çapı giriniz");
        r = input.nextDouble();

        System.out.println("dilim açısını giriniz");
        a = input.nextDouble();
        pi=3.14;
        alan = (pi*(r*r)*a)/360;
        System.out.println(alan);
    }
}
