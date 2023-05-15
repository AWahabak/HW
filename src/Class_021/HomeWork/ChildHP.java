package Class_021.HomeWork;

public class ChildHP extends ParentComputer{
    public ChildHP(Boolean isLaptop, Boolean isDesktop, double screenSize, double ramSize, double hardDiskSize, String operatingSystem, double proccessorPower) {
        super(isLaptop, isDesktop, screenSize, ramSize, hardDiskSize, operatingSystem, proccessorPower);
    }
    @Override
    void input(){System.out.println("HP is receiving input");}
    @Override
    void cPU(){System.out.println("HP is processing in CPU");}
    @Override
    void output(){System.out.println("HP is sending output");}
    void hibernate(){System.out.println("HP is hibernating");}
}
