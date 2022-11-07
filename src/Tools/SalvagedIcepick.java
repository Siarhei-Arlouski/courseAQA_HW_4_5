package Tools;

import Resources.Resources;

public class SalvagedIcepick extends Tools {
    public double salvagedIcepickCost() {
        Resources resources = new Resources(0, 0, 0, 1, 5);

        //return total scrap cost
        return resources.getWood() + resources.getStone() + resources.getMetalFragments() + resources.getMetalPipe() + resources.getMetalBlade();
    }
}