class A{
    int age;
    void print(){
        System.out.println("class A");
    }
}
class B extends A{
    String name;
    void print(){
        System.out.println("class B");
    }
}   
class Main{
    public static void main(String args []){
        A a = new B();
        B b = (B)a;
        a.age = 19;
        b.name = "shrey khandelwal";
        a.print();
        System.out.println(b.name);
        System.out.println(b.age);
        b.print();
    }
}



