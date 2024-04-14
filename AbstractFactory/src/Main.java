import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FurnitureFactory woodenFactory = new WoodenFurnitureFactory();
        System.out.println("О, вы заказали конвейерный деревянный стул");
        Chair woodenChair = woodenFactory.createChair();
        System.out.println("(деревянный стул получен)");
        System.out.println("О, и конвейерный деревянный стол");
        Table woodenTable = woodenFactory.createTable();
        System.out.println("(деревянный стол получен)");

        FurnitureFactory metalFactory = new MetalFurnitureFactory();
        System.out.println("Пора опробовать нашу конвейерную металлическую мебель");
        Chair metalChair = metalFactory.createChair();
        System.out.println("(металлический стул получен)");
        Table metalTable = metalFactory.createTable();
        System.out.println("(металлический стол получен)");

        System.out.println("Поздравляю, теперь вы можете сами выбрать тип мебели, размер и материал!");

        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        int size = scanner.nextInt();
        String material = scanner.next();

        switch (material) {
            case "Wood":
                Furniture woodenFurniture = woodenFactory.createFurniture(type, size);
                System.out.println("(Вы стали обладателем " + type + "(а) " + size + " размера из дерева)");
                break;
            case "Metal":
                Furniture metalFurniture = metalFactory.createFurniture(type, size);
                System.out.println("(Вы стали обладателем " + type + "(а) " + size + " размера из металла)");
                break;
            default:
                System.out.println("Извините, мы не можем предоставить мебель этого материала");
                return;
        }
    }
}
