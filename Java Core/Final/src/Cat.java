public final class Cat {
    private int weight =  0;

    public Cat(int weight) {
        this.weight = weight;
    }

    public Cat() {

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }
}
