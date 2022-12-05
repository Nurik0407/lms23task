import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 2);
            arrayList.add(i, random.nextInt(0, 2));
            linkedList.add(i, random.nextInt(0, 2));
        }

        System.out.println("Before sorting " + Arrays.toString(array));
        System.out.println("Before sorting " + arrayList);
        System.out.println("Before sorting " + linkedList);
        System.out.println("=====================================\n" +
                "=====================================");
        System.out.print("After sorting: ");
        sort(array);
        System.out.print("\nAfter sorting: ");
        sort(arrayList);
        System.out.print("\nAfter sorting: ");
        sort(linkedList);


    }


    public static void sort(int[] array) {
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void sort(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
    }

    public static void sort(LinkedList<Integer> linkedList) {
        Collections.sort(linkedList);
        for (Integer integer : linkedList) {
            System.out.print(integer + " ");
        }
    }
}