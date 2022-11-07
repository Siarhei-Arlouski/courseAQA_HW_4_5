package Tools;

public class Tools implements ToolsCost{
    public void toolsCost() {
        Hammer hammer = new Hammer();
        System.out.println("Tools cost: \n" +
                "Hammer - " + hammer.hammerCost() + " scraps;\n" +
                "");
    }

}