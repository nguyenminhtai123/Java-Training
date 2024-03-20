public class Worker extends Officer {
    public Worker(String name, int age, String gender, String address, Integer level) {
        super(name, age, gender, address);
        this.level = level;
    }

    private int level;

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
