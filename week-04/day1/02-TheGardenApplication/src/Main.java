import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<Plants> plantsList;

    public static void main(String[] args) {
        plantsList = Arrays.asList(
                new Flower("yellow"),
                new Flower("blue"),
                new Tree("purple"),
                new Tree("orange")
        );
        getGardenStatus();
        gardenWatering(40);
        getGardenStatus();
        gardenWatering(70);
        getGardenStatus();
    }

    private static void getGardenStatus() {
        for (Plants plant : plantsList) {
            System.out.println(plant.getPlantStatus());
        }
        System.out.println();
    }

    private static void gardenWatering(int wateringAmount) {
        System.out.println("Watering with " + wateringAmount);
        double waterPerPlant = wateringAmount / (double) numberOfThirstyPlants();
        for (Plants plant : plantsList) {
            plant.plantWatering(waterPerPlant);
        }
    }

    private static int numberOfThirstyPlants() {
        int thirstyPlants = 0;
        for (Plants plant : plantsList) {
            if (plant.needsWater()) {
                thirstyPlants++;
            }
        }
        return thirstyPlants;
    }
}