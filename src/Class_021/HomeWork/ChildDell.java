package Class_021.HomeWork;

public class ChildDell extends ParentComputer {
    public ChildDell(Boolean isLaptop, Boolean isDesktop, double screenSize, double ramSize, double hardDiskSize, String operatingSystem, double proccessorPower) {
        super(isLaptop, isDesktop, screenSize, ramSize, hardDiskSize, operatingSystem, proccessorPower);
    }
    @Override
    void input(){System.out.println("Dell is receiving input");}
    @Override
    void cPU(){System.out.println("Dell is processing in CPU");}
    @Override
    void output(){System.out.println("Dell is sending output");}
    void restore(){System.out.println("Dell is restoring the system");}
}