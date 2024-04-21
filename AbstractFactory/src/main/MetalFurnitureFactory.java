package main;

public class MetalFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new MetalChair();
    }

    @Override
    public Table createTable() {
        return new MetalTable();
    }

    @Override
    public Furniture createFurniture(String type, int size) {
        return new MetalFurniture(type, size);
    }
}