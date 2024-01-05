import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtd1, qtd2, cod1, cod2;
        double price1, price2, total;

        System.out.println("Type the code of the product: ");
        cod1 = sc.nextInt();
        System.out.println("Type the quantity: ");
        qtd1 = sc.nextInt();
        System.out.println("Type the price: ");
        price1 = sc.nextDouble();

        System.out.println("Type the code of the product: ");
        cod2 = sc.nextInt();
        System.out.println("Type the quantity: ");
        qtd2 = sc.nextInt();
        System.out.println("Type the price: ");
        price2 = sc.nextDouble();

        total = (qtd1 * price1) + (qtd2 * price2);

        System.out.printf("You have to pay: U$ %.2f%n", total);
    }
}