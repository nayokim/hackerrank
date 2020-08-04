//When a subclass inherits from a superclass, it also inherits its methods; however, it can also override the superclass methods (as well as declare and implement new ones). Consider the following Sports class:

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    //Note: When overriding a method, you should precede it with the @Override annotation. The parameter(s) and return type of an overridden method must be exactly the same as those of the method inherited from the supertype.
    @Override
    String getName(){
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}
public class MethodOverridingExampleI {
    public static void main(String[] args) {
        Soccer s1 = new Soccer();
        System.out.println(s1.getName());
        s1.getNumberOfTeamMembers();
        Sports s2 = new Sports();
        System.out.println(s2.getName());
        s2.getNumberOfTeamMembers();

    }
}
