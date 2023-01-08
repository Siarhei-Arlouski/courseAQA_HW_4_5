import static org.junit.jupiter.api.Assertions.assertEquals;
import Resources.Resources;
import Tools.*;
import org.junit.jupiter.api.Test;

public class UnitTest {
    Hammer hammer = new Hammer();
    StoneHatchet stoneHatchet = new StoneHatchet();
    StonePickaxe stonePickaxe = new StonePickaxe();
    MetalHatchet metalHatchet = new MetalHatchet();
    MetalPickaxe metalPickaxe = new MetalPickaxe();
    SalvagedHammer salvagedHammer = new SalvagedHammer();
    SalvagedAxe salvagedAxe = new SalvagedAxe();
    SalvagedIcepick salvagedIcepick = new SalvagedIcepick();

    @Test
    void resourcesCalculatingTest() {
        Resources resources = new Resources(100,200,300,5,5);
        double sum = resources.getWood() + resources.getStone() + resources.getMetalFragments() + resources.getMetalPipe() + resources.getMetalBlade();
        assertEquals(267, sum);
    }

    @Test
    void hammerCostTest() {
        assertEquals(2, hammer.hammerCost());
    }

    @Test
    void stoneHatchetCostTest() {
        assertEquals(9, stoneHatchet.stoneHatchetCost());
    }

    @Test
    void stonePickaxeCostTest() {
        assertEquals(9, stonePickaxe.stonePickaxeCost());
    }

    @Test
    void metalHatchetCostTest() {
        assertEquals(9.5, metalHatchet.metalHatchetCost());
    }

    @Test
    void metalPickaxeCostTest() {
        assertEquals(14.5, metalPickaxe.metalPickaxeCost());
    }

    @Test
    void salvagedHammerCostTest() {
        assertEquals(35, salvagedHammer.salvagedHammerCost());
    }

    @Test
    void salvagedAxeCostTest() {
        assertEquals(105, salvagedAxe.salvagedAxeCost());
    }

    @Test
    void salvagedIcepickCostTest() {
        assertEquals(105, salvagedIcepick.salvagedIcepickCost());
    }
}