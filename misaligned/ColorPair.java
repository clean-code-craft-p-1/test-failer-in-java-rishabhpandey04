public class ColorPair {
    
    private int pairNumber;
    private String majorColor;
    private String minorColor;

    ColorPair(int pairNumber, String majorColor, String minorColor) {
        this.pairNumber = pairNumber;
        this.majorColor = majorColor;
        this.minorColor = minorColor;
    }

    public String getMajorColor() {
        return majorColor;
    }

    public String getMinorColor() {
        return minorColor;
    }

    public int getPairNumber() {
        return pairNumber;
    }
}
