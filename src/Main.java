import java.util.Scanner;
public class Main implements Spec{
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println();
        Main main = new Main();
        Player player = main.makePerson("Name pls");
        int age = main.askNumber("What age");
        String height = main.askString("How tall");
    }

    public String askString(String question){
        System.out.println(question);
        String answer = scanner.nextLine();
        return answer;
    }

    public int askNumber(String question){
        System.out.println(question);
        String answer = scanner.nextLine();
        int numberAnswer = Integer.parseInt(answer);
        return numberAnswer;
    }
    public Results getResults(Game guessingOrBetter){
        return getResults(guessingOrBetter);
    }
    
    public Player makePerson(String question){
        System.out.println(question);
        String answer = scanner.nextLine();
        return new Player(answer);
    }

    public void addResults(Player player){}

    @Override
    public void addResults(Person player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
