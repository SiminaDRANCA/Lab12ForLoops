public class LogicalOp {
    public void showEmAll(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void negativeShowEmAll(int number) {
        for (int i = number; i > -101; i--) {
            System.out.println(i);
        }
    }

    public void countingInBetween(int first, int second) {
        for (int i = first; i <= second; i++) {
            System.out.println(i);
        }
    }

    public void increasingCounting(int first, int second) {
        for (int i = first; i <= second; i++) {
            System.out.println(i);
        }

        for (int j = second; j <= first; j++) {
            System.out.println(j);
        }
    }

    public void increasingEvens() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void increasingOdds() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public int sumItAll(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public float Average(int number) {
        float sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
            count++;
        }
        return sum / count;
    }

    public void downwardTrianglePattern(int row) {
        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}