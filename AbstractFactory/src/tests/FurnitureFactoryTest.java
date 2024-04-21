package tests;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FurnitureFactoryTest {
    @Test
    public void testMetalFurnitureFactory(){
        FurnitureFactory metalFactory = new MetalFurnitureFactory();
        Chair metalChair = metalFactory.createChair();
        Chair metalChair2 = new MetalChair();
        Table metalTable = metalFactory.createTable();
        Table metalTable2 = new MetalTable();
        assert(metalChair.getClass() == metalChair2.getClass() && metalTable.getClass() == metalTable2.getClass());
    }

    @Test
    public void testWoodenFurnitureFactory(){
        FurnitureFactory woodenFactory = new WoodenFurnitureFactory();
        Chair woodenChair = woodenFactory.createChair();
        Chair woodenChair2 = new WoodenChair();
        Table woodenTable = woodenFactory.createTable();
        Table woodenTable2 = new WoodenTable();
        assert(woodenChair.getClass() == woodenChair2.getClass() && woodenTable.getClass() == woodenTable2.getClass());
    }
}