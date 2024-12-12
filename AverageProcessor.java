class AverageProcessor implements ArrayDoubleProcessor {
    @Override
    public double process(double[] array) {
        if (array.length == 0) return 0;
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}