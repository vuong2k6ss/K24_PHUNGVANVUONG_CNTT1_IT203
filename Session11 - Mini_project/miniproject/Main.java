public class Main {
    public static void main(String[] args) {
        // Khởi tạo nhân vật
        Warrior warrior = new Warrior("Yasuo", 500, 50, 20);
        Mage mage = new Mage("Veigar", 300, 40, 200);
        GameCharacter goblin = new GameCharacter("Goblin", 100, 10) {
            @Override
            void attack(GameCharacter target) {
                System.out.printf("%s can trom %s gay %.2f sat thuong\n", this.name, target.name, attackPower);
                target.takeDamage(attackPower);
            }

            @Override
            void displayInfo() {
                System.out.printf("Ten: %s | HP: %.2f", name, hp);
            }
        };

        // Yasuo tấn công Goblin
        warrior.attack(goblin);
        // Veigar dùng chiêu cuối lên Yasuo
        mage.useUltimate(warrior);
        // Goblin (Anonymous Class) tấn công
        goblin.attack(mage);

        // Hiển thị thông tin
        System.out.println("\nTong so nhan vat da tao: " + GameCharacter.count + "\n");
        System.out.println("----- Thong so sau luot dau -----");
        warrior.displayInfo();
        mage.displayInfo();
        goblin.displayInfo();

    }
}
