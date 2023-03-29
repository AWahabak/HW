package Class_004.HomeWork;

import java.util.Scanner;

public class HW_004_CityWithTemperature {
    public static void main(String[] args) {
        Scanner inputter=new Scanner(System.in);
        System.out.println("Enter City");
        String city=inputter.nextLine(); //more than one word city name compatible
        System.out.println("Enter temperature in fahrenheit");
        int temperatureF=inputter.nextInt();
        //formula for temperature conversion from F to C => (32°F − 32) × 5/9 = °C
        int temperatureC=(temperatureF-32)*5/9;
        System.out.println("The temperature is "+temperatureC+" celsius and the city is "+city+".");
    }
}
