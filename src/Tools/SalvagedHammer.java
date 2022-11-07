package Tools;

import Resources.Resources;

public class SalvagedHammer extends Tools {
    public double salvagedHammerCost() {
        Resources resources = new Resources(0, 0, 50, 1, 0);

        //return total scrap cost
        return resources.getWood() + resources.getStone() + resources.getMetalFragments() + resources.getMetalPipe() + resources.getMetalBlade();
    }
}