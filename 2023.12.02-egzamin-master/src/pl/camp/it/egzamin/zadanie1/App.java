package pl.camp.it.egzamin.zadanie1;

public class App {
    public static void main(String[] args) {
        fruits3(1, 10, 5);
        fruits3(10, 1, 5);
        fruits3(10, 1, 50);

    }

    public static void fruits1(int apples, int oranges, int coins) {
        int diff = apples - oranges;
        if(diff < 0) {
            diff = -diff;
        }

        if(diff > coins) {
            if(oranges > apples) {
                apples = apples + coins;
            } else {
                oranges = oranges + coins;
            }
        } else {
            int sum = oranges + apples + coins;
            if(sum % 2 == 0) {
                oranges = sum/2;
                apples = sum/2;
            } else {
                oranges = sum/2;
                apples = sum/2 + 1;
            }
        }

        System.out.println(oranges);
        System.out.println(apples);
        System.out.println(Math.abs(oranges - apples));
    }

    public static void fruits2(int apples, int oranges, int coins) {
        while (coins > 0) {
            if(apples > oranges) {
                oranges++;
            } else {
                apples++;
            }
            coins--;
        }
        System.out.println(oranges);
        System.out.println(apples);
        System.out.println(Math.abs(oranges - apples));
    }

    public static void fruits3(int apples, int oranges, int coins) {
        if(coins == 0) {
            System.out.println(oranges);
            System.out.println(apples);
            System.out.println(Math.abs(oranges - apples));
            return;
        }
        if(apples > oranges) {
            fruits3(apples, ++oranges, --coins);
        } else {
            fruits3(++apples, oranges, --coins);
        }
    }
}
