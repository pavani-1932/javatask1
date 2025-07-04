package javaassignment2;

import java.util.Scanner;

public class HotelTariffCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int month = sc.nextInt();
        double roomRentPerDay = sc.nextDouble();
        int numberOfDays = sc.nextInt();

        double tariff;

    
        if ((month >= 4 && month <= 6) || (month == 11 || month == 12)) {
            roomRentPerDay = roomRentPerDay * 1.2; 
        }

        tariff = roomRentPerDay * numberOfDays;

        
        System.out.printf("%.2f", tariff);

        sc.close();
    }
}
