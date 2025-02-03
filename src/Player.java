public class Player implements Person {
    private String name;
    private String height;
    private String age;

    public Player(String name) {
        this.name = name;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public String getAge() {
        return age;
    }

    @Override
    public Results getResults() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
