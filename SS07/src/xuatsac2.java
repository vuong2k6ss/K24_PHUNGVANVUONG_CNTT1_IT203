import java.util.ArrayList;
import java.util.List;

class Mains {
    static class User {
        public final int id;
        public String username;
        public String password;
        public User(int id, String username, String password) {
            this.id = id;
            this.username = username;
            this.password = password;
        }

        public String toString() {
            return "User[id=" + id + ", name=" + username + "]";
        }
    }

    static class UserManager {
        public static List<User> users = new ArrayList<>();
        public static void addUser(User u) {
            users.add(u);
        }

        public static boolean checkLogin(String username, String password) {
            for (User u : users) {
                if (u.username.equals(username) && u.password.equals(password)) {
                    return true;
                }
            }
            return false;
        }
    }

}


public class xuatsac2 {
    public static void main(String[] args) {
        Mains.User u1 = new Mains.User(1, "dev_a", "123456");
        Mains.User u2 = new Mains.User(2, "dev_b", "abcdef");
        Mains.User u3 = new Mains.User(3, "dev_c", "qwerty");
        Mains.UserManager.addUser(u1);
        Mains.UserManager.addUser(u2);
        Mains.UserManager.addUser(u3);

        System.out.println(">> Đã thêm 3 user vào hệ thống.");
        System.out.println("Danh sách hiện tại:");

        int index = 1;
        for (Mains.User u : Mains.UserManager.users) {
            System.out.println(index + ". " + u);
            index++;
        }

        System.out.println("\n>> Kiểm tra đăng nhập:");

        System.out.println("- Login (\"dev_a\", \"123456\"): "
                + (Mains.UserManager.checkLogin("dev_a", "123456") ? "Thành công!" : "Thất bại!"));

        System.out.println("- Login (\"dev_b\", \"sai_pass\"): "
                + (Mains.UserManager.checkLogin("dev_b", "sai_pass") ? "Thành công!" : "Thất bại!"));
    }
}
