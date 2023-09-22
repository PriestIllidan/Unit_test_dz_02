public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "XC-60", 2012);
        car1.testDrive();
        System.out.println(car1.getSpeed());
        Motocycle motocycle1 = new Motocycle("Honda", "BRZ", 2015);
        motocycle1.testDrive();
        System.out.println(motocycle1.getSpeed());
    }
}
