
    interface F{
        void printClassName();
    }
    interface G{
        void printClassName();
    }
    class E implements G,F{
        public void printClassName(){
            System.out.println("class E");
        }
    }
    class B implements F{
        public void printClassName(){
            System.out.println("class B");
        }
    }
    class A extends B{
        public void printClassName(){
            System.out.println("class A");
        }
    }
    class C extends B{
        public void printClassName(){
            System.out.println("class C");
        }
    }
class Main{
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        E e = new E();
        
        a.printClassName();
        b.printClassName();
        c.printClassName();
        e.printClassName();
    }
}

