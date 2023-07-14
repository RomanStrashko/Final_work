import java.util.ArrayList;
import java.util.List;

public class Animal {
        private String name;
        private String animalClass;
        private List<String> commands;

        public Animal(String name, String animalClass) {
            this.name = name;
            this.animalClass = animalClass;
            this.commands = new ArrayList<>();
        }

        public void addCommand(String command) {
            commands.add(command);
            System.out.println("Команда '" + command + "' добавлена для животного " + name);
        }

        public void showCommands() {
            System.out.println("Список команд для животного " + name + ":");
            for (String command : commands) {
                System.out.println("- " + command);
            }
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }
}


