class Warrior extends GameCharacter implements ISkill {
    private double armor;

    public Warrior(String name, double hp, double attackPower, double armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    void takeDamage(double damage) {
        // Trừ giáp trước khi tấn công vào máu
        double realDamage = damage - armor;
        if (realDamage < 0) {
            realDamage = 0;
        }
        super.takeDamage(realDamage);
    }

    @Override
    void attack(GameCharacter target) {
        System.out.printf("%s tan cong %s\n", this.name, target.name);
        target.takeDamage(this.attackPower);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.printf("%s tan cong %s bang Dam ngan can");
        target.takeDamage(this.attackPower * 2);
        // Trừ 10% máu khi dùng kĩ năng
        this.hp -= this.hp * 0.1;
    }

    @Override
    void displayInfo() {
        System.out.printf("Ten: %s | HP: %.2f | Giap: %.2f\n", this.name, this.hp, this.armor);
    }
}
