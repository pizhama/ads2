import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scn.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(scn.nextInt());
            }
            lines.add(line);
        }

        int q = scn.nextInt();
        ArrayList<String> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int x = scn.nextInt();
            int y = scn.nextInt();

            if (x >= 1 && x <= n) {
                ArrayList<Integer> line = lines.get(x - 1);

                if (y >= 1 && y <= line.size()) {
                    queries.add("" + line.get(y - 1));
                } else {
                    queries.add("ERROR!");
                }
            } else {
                queries.add("ERROR!");
            }
        }

        for (int i = 0; i < q; i++) {
            System.out.println(queries.get(i));
        }

        scn.close();
    }
}