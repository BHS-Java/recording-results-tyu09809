import java.util.Scanner;

public class Player implements Person{
    private String name;
    private String height;
    private String age;
    private Results results;

    public Player() {
        this.results = new ResultsImpl();
    }

     @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String getHeight() {
        return this.height;
    }

    @Override
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String getAge() {
        return this.age;
    }

    @Override
    public Results getResults() {
        return this.results;
    }

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name pls ");
        this.name = scanner.nextLine();

        System.out.print("height pls ");
        this.height = scanner.nextLine();

        System.out.print("age pls ");
        this.age = scanner.nextLine();
  }

}
