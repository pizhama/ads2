import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        LinkedList<Integer> shelf = new LinkedList<>();

        ArrayList<Integer> removedElem = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int operation = scn.nextInt();
            int diskNumber;

            switch (operation) {
                case 1: // Place disk from the left edge
                    diskNumber = scn.nextInt();
                    shelf.addFirst(diskNumber);
                    break;
                case 2: // Place disk from the right edge
                    diskNumber = scn.nextInt();
                    shelf.addLast(diskNumber);
                    break;
                case 3: // Remove disk from the left edge
                    removedElem.add(shelf.removeFirst());
                    break;
                case 4: // Remove disk from the right edge
                    removedElem.add(shelf.removeLast());
                    break;
                default:
                    break;
            }
        }

        for(int element : removedElem) {
            System.out.print(element + " ");
        }

        scn.close();
    }
}