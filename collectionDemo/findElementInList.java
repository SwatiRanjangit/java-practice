package collectionDemo;
import java.util.*;


 class FindElementInList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter elements (enter '-1' to finish):");
        while (true) {
            int input = s.nextInt();
            if (input == -1) {
                break;
            } else {
                list.add(input);
            }
        }

        System.out.println("Enter the element to be searched: ");
        int ele = s.nextInt();
        int index = list.indexOf(ele);
        if (index != -1) {
            System.out.println("Element found at index " + index + ".");
        } else {
            System.out.println("Element not found in the list.");
        }
    }
}
