class Mage extends GameCharacter implements ISkill {
    double mana;

    public Mage(String name, double hp, double attackPower, double mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    void attack(GameCharacter target) {
        System.out.printf("%s tan cong %s\n", this.name, target.name);
        if (mana >= 5) {
            mana = -5;
            target.takeDamage(attackPower);
        } else {
            target.takeDamage(attackPower / 2);
        }

    }

    @Override
    public void useUltimate(GameCharacter target) {
        if (mana >= 50) {
            mana -= 50;
            System.out.printf("%s tan cong %s bang Hoa cau ton 50 mana\n", this.name, target.name);
            target.takeDamage(attackPower * 3);
        } else {
            System.out.println("%s khong du mana de dung ki nang dac biet");
        }
    }

    @Override
    void displayInfo() {
        System.out.printf("Ten %s | HP: %.2f | Mana: %.2f\n", name, hp, mana);

    }
}
