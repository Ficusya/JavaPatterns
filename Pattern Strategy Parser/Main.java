import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

interface ParserStrategy {
    String parse(String input);
}

class LettersParser implements ParserStrategy {
    public String parse(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
                    if (Character.isLetter(c)) {
                        result.append(c);
                    }
                }
        return result.toString();
    }
}

class DigitsParser implements ParserStrategy {
    public String parse(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
                    if (Character.isDigit(c)) {
                        result.append(c);
                    }
                }
        return result.toString();
    }
}

class BothParser implements ParserStrategy {
    public String parse(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
                    if (Character.isDigit(c) || Character.isLetter(c)) {
                        result.append(c);
                    }
                }
        return result.toString();
    }
}

class Parser {
    private ParserStrategy strategy;

    public Parser(ParserStrategy strategy) {
        this.strategy = strategy;
    }

    public String parse(String input) {
        return strategy.parse(input);
    }
}

public class Main {
    public static void main(String[] args) {
        String filePath = "file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder inputText = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                inputText.append(line);
            }

            String input = inputText.toString();

            System.out.println("Выберите вид парсера:");
            System.out.println("1. Только буквы");
            System.out.println("2. Только цифры");
            System.out.println("3. Буквы и цифры");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            Parser parser;
            switch (choice) {
                case 1:
                    parser = new Parser(new LettersParser());
                    break;
                case 2:
                    parser = new Parser(new DigitsParser());
                    break;
                case 3:
                    parser = new Parser(new BothParser());
                    break;
                default:
                    System.out.println("Неверный выбор, выберите 1, 2 или 3.");
                    return;
            }

            System.out.println("Результат парсинга: " + parser.parse(input));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
