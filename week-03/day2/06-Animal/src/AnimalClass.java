public class AnimalClass {
    int hunger;
    int thirst;

    AnimalClass(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }

    AnimalClass() {
        this.hunger = hunger = 50;
        this.thirst = thirst = 50;
    }

    void eat() {
        hunger--;
    }

    void drink() {
        thirst--;
    }

    void play() {
        hunger++;
        thirst++;
    }
}