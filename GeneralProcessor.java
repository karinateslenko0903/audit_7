class GeneralProcessor implements ArrayDoubleProcessor {
    @Override
    public double process(double[] array) {
        return java.util.Arrays.stream(array).sum();
    }

    public double calculateAverage(double[] array) {
        return array.length == 0 ? 0 : java.util.Arrays.stream(array).average().orElse(0);
    }
}