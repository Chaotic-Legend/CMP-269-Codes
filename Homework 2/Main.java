// CMP 269: Programming Methods III - Homework 2 - @author Isaac D. Hoyos

public class Main {
    public static void main(String[] args) {
        // =========================
        // ArrayPoweredList Test
        // =========================
        System.out.println("=== ArrayPoweredList Test ===");
        ArrayPoweredList<Integer> intList = new ArrayPoweredList<>();
        intList.add(5);
        intList.add(10);
        intList.add(15, 1);

        System.out.println("Integer list after adding elements:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("  Index " + i + ": " + intList.get(i));
        }

        System.out.println("\nRemove element at index 1: " + intList.remove(1));
        System.out.println("List After Removal:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("  Index " + i + ": " + intList.get(i));
        }

        intList.replace(100, 0);
        System.out.println("\nAfter replacing index 0 with 100:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("  Index " + i + ": " + intList.get(i));
        }

        // =========================
        // StatisticsCalculator Test
        // =========================
        System.out.println("\n=== StatisticsCalculator Test ===");
        StatisticsCalculator<Double> stats = new StatisticsCalculator<>();
        stats.enter(10.0);
        stats.enter(20.0);
        stats.enter(30.0);
        stats.enter(40.0, 1);

        System.out.println("Data In StatisticsCalculator:");
        Object[] data = stats.getData();
        for (int i = 0; i < data.length; i++) {
            System.out.println("  Index " + i + ": " + data[i]);
        }

        System.out.println("\nStatistics:");
        System.out.println("  Sum: " + stats.getSum());
        System.out.println("  Mean: " + stats.getMean());
        System.out.println("  Standard Deviation: " + stats.getStandardDeviation());
        System.out.println("  Min: " + stats.getMin());
        System.out.println("  Max: " + stats.getMax());
        System.out.println("  Range: " + stats.getRange());

        stats.remove(2);
        System.out.println("\nAfter Removing Index 2:");
        data = stats.getData();
        for (int i = 0; i < data.length; i++) {
            System.out.println("  Index " + i + ": " + data[i]);
        }
        stats.clear();
        System.out.println("\n=== After Clear ===");
        System.out.println("Is StatisticsCalculator Empty? ➞ " + stats.isEmpty());
    }
}
