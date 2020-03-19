import java.util.Scanner;

public class moneyChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao tien so tien USD can chuyen doi qua VND");
        double moneyusd = scanner.nextDouble();
        double rate = 23000;
        double moneyvnd = moneyusd*rate;
        System.out.println("so tien chuyen doi la: "+moneyvnd+" VND");
    }
}
