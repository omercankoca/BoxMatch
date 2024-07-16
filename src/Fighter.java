public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int Hit(Fighter foe) {
        System.out.println("----------");
        System.out.println(this.name + " dealt " + this.damage + " damage to " +foe.name);
        if (foe.Dodge()){
            System.out.println(foe.name + " dodged");
            return foe.health;
        }
        if (foe.health - this.damage < 0){

            return 0;
        }
        return foe.health - this.damage;

    }

    public boolean Dodge(){
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }

}
