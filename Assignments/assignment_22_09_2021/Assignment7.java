// Assignment 7 : Identify the vehicle based on features and characteristics

package assignment_22_09_2021;

import java.util.Scanner;

class Vehicle {
    void features() {
        System.out.println("This is a vehicle");
    }
}

class TwoWheeler extends Vehicle {
    int wheels, doors;

    TwoWheeler() {
        wheels = 2;
        doors = 0;
    }

    void features() {
        System.out.println("This is a Bike, hence it has " + wheels + " wheels and " + doors + " doors");
    }
}

class Harley extends TwoWheeler {
    Harley() {
        super();
    }

    void features() {
        super.features();
        System.out.println("This is Harvey Motocycle with 1000cc engine");
    }
}

class Pulsar extends TwoWheeler {
    Pulsar() {
        super();
    }

    void features() {
        super.features();
        System.out.println("This is Bajaj Pulsar Bike with 200cc engine");
    }
}

class FourWheeler extends Vehicle {
    int wheels, doors;

    FourWheeler() {
        wheels = 4;
        doors = 4;
    }

    void features() {
        System.out.println("This is a Car, hence it has " + wheels + " wheels and " + doors + " doors");
    }
}

class Maruti extends FourWheeler {
    Maruti() {
        super();
    }

    void features() {
        super.features();
        System.out.println("This is Maruti Car with 800cc engine");
    }
}

class Ferrari extends FourWheeler {
    Ferrari() {
        super();
    }

    void features() {
        super.features();
        System.out.println("This is Ferari car with 3000cc engine");
    }
}

class Hyundai extends FourWheeler {
    Hyundai() {
        super();
    }

    void features() {
        super.features();
        System.out.println("This is Hyundai car with 1500cc engine");
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the vehicle");
        String vehicle = sc.nextLine();
        if (vehicle.equals("harley")) {
            Harley harley = new Harley();
            harley.features();
        } else if (vehicle.equals("pulsar")) {
            Pulsar pulsar = new Pulsar();
            pulsar.features();
        } else if (vehicle.equals("maruti")) {
            Maruti maruti = new Maruti();
            maruti.features();
        } else if (vehicle.equals("ferrari")) {
            Ferrari ferrari = new Ferrari();
            ferrari.features();
        } else if (vehicle.equals("hyundai")) {
            Hyundai hyundai = new Hyundai();
            hyundai.features();
        }
        sc.close();
    }
}
