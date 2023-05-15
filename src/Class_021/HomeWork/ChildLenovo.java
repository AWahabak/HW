package Class_021.HomeWork;

public class ChildLenovo extends ParentComputer{
    public ChildLenovo(Boolean isLaptop, Boolean isDesktop, double screenSize, double ramSize, double hardDiskSize, String operatingSystem, double proccessorPower) {
        super(isLaptop, isDesktop, screenSize, ramSize, hardDiskSize, operatingSystem, proccessorPower);
    }
    @Override
    void input(){System.out.println("Lenovo is receiving input");}
    @Override
    void cPU(){System.out.println("Lenovo is processing in CPU");}
    @Override
    void output(){System.out.println("Lenovo is sending output");}
    void PowerSave(){System.out.println("Lenovo is saving power");}
}
