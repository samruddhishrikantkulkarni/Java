//nested for loop
class NestedDemo {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                if (j % 2 != 0) {
                    System.out.print(n * n);
                } else {
                    System.out.print((n + 1) * (n + 1));
                    n++;
                }
            }
            System.out.println();
        }
    }
}

