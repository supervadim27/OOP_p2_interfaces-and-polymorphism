public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars("car1",4);
        Cars car2 = new Cars("car2",4);

        Trucks truck = new Trucks("truck1",6);
        Trucks truck2 = new Trucks("truck2",8);

        Bikes bicycle = new Bikes("bike1",2);
        Bikes bicycle2 = new Bikes("bike2",2);

        Transport[] transports = {
                car1,
                car2,
                truck,
                truck2,
                bicycle,
                bicycle2
        };

        Service station = new Service();

        for (Transport transport : transports) {
            station.check(transport);
        }
    }
}