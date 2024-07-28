class While{
    public static void main(String[] args){
        int num = 135;
        int multiply = 1;
        while(num != 0){ 
            int digit = num % 10; 
            multiply *= digit; 
            num= num/ 10; 
        }
        System.out.println(multiply);
    }
}

