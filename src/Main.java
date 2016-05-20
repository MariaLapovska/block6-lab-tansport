import com.epam.track.Track;
import com.epam.vehicles.Color;
import com.epam.vehicles.Movable;
import com.epam.vehicles.PassengerCar;
import com.epam.vehicles.Truck;
import com.epam.vehicles.Motorcycle;
import com.epam.vehicles.Bicycle;

/**
 * Created by Asus on 20.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Track track = new Track(25);

        Movable car = new PassengerCar(70, 700, "Lada", "AA2345BC", Color.BLACK);
        Movable truck = new Truck(100, 7000, "AMD", "AA8285BC", Color.GREEN);
        Movable motorcycle = new Motorcycle(200, 500, "Yamaha", "NA1135", Color.ORANGE);
        Movable motorcycle1 = new Motorcycle(300, 400, "Yamaha", "NB1135", Color.GREEN);
        Movable bicycle = new Bicycle("Ardis", Color.PINK);

        System.out.println(car);
        System.out.println(truck);
        System.out.println(motorcycle);
        System.out.println(motorcycle1);
        System.out.println(bicycle);

        car.move(track);
        truck.move(track);
        motorcycle.move(track);
        motorcycle1.move(track);
        bicycle.move(track);

        System.out.println(track.findVehiclesByModel("Yamaha", Motorcycle.class));
        System.out.println(track.findVehicleByNumPlate("NA1135", Motorcycle.class));
    }
}
