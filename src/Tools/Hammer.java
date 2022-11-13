package Tools;

import Resources.Resources;

public class Hammer extends ToolsCostCalculating {
    public double hammerCost() {
        Resources resources = new Resources(100, 0, 0, 0, 0);

        //return total scrap cost
        return resources.getWood() + resources.getStone() + resources.getMetalFragments() + resources.getMetalPipe() + resources.getMetalBlade();
    }
}