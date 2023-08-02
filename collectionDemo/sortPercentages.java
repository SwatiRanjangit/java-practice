package collectionDemo;
import java.util.*;


public class sortPercentages {
    public static void main(String[] args) {
        List<Double> percentages = new ArrayList<>();
        percentages.add(42.5);
        percentages.add(10.26);
        percentages.add(28.67);
        percentages.add(100.0);
        percentages.add(45.76);
        percentages.add(96.89);
        percentages.add(75.56);

        Collections.sort(percentages);
        System.out.println("Soted list in Ascending Order: "+percentages);
        }
}
