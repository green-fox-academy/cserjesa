/*
Petrol Station
    Create Station and Car classes
    Station
        gasAmount
        refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
Car
    gasAmount
    capacity
    create constructor for Car where:
        initialize gasAmount -> 0
        initialize capacity -> 100
 */
public class main {
    public static void main(String args[]) {

        Car Skoda = new Car();
        Car Trabant = new Car(5, 30);
        Car Wartburg = new Car(15, 40);
        Car Zaporozsec = new Car(25, 45);
        Station MOL = new Station(2000);
        Station ÖMV = new Station(2200);
        Station AranykezűPistaBácsiMaszekBenzinkútja = new Station(314);

        System.out.println("MOL: " + MOL.gasAmount + "  ÖMV: " + ÖMV.gasAmount + "  Pista Bácsi: "
                + AranykezűPistaBácsiMaszekBenzinkútja.gasAmount);
        System.out.println("Skoda: " + Skoda.gasAmount + "  Trabant: " + Trabant.gasAmount + "  Wartburg: "
                + Wartburg.gasAmount + "  Zaporozsec: " + Zaporozsec.gasAmount);

        ÖMV.refill(Skoda);
        MOL.refill(Trabant);
        AranykezűPistaBácsiMaszekBenzinkútja.refill(Zaporozsec);

        System.out.println("MOL: " + MOL.gasAmount + "  ÖMV: " + ÖMV.gasAmount + "  Pista Bácsi: "
                + AranykezűPistaBácsiMaszekBenzinkútja.gasAmount);
        System.out.println("Skoda: " + Skoda.gasAmount + "  Trabant: " + Trabant.gasAmount + "  Wartburg: "
                + Wartburg.gasAmount + "  Zaporozsec: " + Zaporozsec.gasAmount);

        ÖMV.refill(Skoda);
        MOL.refill(Trabant);
        AranykezűPistaBácsiMaszekBenzinkútja.refill(Zaporozsec);

        System.out.println("MOL: " + MOL.gasAmount + "  ÖMV: " + ÖMV.gasAmount + "  Pista Bácsi: "
                + AranykezűPistaBácsiMaszekBenzinkútja.gasAmount);
        System.out.println("Skoda: " + Skoda.gasAmount + "  Trabant: " + Trabant.gasAmount + "  Wartburg: "
                + Wartburg.gasAmount + "  Zaporozsec: " + Zaporozsec.gasAmount);

        MOL.refill(Wartburg);
        System.out.println("MOL: " + MOL.gasAmount + "  ÖMV: " + ÖMV.gasAmount + "  Pista Bácsi: "
                + AranykezűPistaBácsiMaszekBenzinkútja.gasAmount);
        System.out.println("Skoda: " + Skoda.gasAmount + "  Trabant: " + Trabant.gasAmount + "  Wartburg: "
                + Wartburg.gasAmount + "  Zaporozsec: " + Zaporozsec.gasAmount);
    }
}
