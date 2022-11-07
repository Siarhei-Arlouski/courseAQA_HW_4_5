package Tools;

import Resources.Resources;

public class MetalHatchet extends Tools {
    public double metalHatchetCost() {
        Resources resources = new Resources(100, 0, 75, 0, 0);

        //return total scrap cost
        return resources.getWood() + resources.getStone() + resources.getMetalFragments() + resources.getMetalPipe() + resources.getMetalBlade();
    }
}