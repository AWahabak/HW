package Class_014.HomeWork;

import java.util.Scanner;

/*
Create a method that will say Hello in different language based on the country that will passed when method is executed.
 */
public class HW01_sayHello {

    void sayHello(String country){
        switch (country){
            case "Afghanistan":
                System.out.println("سلام");
                break;
            case "Argentina":
                System.out.println("Hola");
                break;
            case "Armenia":
                System.out.println("Բարեւ");
                break;
            case "Australia":
                System.out.println("Hello");
                break;
            case "Russia":
                System.out.println("привет");
                break;
            case "England":
                System.out.println("Hello");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            case "Germany":
                System.out.println("Hallo");
                break;
            case "Bangladesh":
                System.out.println("হ্যালো");
                break;
            case "Iran":
                System.out.println("سلام");
                break;
            case "Pakistan":
                System.out.println("ہیلو");
                break;
            case "India":
                System.out.println("नमस्ते");
                break;
            case "China":
                System.out.println("你好");
                break;
            case "Japan":
                System.out.println("こんにちは"); break;
            case "Bulgari":
                System.out.println("Здравейте"); break;
            case "Combodia":
                System.out.println("សួស្តី"); break;
            case "Costa Rica":
                System.out.println("Hola"); break;
            case "Turkey":
                System.out.println("Merhaba"); break;
            default:
                System.out.println("The country is not list.");
        }


    }

    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter the cournty name to say hello");
        HW01_sayHello sayHi=new HW01_sayHello();
        sayHi.sayHello(userInput.nextLine());
    }

}
