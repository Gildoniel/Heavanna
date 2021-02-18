public class TraitRange {
    private final int min;
    private final int max;
    private final int value;

    TraitRange(int min, int max, int value) {
        this.min = min;
        this.max = max;
        this.value = value;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getValue() {
        return value;
    }
}
