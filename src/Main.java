public class Main {
    public static void main(String[] args) {
        int purchasePrice;
        final double salesTax = 0.05;
        System.out.println("Your sales tax will be 5%");
        purchasePrice = 10;
        double finalPrice = purchasePrice + (purchasePrice * salesTax);
        System.out.println("With a purchase of $" +  purchasePrice + "... Your final price will be $" + finalPrice);
    }
}
