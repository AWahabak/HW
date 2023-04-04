package Class_006.HomeWork;

import java.util.Scanner;

public class HW6_CountryLanguage {
    public static void main(String[] args) {
        /*
        Ask user to enter their country and capture it.
            Once values are captured print which language user speaks.
        */

        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=userInput.nextLine();

        switch (country) {
            case "United Kingdom","United States","Canada","Australia","New Zealand","Ireland","South Africa","Nigeria":
                System.out.println("You speak English.");
                break;
            case "France","Belgium","Switzerland","Madagascar","Monaco","Haiti","Vanuatu":
                System.out.println("You speak French.");
                break;
            case "Egypt","Sudan","Algeria","Iraq","Morocco","Saudi Arabia","United Arab Emirates","Palestine":
                System.out.println("You speak Arabic.");
                break;
            case "Spain","Colombia","Argentina","Equatorial Guinea","Puerto Rico":
                System.out.println("You speak Spanish.");
                break;
            case "Portugal","Brazil","Mozambique","Angola","East Timor","Macau":
                System.out.println("You speak Portuguese.");
                break;
            case "Germany","Austria","Luxembourg","Liechtenstein":
                System.out.println("You speak German.");
                break;
            case "Russia","Kazakhstan","Belarus","Kyrgyzstan","Tajikistan","Abkhazia","South Ossetia","Transnistria":
                System.out.println("You speak Russian.");
                break;
            case "Democratic Republic of the Congo","Kenya","Rwanda","Tanzania","Uganda":
                System.out.println("You speak Swahili.");
                break;
            case "Serbia","Croatia","Montenegro","Bosnia","Herzegovina","Kosovo":
                System.out.println("You speak Serbo-Croatian."); break;
            case "Italy","San Marino","Vatican City":
                System.out.println("You speak Italian.");
                break;
            case "Malaysia","Indonesia","Singapore","Brunei":
                System.out.println("You speak Malay.");
                break;
            case "Netherlands","Suriname":
                System.out.println("You speak Dutch.");
                break;
            case "Iran","Afghanistan":
                System.out.println("You speak Persian.");
                break;
            case "Lesotho":
                System.out.println("You speak Sotho.");
                break;
            case "Botswana":
                System.out.println("You speak Tswana.");
                break;
            case "Albania","North Macedonia":
                System.out.println("You speak Albanian.");
                break;
            case "China","Taiwan":
                System.out.println("You speak Standard Chinese.");
                break;
            case "Romania","Moldova":
                System.out.println("You speak Romanian.");
                break;
            case "Somalia","Ethiopia","Somaliland":
                System.out.println("You speak Somali.");
                break;
            case "Turkey","Northern Cyprus","Cyprus":
                System.out.println("You speak Turkish.");
                break;
            case "Bolivia","Peru":
                System.out.println("You speak Aymara.");
                break;
            case "Malawi","Zimbabwe":
                System.out.println("You speak Chichewa.");
                break;
            case "Greece":
                System.out.println("You speak Greek.");
                break;
            case "Paraguay":
                System.out.println("You speak Guarani.");
                break;
            case "India", "Fiji":
                System.out.println("You speak Hindustani.");
                break;
            case "Pakistan":
                System.out.println("Your speak Urdu");
                break;
            case "North Korea","South Korea":
                System.out.println("You speak Korean.");
                break;
            case "Burundi":
                System.out.println("You speak Rwanda-Rundi.");
                break;
            case "Eswatini":
                System.out.println("You speak Swati.");
                break;
            case "Sweden","Finland":
                System.out.println("You speak Swedish.");
                break;
            case "Sri Lanka":
                System.out.println("You speak Tamil.");
                break;
            case "Eritrea":
                System.out.println("You speak Tigrinya.");
                break;
            case "Armenia","Artsakh":
                System.out.println("You speak Armenian.");
                break;
            default:
                System.out.println("The country is not listed");
        }

    }
}
