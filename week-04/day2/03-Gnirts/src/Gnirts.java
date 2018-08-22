import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
    private String aString;

    public Gnirts(String aString) {
        this.aString = aString;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        char[] ca = aString.toCharArray();
        return ca[ca.length-index-1];
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
