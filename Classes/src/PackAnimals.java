public class PackAnimals extends Animal{

    String type;
    public PackAnimals(String name, int age) {
        super(name, age);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
