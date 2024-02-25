public class Main {
    public static void main(String[] args) {
Vehicle bicycle1 = new Bicycle("Scott", 2);
Vehicle bicycle2 = new Bicycle("Cube", 2);
Vehicle car1 = new Car("Bugatti", 4);
Vehicle car2 = new Car("BMW", 4);
Truck truck1 = new Truck("Renault", 6);
Truck truck2 = new Truck("Krone", 6);

ServiceStation serviceStation = new ServiceStation();
serviceStation.check(bicycle1);
serviceStation.check(bicycle2);
serviceStation.check(car1);
serviceStation.check(car2);
serviceStation.check(truck1);
serviceStation.check(truck2);
    }
}