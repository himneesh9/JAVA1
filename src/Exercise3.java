import java.util.Scanner;
import java.util.Random;
class Game{
    Random r = new Random();
    Scanner s = new Scanner(System.in);
     int computer ;
     int userinput;
    private int no ;
    public Game(){
         computer  = r.nextInt(100);
    }
    public int takeUserInput(){
        userinput = s.nextInt();
        return userinput ;
    }
    public void isCorrectNumber(){
        if(userinput == computer){
            System.out.println("You win!!!");
            no++;}
        else if (userinput - computer < 10 && userinput - computer > -10) {
            System.out.println("Bad luck!!!\nTry again\nYou are very close");
            no++; }
        else if (userinput - computer < 30 && userinput - computer > -30 ) {
            System.out.println("Bad luck!!!\nTry again\nYou are close");
            no++;}
        else{
            System.out.println("Bad luck!!!\nTry again\nYou are far");
            no++;}}
    public int noOfGuesses(){
        return no;}}
public class Exercise3 {
    public static void main(String[] args) {

        System.out.println("Guess the number!\nEnter any number between 0 to 100:");
        Game g = new Game();
        g.takeUserInput();
        g.isCorrectNumber();
//        System.out.println("Computer = " + g.computer);
        while (g.userinput != g.computer) {
            g.takeUserInput();
            g.isCorrectNumber();
        }
        System.out.println("no of guesses = " + g.noOfGuesses());

    }
}
