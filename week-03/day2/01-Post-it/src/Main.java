/* Create a PostIt class that has
        a backgroundColor
        a text on it
        a textColor
        Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!"
*/

public class Main {

    public static void main(String[] args) {
        PostIt postIt1 = new PostIt("orange", "Everything ", "blue");
        PostIt postIt2 = new PostIt("pink", "is ", "black");
        PostIt postIt3 = new PostIt("yellow", "Awesome ", "green");

        System.out.println(postIt1.text + postIt2.text + postIt3.text);
    }
}
