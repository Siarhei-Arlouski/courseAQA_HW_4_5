package Tools;

import Resources.Resources;

public class StonePickaxe extends ToolsCostCalculating {
    public double stonePickaxeCost() {
        Resources resources = new Resources(200, 100, 0, 0, 0);

        //return total scrap cost
        return resources.getWood() + resources.getStone() + resources.getMetalFragments() + resources.getMetalPipe() + resources.getMetalBlade();
    }
}