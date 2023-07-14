import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Завести новое животное");
            System.out.println("2. Определить животное в правильный класс");
            System.out.println("3. Увидеть список команд для животного");
            System.out.println("4. Обучить животное новым командам");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя животного: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите класс животного: ");
                    String animalClass = scanner.nextLine();
                    Animal animal = new Animal(name, animalClass);
                    animals.add(animal);
                    System.out.println("Животное " + name + " добавлено в реестр");
                    break;

                case 2:
                    System.out.print("Введите имя животного: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;

                    for (Animal a : animals) {
                        if (a.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Класс животного " + searchName + ": " + a.getAnimalClass());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Животное с именем " + searchName + " не найдено в реестре");
                    }
                    break;

                case 3:
                    System.out.print("Введите имя животного: ");
                    String showCommandsName = scanner.nextLine();
                    boolean foundCommands = false;

                    for (Animal a : animals) {
                        if (a.getName().equalsIgnoreCase(showCommandsName)) {
                            a.showCommands();
                            foundCommands = true;
                            break;
                        }
                    }

                    if (!foundCommands) {
                        System.out.println("Животное с именем " + showCommandsName + " не найдено в реестре");
                    }
                    break;

                case 4:
                    System.out.print("Введите имя животного: ");
                    String addCommandName = scanner.nextLine();
                    boolean foundAddCommand = false;

                    for (Animal a : animals) {
                        if (a.getName().equalsIgnoreCase(addCommandName)) {
                            System.out.print("Введите команду для животного " + addCommandName + ": ");
                            String command = scanner.nextLine();
                            a.addCommand(command);
                            foundAddCommand = true;
                            break;
                        }

                    }

                    if (!foundAddCommand) {
                        System.out.println("Животное с именем " + addCommandName + " не найдено в реестре");
                    }
                    break;

                case 0:
                    System.out.println("Выход...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }

    }
}
