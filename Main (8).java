//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayDoubleProcessor sumProcessor = new SumProcessor();
        ArrayDoubleProcessor averageProcessor = new AverageProcessor();
        GeneralProcessor generalProcessor = new GeneralProcessor();


        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};


        System.out.println("Сума: " + sumProcessor.process(array));
        System.out.println("Середнє значення: " + averageProcessor.process(array));
        System.out.println("Сума (загальний процесор): " + generalProcessor.process(array));
        System.out.println("Середнє (загальний процесор): " + generalProcessor.calculateAverage(array));
    }
}