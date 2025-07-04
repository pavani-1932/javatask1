package javaassignment2;

import java.util.Scanner;

public class HotelTariffCalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        int month = scanner.nextInt();
        double roomRentPerDay = scanner.nextDouble();
        int numberOfDays = scanner.nextInt();

        // Use switch to check peak season
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                roomRentPerDay = roomRentPerDay * 1.2; // Increase by 20%
                break;
            default:
                // Off-season: no change
                break;
        }

        double tariff = roomRentPerDay * numberOfDays;

        System.out.printf("%.2f", tariff);

        scanner.close();

	}

}
