package Tools;

import Resources.Resources;

public class StoneHatchet extends ToolsCostCalculating {
    public double stoneHatchetCost() {
        Resources resources = new Resources(200, 100, 0, 0, 0);

        //return total scrap cost
        return resources.getWood() + resources.getStone() + resources.getMetalFragments() + resources.getMetalPipe() + resources.getMetalBlade();
    }
}