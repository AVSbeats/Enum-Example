public class CarDemo {
    public static void main(String[] args) {

        Car firstCar = new Car(2014, Model.MINIVAN, Color.BLUE);
        Car secondCar = new Car(2017, Model.CONVERTIBLE, Color.RED);

        System.out.println();
        firstCar.display();

        System.out.println();
        secondCar.display();

        System.out.println();
    }
}
