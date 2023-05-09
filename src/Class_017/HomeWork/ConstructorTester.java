package Class_017.HomeWork;

public class ConstructorTester {
    public static void main(String[] args) {
        //accessing private...
        //Constructors constPrivate = new Constructors("Tom","Logan","LoganBuilders",50000000, 1992, "MegaBuilders");
        // access failed due to having private access

        //accessing public
        Constructors constPublic = new Constructors("Tom","Logan","LoganBuilders",1992, "MegaBuilders");
        //accessing default
        Constructors constDefault = new Constructors("Tom", "LoganBuilders", "MegaBuilders");
        //accessing protected
        Constructors constProtected = new Constructors("Logan", "LoganBuilders", 50000000, 1992);
        /* output
        Except private, the rest of constructors are accessible from other class within the same package
         */

    }
}
