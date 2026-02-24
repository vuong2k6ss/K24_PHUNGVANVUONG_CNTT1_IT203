import java.util.Random;

public class Main {

    static abstract class GameCharacter {
        String name;
        double hp, atk;

        GameCharacter(String name, double hp, double atk) {
            this.name = name;
            this.hp = hp;
            this.atk = atk;
        }

        abstract void attack(GameCharacter t);

        void takeDamage(double dmg) {
            hp = Math.max(0, hp - dmg);
        }

        boolean isAlive() {
            return hp > 0;
        }

        void info() {
            System.out.printf("%s | HP: %.1f\n", name, hp);
        }
    }

    // ===== HERO CÓ MANA =====
    static class Hero extends GameCharacter {
        double mana;
        double multiplier;

        Hero(String n, double h, double a, double m, double mana) {
            super(n, h, a);
            this.multiplier = m;
            this.mana = mana;
        }

        void attack(GameCharacter t) {

            double damage = atk;

            // Nếu còn đủ mana thì dùng skill mạnh hơn
            if (mana >= 20) {
                damage = atk * multiplier;
                mana -= 20;
                System.out.println(name + " dung ky nang vao " + t.name +
                        " (-" + damage + ")");
            } else {
                System.out.println(name + " danh thuong " + t.name +
                        " (-" + damage + ")");
            }

            t.takeDamage(damage);

            System.out.printf(">> %s | HP: %.1f | Mana: %.1f\n",
                    name, hp, mana);
        }
    }

    public static void main(String[] args) {

        Random rd = new Random();

        GameCharacter[] chars = {
                new Hero("Yasuo", 300, 50, 1.5, 100),
                new Hero("Veigar", 250, 40, 2, 150),
                new Hero("Zed", 350, 60, 2, 80),
                new Hero("Ashe", 320, 45, 1.3, 60),
                new Hero("Malphite", 350, 30, 1.2, 50),
                new GameCharacter("Goblin", 100, 10) {
                    void attack(GameCharacter t) {
                        System.out.println(name + " can trom " + t.name + " (-" + atk + ")");
                        t.takeDamage(atk);

                        // Hiển thị máu mục tiêu sau khi bị cắn
                        System.out.printf(">> %s con lai HP: %.1f\n", t.name, t.hp);
                        System.out.printf(">> %s | HP: %.1f\n", name, hp);
                    }
                }
        };

        // ===== ĐÁNH ĐẾN KHI CÒN 1 NGƯỜI =====
        while (true) {

            int alive = 0;
            for (GameCharacter c : chars)
                if (c.isAlive()) alive++;

            if (alive <= 1) break;

            GameCharacter attacker, target;

            do {
                attacker = chars[rd.nextInt(chars.length)];
            } while (!attacker.isAlive());

            do {
                target = chars[rd.nextInt(chars.length)];
            } while (!target.isAlive() || attacker == target);

            System.out.println("\n===");
            attacker.attack(target);

            if (!target.isAlive())
                System.out.println(target.name + " da bi ha guc!");
        }

        System.out.println("\n winner");
        for (GameCharacter c : chars)
            if (c.isAlive())
                c.info();
    }
}

