import java.util.*;

public class ListComparison {

    public static ArrayList<Integer> createArrayList() {
        ArrayList<Integer> collection = new ArrayList<>();
        createRequiredList(collection);
        return collection;
    }

    public static LinkedList<Integer> createLinkedList() {
        LinkedList<Integer> collection = new LinkedList<>();
        createRequiredList(collection);
        return collection;
    }

    private static List<Integer> createRequiredList(List<Integer> list) {
        for (int i = 0; i < 10000000; i++) {
            list.add(generatedRandomInt());
        }
        return list;
    }

    private static int generatedRandomInt() {
        return new Random().nextInt(100);
    }

    public static long getTimeToAddToArrayList(ArrayList<Integer> arrList) {
        return getTimeToAddToList(arrList);
    }

    public static long getTimeToAddToLinkedList(LinkedList<Integer> linkedList) {
        return getTimeToAddToList(linkedList);
    }

    private static long getTimeToAddToList(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.add(generatedRandomInt());
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long getTimeToRemoveFromArrayList(ArrayList<Integer> arrList) {
        return getTimeToRemoveFromList(arrList);
    }

    public static long getTimeToRemoveFromLinkedList(LinkedList<Integer> linkedList) {
        return getTimeToRemoveFromList(linkedList);
    }

    private static long getTimeToRemoveFromList(List<Integer> list) {
        Iterator itr = list.iterator();
        int i = 1000;
        long startTime = System.nanoTime();
        while (itr.hasNext() && i > 0) {
            Integer val = (Integer) itr.next();
            itr.remove();
            i--;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long getTimeToSearchFromArrayList(ArrayList<Integer> arrList) {
        return getTimeToSearchFromList(arrList);
    }

    public static long getTimeToSearchFromLinkedList(LinkedList<Integer> linkedList) {
        return getTimeToSearchFromList(linkedList);
    }

    private static long getTimeToSearchFromList(List<Integer> list) {
        int i = 1000;
        long startTime = System.nanoTime();
        while (i > 0) {
            int searchValue = generatedRandomInt();
            for (int val : list) {
                if (val == searchValue) {
                    break;
                }
            }
            i--;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
