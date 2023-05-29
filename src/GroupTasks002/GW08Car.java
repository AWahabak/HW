package GroupTasks002;
/*
8. Create a Class Car that would have the following fields:
carPrice and color and method calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck.
The Truck class has a field as weight and has its own implementation of calculateSalePrice() method
in which returned price is calculated as following:
if weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
 */
public abstract class GW08Car {
    double price;
    String color;

    public GW08Car(double price, String color) {
        this.price = price;
        this.color = color;
    }
    abstract double calculateSalePrice();
}
class Sedan extends GW08Car{
    double length;
    public Sedan(double price, String color, double length) {
        super(price, color);
        this.length = length;
    }
    @Override
    double calculateSalePrice(){
        if(length>20){
            price = price-(price*0.05);
        } else {
            price = price-(price*0.01);
        }
        return price;
    }
}
class Truck extends GW08Car{
    double weight;
    public Truck(double price, String color, double weight) {
        super(price, color);
        this.weight = weight;
    }
    @Override
    double calculateSalePrice(){
        if(weight>2000){
            price = price - (price*0.1);
        } else {
            price = price - (price*0.2);
        }
        return price;
    }
}
class CarTester{
    public static void main(String[] args) {
        Sedan sedanCar = new Sedan(89400,"Black",14.7);
        double sedanDiscountedPrice = sedanCar.calculateSalePrice();
        System.out.println("Sedan's discounted price is: "+sedanDiscountedPrice);

        Truck truckCar = new Truck(132000.00,"Grey",4300);
        double truckDisccountedPrice = truckCar.calculateSalePrice();
        System.out.println("Truck's discounted price is: "+truckDisccountedPrice);
    }
}