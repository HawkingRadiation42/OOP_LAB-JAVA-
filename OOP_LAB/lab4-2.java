class Sports{
    String getname (){
        return "generic sports";
    }
    void getnumberofteammembers(){
        System.out.println("each team has n players in " + getname());
    }
}
class Soccer extends Sports{
    @Override
    String getname(){
        return "soccer class";
    }
    @Override
    void getnumberofteammembers(){
        System.out.println("each team has 11 players in " + getname());
    }
}
class Main{
    public static void main(String[] args){
        Soccer s = new Soccer();
        Sports sp = new Sports();
        System.out.println("Generic Sports:");
        sp.getnumberofteammembers();
        System.out.println("Soccer Sports:");
        s.getnumberofteammembers();
        
    }
}





