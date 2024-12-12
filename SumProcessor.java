class SumProcessor implements ArrayDoubleProcessor {
    @Override
    public double process(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }
}
