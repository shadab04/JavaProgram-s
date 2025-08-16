abstract interface Animal {//interface
   void sound();   // abstract method
}
 class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myRegister mr=new myRegister();
        mr.register(myDog);
        //myDog.sound();  // Output: Dog barks
    }
}
class myRegister{
    public void register(Animal z)
    {
        z.sound();
    }
}

