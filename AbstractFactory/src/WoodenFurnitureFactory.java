// Конкретная фабрика для создания деревянной мебели
public class WoodenFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new WoodenChair();
    }

    @Override
    public Table createTable() {
        return new WoodenTable();
    }

    @Override
    public Furniture createFurniture(String type, int size) {
        return new WoodenFurniture(type, size);
    }
}

