package Class_017.HomeWork;
/*  HW02
    Write a java class that have 4 constructors
        with 4 different access levels of constructors(private,public,default,protected)
        and create 4 objects of this class:
            1 - inside same class;
            2 - from outside the class;
            3 - from different class
                    inside different package
                        and observe result.
 */
//HW02 data example is based on construction companies who build houses, blocks and buildings
public class Constructors {
        String nameConstructor, lasNameConstructor, companyName, workScope;
        int yearlyIncome, yearIstablished;

    // Constructor 1 with private access
    private Constructors(String nameConstructor, String lasNameConstructor, String companyName, int yearlyIncome, int yearIstablished, String workScope) {
        this.nameConstructor = nameConstructor;
        this.lasNameConstructor = lasNameConstructor;
        this.companyName = companyName;
        this.yearlyIncome = yearlyIncome;
        this.yearIstablished = yearIstablished;
        this.workScope = workScope;
        System.out.println("Private constructors sample object");
    }
    // Constructor 2 with public access
    public Constructors(String nameConstructor, String lasNameConstructor, String companyName, int yearIstablished, String workScope) {
        this.nameConstructor = nameConstructor;
        this.lasNameConstructor = lasNameConstructor;
        this.companyName = companyName;
        this.yearIstablished = yearIstablished;
        this.workScope = workScope;
        System.out.println("Public constructors sample object");
    }
    // Constructor 3 with default access
    Constructors(String nameConstructor, String companyName, String workScope) {
        this.nameConstructor = nameConstructor;
        this.companyName = companyName;
        this.workScope = workScope;
        System.out.println("Default constructors sample object");
    }
    // Constructor 4 with protected access
    protected Constructors(String lasNameConstructor, String companyName, int yearlyIncome, int yearIstablished) {
        this.nameConstructor = nameConstructor;
        this.lasNameConstructor = lasNameConstructor;
        this.companyName = companyName;
        this.yearlyIncome = yearlyIncome;
        this.yearIstablished = yearIstablished;
        System.out.println("Protected constructors sample object");
    }
    // Acess within same class
    public static void main(String[] args) {
        //accessing private
        Constructors constPrivate = new Constructors("Tom","Logan","LoganBuilders",50000000, 1992, "MegaBuilders");
        //accessing public
        Constructors constPublic = new Constructors("Tom","Logan","LoganBuilders",1992, "MegaBuilders");
        //accessing default
        Constructors constDefault = new Constructors("Tom", "LoganBuilders", "MegaBuilders");
        //accessing protected
        Constructors constProtected = new Constructors("Logan", "LoganBuilders", 50000000, 1992);
        /* output
        All the constructors are accessible from this class
         */
    }
}
