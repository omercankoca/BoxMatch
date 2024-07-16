//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("A", 12,100,102,37);
        Fighter fighter2 = new Fighter("B", 15, 95, 95,48);
        Match match = new Match(fighter1, fighter2,85, 105 );
        match.Fight();


    }
}