//jagged array
class Array {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5}, {7}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
        }
    }
}

