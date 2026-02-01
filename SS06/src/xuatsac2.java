class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password); //setter để kiểm tra
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Không cho password rỗng
    public void setPassword(String password) {
        if (password != null && !password.trim().isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Password không được rỗng");
        }
    }

    public void setEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (email != null && email.matches(regex)) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ!");
        }
    }

    public void hienThiThongTin() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println();
    }
}

public class xuatsac2 {
    public static void main(String[] args) {
        User u1 = new User(1, "user1", "123456", "user1@gmail.com");
        u1.hienThiThongTin();

        //email sai
        User u2 = new User(2, "user2", "abc123", "u2gmailcom");
        u2.hienThiThongTin();

        //pass rỗng
        User u3 = new User(3, "user3", "", "user3@gmail.com");
        u3.hienThiThongTin();

        System.out.println("Set lại dữ liệu sai");
        u1.setEmail("sai_email");
        u1.setPassword("   ");
        u1.hienThiThongTin();
    }
}
