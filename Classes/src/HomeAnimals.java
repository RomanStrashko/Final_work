public class HomeAnimals extends Animal{

    private String breed;
    public HomeAnimals(String name, int age) {
        super(name, age);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
