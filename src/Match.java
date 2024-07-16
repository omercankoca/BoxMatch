public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    public void Fight() {
        if (CheckWeight()) {

            while (f1.health > 0 && f2.health > 0) {
                System.out.println("====== NEW ROUND =======");
                f2.health = f1.Hit(f2);
                if (isWin()) {
                    printScore();
                    break;
                }
                f1.health = f2.Hit(f1);
                if (isWin()) {
                    printScore();
                    break;
                }
                printScore();

            }
        } else {
            System.out.println("The weights of the athletes do not match.");
        }
    }

    public boolean CheckWeight() {
        return (f1.weight > this.minWeight && f1.weight < this.maxWeight && f2.weight > this.minWeight && f2.weight < this.maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println(f2.name + " is win the match!!");
        }
        if (f2.health == 0) {
            System.out.println(f1.name + " is win the match!!");
        }else {
            return false;
        }
        return true;
    }

    public void printScore() {
        System.out.println("------------------");
        System.out.println(f1.name + " Health : " + f1.health);
        System.out.println(f2.name + " Health : " + f2.health);
    }
}
