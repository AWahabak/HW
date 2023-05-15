package Class_021.HomeWork;

public class ChildApple extends ParentComputer{
    public ChildApple(Boolean isLaptop, Boolean isDesktop, double screenSize, double ramSize, double hardDiskSize, String operatingSystem, double proccessorPower) {
        super(isLaptop, isDesktop, screenSize, ramSize, hardDiskSize, operatingSystem, proccessorPower);
    }
    @Override
    void input(){System.out.println("Apple is receiving input");}
    @Override
    void cPU(){System.out.println("Apple is processing in CPU");}
    @Override
    void output(){System.out.println("Apple is sending output");}
    void touch(){System.out.println("Apple is touched");}
}
