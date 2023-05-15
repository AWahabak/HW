package Class_021.HomeWork;

public class ParentComputer {
    Boolean isLaptop;
    Boolean isDesktop;
    double screenSize;
    double ramSize;
    double hardDiskSize;
    String operatingSystem;
    double proccessorPower;

    public ParentComputer(Boolean isLaptop, Boolean isDesktop, double screenSize, double ramSize, double hardDiskSize, String operatingSystem, double proccessorPower) {
        this.isLaptop = isLaptop;
        this.isDesktop = isDesktop;
        this.screenSize = screenSize;
        this.ramSize = ramSize;
        this.hardDiskSize = hardDiskSize;
        this.operatingSystem = operatingSystem;
        this.proccessorPower = proccessorPower;
    }
    void input(){System.out.println("Computer is recieving input");}
    void cPU(){System.out.println("Computer is processing in CPU");}
    void output(){System.out.println("Computer is sending output");}

}
