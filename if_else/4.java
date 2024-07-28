class IfElseDemo{
   public static void main(String[] args){
    float x=98.9f;
    if(x>98.6f){
       System.out.println("High");
    }else if(98.0f<=x && x<=98.6f){
      System.out.println("Normal");
    }else if(x<98.0f){
      System.out.println("Low");
    }
  }
}
