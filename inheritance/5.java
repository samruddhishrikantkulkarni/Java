//inheriatnce
class Parent{
        Parent(){
		System.out.println(this);
                System.out.println("In Parent Constructor");
        }
        void parentProperty(){
                System.out.println("Flat,Car,Gold");
        }
}
class Child extends Parent{
        Child(){
		System.out.println(this);
                System.out.println("In Child Constructor");
        }
}
class Client{
        public static void main(String[] args){
                Child obj=new Child();
		System.out.println(obj);
                obj.parentProperty();
        }
}
