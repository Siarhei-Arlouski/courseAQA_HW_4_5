package Tools;

public class ToolsCostCalculating implements ToolsCostCalculatingInterface {
    @Override
    public void toolsCost() {
        Hammer hammer = new Hammer();
        StoneHatchet stoneHatchet = new StoneHatchet();
        StonePickaxe stonePickaxe = new StonePickaxe();
        MetalHatchet metalHatchet = new MetalHatchet();
        MetalPickaxe metalPickaxe = new MetalPickaxe();
        SalvagedHammer salvagedHammer = new SalvagedHammer();
        SalvagedAxe salvagedAxe = new SalvagedAxe();
        SalvagedIcepick salvagedIcepick = new SalvagedIcepick();
        System.out.println("Tools Cost: \n\n" +
                "1. Hammer - " + hammer.hammerCost() + " scraps;\n" +
                "2. Stone Hatchet - " + stoneHatchet.stoneHatchetCost() + " scraps;\n" +
                "3. Stone Pickaxe - " + stonePickaxe.stonePickaxeCost() + " scraps;\n" +
                "4. Metal Hatchet - " + metalHatchet.metalHatchetCost() + " scraps;\n" +
                "5. Metal Pickaxe - " + metalPickaxe.metalPickaxeCost() + " scraps;\n" +
                "6. Salvaged Hammer - " + salvagedHammer.salvagedHammerCost() + " scraps;\n" +
                "7. Salvaged Axe - " + salvagedAxe.salvagedAxeCost() + " scraps;\n" +
                "8. Salvaged Icepick - " + salvagedIcepick.salvagedIcepickCost() + " scraps.\n");
    }
}