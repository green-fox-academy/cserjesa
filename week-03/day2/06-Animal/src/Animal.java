/*
Create an Animal class
        Every animal has a hunger value, which is a whole number
        Every animal has a thirst value, which is a whole number
          when creating a new animal object these values are created with the default 50 value
        Every animal can eat() which decreases their hunger by one
        Every animal can drink() which decreases their thirst by one
        Every animal can play() which increases both by one
*/

public class Animal {
    public static void main(String[] args) {
        AnimalClass Bodri = new AnimalClass();
        AnimalClass Tappancs = new AnimalClass();
        AnimalClass Fickó = new AnimalClass(60,60);
        Bodri.eat();
        Bodri.eat();
        Bodri.eat();
        Bodri.drink();
        Tappancs.eat();
        Fickó.play();
        Fickó.play();
        System.out.println(Bodri.hunger);
        System.out.println(Bodri.thirst);
        System.out.println(Tappancs.hunger);
        System.out.println(Tappancs.thirst);
        System.out.println(Fickó.hunger);
        System.out.println(Fickó.thirst);
    }
}
