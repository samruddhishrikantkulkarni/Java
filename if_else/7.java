class IfElseDemo{
  public static void main(String[] args){
    int x=9;
    if(x%3==0){
      System.out.println("fizz");
    }else if(x%5==0){
      System.out.println("buzz");
    }else if(x%3==0 && x%5==0){
      System.out.println("fizz-buzz");
    }
  }
}
