//Print identityhashcode
class Array {
    void fun(int[] arr) {
        arr[1] = 7000;
        arr[2] = 8000;
    }

    public static void main(String[] args) {
        int arr[] = {1000, 2000, 3000, 4000, 5000};
        int x = 7000;
        int y = 8000;
        
        System.out.println(System.identityHashCode(arr[0]));
        System.out.println(System.identityHashCode(arr[1]));
        System.out.println(System.identityHashCode(arr[2]));
        System.out.println(System.identityHashCode(arr[3]));
        
        Array obj = new Array();
        obj.fun(arr);
        
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        
        for (int val : arr) {
            System.out.println(val);
        }
    }
}

