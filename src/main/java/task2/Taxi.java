package task2;

public class Taxi {
    private int tankVolume;
    private int gas;

    public Taxi(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void go(String... city) {
        if (city.length == 0) {
            System.out.println("City is not indicated.");
        } else {
            for (String s : city) {
                if ((this.gas - s.length()) >= 0) {
                    System.out.println("Going to " + s + ".");
                    this.gas -= s.length();
                } else {
                    System.out.println("Not enough gas to get to " + s + ".");
                    break;
                }
            }
        }
    }

    public void printFuelVolume() {
        System.out.println("Fuel in the tank: " + this.gas);
    }

    public void fillUpTheTank(int fuelVolume) {
        if (fuelVolume > 0 && tankVolume >= (gas + fuelVolume)) {
            gas += fuelVolume;
            System.out.println("Adding fuel: " + fuelVolume + ". Fuel in the tank: " + gas + ".");
        } else {
            System.out.println("Wrong fuel volume.");
        }
    }

    public static void main(String[] args) {
        Taxi taxi1 = new Taxi(60); // Creating new car with tank volume = 60 l.
        taxi1.printFuelVolume(); // Checking fuel in the tank at this moment.
        taxi1.fillUpTheTank(6); // Filling up the tank.
        taxi1.go("Minsk"); // Going to Minsk.
        taxi1.printFuelVolume();
        taxi1.go("Moskva");
        taxi1.fillUpTheTank(10);
        taxi1.go("Peter", "Kazan", "Alexandriisk", "Kiev");
        taxi1.printFuelVolume();
        taxi1.go();
    }
}
