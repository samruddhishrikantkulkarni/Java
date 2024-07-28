class While {
    public static void main(String[] args) {
        int N = 942111423;
        int i = 1;
        int count = 0;
        while (i <= N) {
            if (i % 2 != 0) {
                count++;
            }
            i++; 
        }
        System.out.println(count); 
    }
}

