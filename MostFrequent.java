import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 2, 3, 4, 1, 3, 2, 4, 4, 4);
        int mostFrequentNumber = findMostFrequentNumber(numbers);
        System.out.println("The number that repeats the most is: " +
                mostFrequentNumber);
    }

    public static int findMostFrequentNumber(List<Integer> numbers) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        int maxCount = Collections.max(frequencyMap.values());
        int mostFrequentNumber = Integer.MIN_VALUE;

        for (int number : frequencyMap.keySet()) {
            if (frequencyMap.get(number) == maxCount && number > mostFrequentNumber) {
                mostFrequentNumber = number;
            }
        }

        return mostFrequentNumber;
    }
}