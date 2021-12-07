class A{
    void print(){
        System.out.println("class A");
    }
    void print(int a){
        System.out.println("class A~" + a);
    }
}
class B extends A{
    void print(){
        System.out.println("class B");
        super.print();
    }
}
class C extends B{
    void print(){
        System.out.println("class C");
    }
}
class Main{
    public static void main(String args[]){
        A obj = new A();
        obj.print();
        obj.print(10);
        B b = new B();
        C c = new C();
        b.print();
        c.print();
    }
}

