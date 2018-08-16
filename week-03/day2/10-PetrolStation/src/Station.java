public class Station {
    int gasAmount;

    Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    void refill(Car i) {
        this.gasAmount = gasAmount - i.capacity + i.gasAmount;
        i.gasAmount = i.capacity;
    }
}
