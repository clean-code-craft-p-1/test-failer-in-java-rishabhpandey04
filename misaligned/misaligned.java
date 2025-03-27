import java.util.ArrayList;
import java.util.List;

public class Misaligned {

    private static final String majorColors[] = { "White", "Red", "Black", "Yellow", "Violet" };
    private static final String minorColors[] = { "Blue", "Orange", "Green", "Brown", "Slate" };

    static List<ColorPair> getColorPairs() {
        List<ColorPair> colorPair = new ArrayList<ColorPair>();
        int i = 0, j = 0;
        for (i = 0; i < majorColors.length; i++) {
            for (j = 0; j < minorColors.length; j++) {
                colorPair.add(new ColorPair(i * 5 + j, majorColors[i], minorColors[j]));
            }
        }
        return colorPair;
    }

    static void printColorMap() {
        List<ColorPair> colorPair = getColorPairs();
        for (ColorPair color : colorPair) {
            System.out.printf("%-2d | %-6s | %s\n", color.getPairNumber(), color.getMajorColor(),
                    color.getMinorColor());
        }
    }

    public static void main(String[] args) {
        printColorMap();
        assert (getColorPairs().size() == 25);
        System.out.println("All is well (maybe!)");
    }
}
