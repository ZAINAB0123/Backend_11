package Lesson_3;

public class Car {

    String marka;
    String color;
static  int count = 0;

    String carRides(){

        return " машина едет";
    }
    void carStop(){
        System.out.println(" Машина стоит");
    }
    public Car(String marka, String color){
        this.marka = marka;
        this.color = color;
    }
    public Car(){
    }
    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.marka = "BMW";
        bmw.color = "white";
count++;

        Car kia = new Car("Kia","blue");
count++;

        Car mazda = new Car();
        mazda.marka = "Mazda";
        mazda.color = "red";
count++;

        System.out.println("У нас в автопарке есть "+ count +" машины ");
        System.out.print("Сейчас "+ bmw.marka);
        bmw.carStop();
        System.out.println("Сейчас " + kia.marka + kia.carRides());
        System.out.println("Сейчас " + mazda.marka + mazda.carRides());
    }

}
