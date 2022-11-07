package Tools;

public class Tools implements ToolsCost{
    public void toolsCost() {
        Hammer hammer = new Hammer();
        StoneHatchet stoneHatchet = new StoneHatchet();
        StonePickaxe stonePickaxe = new StonePickaxe();
        MetalHatchet metalHatchet = new MetalHatchet();
        MetalPickaxe metalPickaxe = new MetalPickaxe();
        SalvagedHammer salvagedHammer = new SalvagedHammer();
        SalvagedAxe salvagedAxe = new SalvagedAxe();
        SalvagedIcepick salvagedIcepick = new SalvagedIcepick();
        System.out.println("TOOLS COST: \n" +
                "Hammer - " + hammer.hammerCost() + " scraps;\n" +
                "Stone Hatchet - " + stoneHatchet.stoneHatchetCost() + " scraps;\n" +
                "Stone Pickaxe - " + stonePickaxe.stonePickaxeCost() + " scraps;\n" +
                "Metal Hatchet - " + metalHatchet.metalHatchetCost() + " scraps;\n" +
                "Metal Pickaxe - " + metalPickaxe.metalPickaxeCost() + " scraps;\n" +
                "Salvaged Hammer - " + salvagedHammer.salvagedHammerCost() + " scraps;\n" +
                "Salvaged Axe - " + salvagedAxe.salvagedAxeCost() + " scraps;\n" +
                "Salvaged Icepick - " + salvagedIcepick.salvagedIcepickCost() + " scraps.");
    }
}