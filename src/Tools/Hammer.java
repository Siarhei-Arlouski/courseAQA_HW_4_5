package Tools;
import Resources.*;

public class Hammer extends Tools {
    public double hammerCost() {
        Resources resources = new Resources(100, 0, 0, 0, 0);

        //return total scrap cost
        return resources.getWood() + resources.getStone() + resources.getMetalFragments() + resources.getMetalPipe() + resources.getMetalBlade();
    }
}
