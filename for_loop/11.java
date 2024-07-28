//print number is a amstrong number or not
class Demo {
    public static void main(String[] args) {
        int n = 153;
        int temp1 = n;
        int temp2 = n;
        int count = 0;
        while (temp1 != 0) {
            count++;
            temp1 = temp1 / 10;
        }
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            int mult = 1;
            for (int i = 1; i <= count; i++) {
                mult = mult * rem;
            }
            sum = sum + mult;
            n = n / 10;
        }
        if (temp2 == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}

