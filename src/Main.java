import java.util.Scanner;
public class Main implements Spec{
    public static void main(String[] args){
        System.out.println();
        Main main = new Main();
        Person player = main.makePerson("Name pls");
        int age = main.askNumber("What age");
        String height = main.askString("How tall");
    }

    public String askString(String question){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        String answer = scanner.nextLine();
        return answer;
    }

    public int askNumber(String question){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        String answer = scanner.nextLine();
        int numberAnswer = Integer.parseInt(answer);
        return numberAnswer;
    }
    public Results getResults(Game guessingOrBetter){
        return getResults(guessingOrBetter);
    }
    public Person makePerson(String question){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        String answer = scanner.nextLine();
        return new Person(answer);
    }
    public void addResults(Person player){
        return;
    }

}
