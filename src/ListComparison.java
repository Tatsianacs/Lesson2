import java.util.*;

public class ListComparison {

    public static ArrayList<Integer> createArrayList() {
        ArrayList<Integer> collection = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            collection.add(generatedRandomInt());
        }
        return collection;
    }

    public static LinkedList<Integer> createLinkedList() {
        LinkedList<Integer> collection = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            collection.add(generatedRandomInt());
        }
        return collection;
    }

    private static int generatedRandomInt() {
        return new Random().nextInt(100);
    }

    public static long getTimeToAddToArrayList(ArrayList<Integer> arrList) {

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrList.add(generatedRandomInt());
        }
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public static long getTimeToAddTLinkedList(LinkedList<Integer> linkedList) {

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(generatedRandomInt());
        }
        long endTime = System.nanoTime();

        return endTime - startTime;
    }


    public static long getTimeToRemoveFromArrayList(ArrayList<Integer> arrList) {
        Iterator itr = arrList.iterator();
        int i = 1000;
        long startTime = System.nanoTime();
        while (itr.hasNext() && i > 0) {
            Integer val = (Integer)itr.next();
            itr.remove();
            i--;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;

    }

    public static long getTimeToRemoveFromLinkedList(LinkedList<Integer> linkedList) {
        Iterator itr = linkedList.iterator();
        int i = 1000;
        long startTime = System.nanoTime();
        while (itr.hasNext() && i > 0) {
            Integer val = (Integer)itr.next();
            itr.remove();
            i--;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;

    }

    public static long getTimeToSearchFromArrayList(ArrayList<Integer> arrList) {
        int i = 1000;
        long startTime = System.nanoTime();
        while (i > 0) {
            int searchValue = generatedRandomInt();
            for (int val : arrList) {
                if (val == searchValue) {
                    break;
                }
            }
            i--;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long getTimeToSearchFromLinkedList(LinkedList<Integer> linkedList) {
        int i = 1000;
        long startTime = System.nanoTime();
        while (i > 0) {
            int searchValue = generatedRandomInt();
            for (int val : linkedList) {
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
