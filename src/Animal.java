public abstract class Animal {
    private Integer weight;

    public Animal(Integer weight) {
        this.weight = weight;
    }
    private void breathing()
    {
        System.out.println("Breathing");
    }
    abstract void eat();
}
