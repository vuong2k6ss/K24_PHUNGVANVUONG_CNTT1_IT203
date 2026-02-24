abstract class GameCharacter {
    protected String name;
    protected double hp;
    protected double attackPower;
    static int count = 0;

    public GameCharacter(String name, double hp, double attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    abstract void attack(GameCharacter target);

    void takeDamage(double amount) {
        hp -= amount;
        if (hp <= 0) {
            hp = 0;
            System.out.printf("%s da bi ha guc\n", this.name);
        } else {
            System.out.printf("%s mat %.2f mau. HP con %.2f\n", this.name, amount, this.hp);
        }
    };

    abstract void displayInfo();
}
