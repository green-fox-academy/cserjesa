import java.util.stream.IntStream;

public class Shifter implements CharSequence {
    private String aString;
    private int shift;

    public Shifter(String aString, int shift) {
        this.aString = aString;
        this.shift = shift;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        char[] ca = aString.toCharArray();
        return ca[index + shift];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }
}
