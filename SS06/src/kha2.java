 class Account {
    private String username;
    private String password;
    private String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void doiMatKhau(String matKhauMoi) {
        this.password = matKhauMoi;
        System.out.println("Đổi mật khẩu thành công!");
    }

    public void hienThiThongTin() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("----------------------");
    }
}
 public  class kha2 {
     public static void main(String[] args) {
         Account acc = new Account("admin", "123456", "admin@gmail.com");
         acc.hienThiThongTin();
         acc.doiMatKhau("1234567");
         acc.hienThiThongTin();
     }
}