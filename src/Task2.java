import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        int Q = scanner.nextInt();

        for (int i = 0; i < Q; i++) {
            String operation = scanner.next();
            if (operation.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                insertElement(list, x, y);
            } else if (operation.equals("Delete")) {
                int x = scanner.nextInt();
                deleteElement(list, x);
            }
        }

        for (int element : list) {
            System.out.print(element + " ");
        }

        scanner.close();
    }

    private static void insertElement(List<Integer> list, int x, int y) {
        list.add(x, y);
    }

    private static void deleteElement(List<Integer> list, int x) {
        list.remove(x);
    }
}