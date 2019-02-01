import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class CBFEAST {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalQueries = scanner.nextInt();
        // margin for color
        int k = scanner.nextInt();
        Query[] queries = new Query[totalQueries];

        for (int i = 0; i < totalQueries; i++) {
            int b = scanner.nextInt();
            switch (b) {
                case 3:
                    queries[i] = new Query(b, scanner.nextInt(), -1);
                    break;
                default:
                    queries[i] = new Query(b, scanner.nextInt(), scanner.nextInt());
                    break;
            }
        }

        calculateQuery(queries, k);
    }

    private static void calculateQuery(Query[] queries, int k) {
        LinkedList<Dish> dishLinkedList = new LinkedList<>();
        int sum = 0;
        int previousAnswer = 0;

        for (Query q : queries) {
            int computedColor = q.unComputedColor ^ previousAnswer;
            switch (q.queryType) {
                case 1: // add to front
                    dishLinkedList.addFirst(new Dish(computedColor, q.deliciousness));
                    break;

                case 2: // add to the back
                    dishLinkedList.addLast(new Dish(computedColor, q.deliciousness));
                    break;

                case 3: // remove range of colors
                    int upperRange = computedColor + k;
                    int lowerRange = computedColor - k;

                    if (dishLinkedList.isEmpty()) {
                        sum = 0;
                        System.out.println(sum);
                    } else {
                        Iterator i = dishLinkedList.iterator();
                        while (i.hasNext()) {
                            Dish d = (Dish) i.next();
                            if (d.color <= upperRange && d.color >= lowerRange) {
                                // remove that
                                previousAnswer = d.deliciousness;
                                sum += previousAnswer;
                                i.remove();
                            }
                        }
                        System.out.println(sum);
                    }
                    break;
            }
        }
    }


    static class Dish {
        int color;
        int deliciousness;

        Dish(int c, int d) {
            color = c;
            deliciousness = d;
        }
    }

    static class Query {
        int queryType;
        int unComputedColor;
        int deliciousness;

        Query(int b, int C, int d) {
            queryType = b;
            unComputedColor = C;
            deliciousness = d;
        }
    }
}
