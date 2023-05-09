package Class_017.HomeWork.AccessPkg;

import Class_017.HomeWork.Constructors;

public class OtherPackageTester {
    public static void main(String[] args) {
        //accessing private...
//      Constructors constPrivate = new Constructors("Tom","Logan","LoganBuilders",50000000, 1992, "MegaBuilders");
        //access failed due to having private access

        //accessing public...
        Constructors constPublic = new Constructors("Tom","Logan","LoganBuilders",1992, "MegaBuilders");
        //access succeed due to constructor having public access

        //accessing default...
//      Constructors constDefault = new Constructors("Tom", "LoganBuilders", "MegaBuilders");
        //access failed due to not having public access, and it is inaccessible from outside of package

        //accessing protected...
//      Constructors constProtected = new Constructors("Logan", "LoganBuilders", 50000000, 1992);
        //access faild due to having protected access, and it is inaccessbile from outside of package
    }
}
