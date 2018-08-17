import java.util.ArrayList;

public class SharpieSet {
    //List name;
    //Sharpie member;
    ArrayList<Sharpie> list = new ArrayList<Sharpie>();


    SharpieSet(Sharpie member) {
        this.list = list;
    }

    void add(Sharpie member) {
        this.list.add(member);
    }

    int countUsable() {
        int usable = 0;
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).usable == true) {
                System.out.println("i: " + i);
                System.out.println(this.list.get(i).usable);
                usable++;
                System.out.println("Usable: " + usable);
            }
        }
        return usable;
    }
}
