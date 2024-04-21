package main;

// Абстрактная фабрика, определяющая интерфейс создания мебели
public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
    Furniture createFurniture(String type, int size);
}