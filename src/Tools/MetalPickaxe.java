package Tools;

import Resources.Resources;

public class MetalPickaxe extends Tools {
    public double metalPickaxeCost() {
        Resources resources = new Resources(100, 0, 125, 0, 0);

        //return total scrap cost
        return resources.getWood() + resources.getStone() + resources.getMetalFragments() + resources.getMetalPipe() + resources.getMetalBlade();
    }
}