/*
Create Counter class
which has an integer field value
when creating it should have a default value 0 or we can specify it when creating
we can add(number) to this counter another whole number
or we can add() without parameters just increasing the counter's value by one
and we can get() the current value
also we can reset() the value to the initial value
Check if everything is working fine with the proper test
Download CounterTest.java and place it next to your solution
If something's red in it, ALT+Enter Add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
Then run the tests with the green play button before the lines (run all of them before the classname)
 */

public class Counter {
    int counter;

    Counter() {
        this.counter = 0;
    }

    Counter(int counter) {
        this.counter = counter;
    }

    void add() {
        this.counter++;
    }

    int get() {
        return this.counter;
    }

    void reset() {
        this.counter = 0;
    }

    public static void main(String args[]) {
        Counter c1 = new Counter();
        Counter c2 = new Counter(100);
        System.out.println("c1: " + c1.get());
        System.out.println("c2: " + c2.get());
        c1.add();
        c2.add();
        System.out.println("c1: " + c1.get());
        System.out.println("c2: " + c2.get());
        c1.reset();
        c2.reset();
        System.out.println("c1: " + c1.get());
        System.out.println("c2: " + c2.get());
    }
}