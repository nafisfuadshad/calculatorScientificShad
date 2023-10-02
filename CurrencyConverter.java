import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertCurrency("USD", "TRY");
                    break;
                case 2:
                    convertCurrency("TRY", "USD");
                    break;
                case 3:
                    convertCurrency("USD", "VND");
                    break;
                case 4:
                    convertCurrency("VND", "USD");
                    break;
                case 5:
                    convertCurrency("USD", "GBP");
                    break;
                case 6:
                    convertCurrency("GBP", "USD");
                    break;
                case 7:
                    convertCurrency("USD", "SEK");
                    break;
                case 8:
                    convertCurrency("SEK", "USD");
                    break;
                case 9:
                    convertCurrency("USD", "CHF");
                    break;
                case 10:
                    convertCurrency("CHF", "USD");
                    break;
                case 11:
                    convertCurrency("USD", "SAR");
                    break;
                case 12:
                    convertCurrency("SAR", "USD");
                    break;
                case 13:
                    convertCurrency("USD", "ZAR");
                    break;
                case 14:
                    convertCurrency("ZAR", "USD");
                    break;
                case 15:
                    convertCurrency("USD", "NPR");
                    break;
                case 16:
                    convertCurrency("NPR", "USD");
                    break;
                case 17:
                    System.out.println("Exiting Currency Converter. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 17);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("Currency Converter Menu:");
        System.out.println("1. USD to TRY");
        System.out.println("2. TRY to USD");
        System.out.println("3. USD to VND");
        System.out.println("4. VND to USD");
        System.out.println("5. USD to GBP");
        System.out.println("6. GBP to USD");
        System.out.println("7. USD to SEK");
        System.out.println("8. SEK to USD");
        System.out.println("9. USD to CHF");
        System.out.println("10. CHF to USD");
        System.out.println("11. USD to SAR");
        System.out.println("12. SAR to USD");
        System.out.println("13. USD to ZAR");
        System.out.println("14. ZAR to USD");
        System.out.println("15. USD to NPR");
        System.out.println("16. NPR to USD");
        System.out.println("17. Exit");
    }

    private static void convertCurrency(String fromCurrency, String toCurrency) {
        double amount = getAmount(fromCurrency);
        double conversionRate = 1.0;

        if (fromCurrency.equals("USD")) {
            switch (toCurrency) {
                case "TRY":
                    conversionRate = 27.47;
                    break;
                case "VND":
                    conversionRate = 24307.50;
                    break;
                case "GBP":
                    conversionRate = 0.82;
                    break;
                case "SEK":
                    conversionRate = 10.93;
                    break;
                case "CHF":
                    conversionRate = 0.92;
                    break;
                case "SAR":
                    conversionRate = 3.74;
                    break;
                case "ZAR":
                    conversionRate = 18.94;
                    break;
                case "NPR":
                    conversionRate = 133.44;
                    break;
            }
        } else {
            switch (fromCurrency) {
                case "TRY":
                    conversionRate = 1 / 27.47;
                    break;
                case "VND":
                    conversionRate = 1 / 24307.50;
                    break;
                case "GBP":
                    conversionRate = 1 / 0.82;
                    break;
                case "SEK":
                    conversionRate = 1 / 10.93;
                    break;
                case "CHF":
                    conversionRate = 1 / 0.92;
                    break;
                case "SAR":
                    conversionRate = 1 / 3.74;
                    break;
                case "ZAR":
                    conversionRate = 1 / 18.94;
                    break;
                case "NPR":
                    conversionRate = 1 / 133.44;
                    break;
            }
        }

        double convertedAmount = amount * conversionRate;
        System.out.println(amount + " " + fromCurrency + " is equal to " + convertedAmount + " " + toCurrency);
    }

    private static double getAmount(String currencyCode) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + currencyCode + " amount: ");
        return scanner.nextDouble();
    }
}
