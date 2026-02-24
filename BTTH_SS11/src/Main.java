public class Main {
    interface  IMIxable {
        void mix();

    }

    static abstract class Drink{
        protected String id;
        protected String name;
        protected String price;

        public Drink(String id, String name, String price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public abstract double calculatePrice();
    }

    public void displayInfo(){
        System.out.println("MÃ: "+ id);
        System.out.println("Tên: "+ name);
        System.out.println("giá gốc: "+ price);
    }

    static class Coffee extends Drink{
        private boolean hasMilk;

        public Coffee(String id, String name, String price, boolean hasMilk) {
            super(id, name, price);
            this.hasMilk = hasMilk;
        }

        @Override
        double calculatePrice() {
            if(hasMilk){
                return price + 5000;
            }else {
                return price;
            }
        }

        @Override
        public void displayInfo(){
            super.displayInfo();
            if(hasMilk){
                System.out.println("Có sữa");
            }else {
                System.out.println("đen đá");
            }
        }

    }

    static class FruitJuice extends Drink implements IMIxable{
        private int discountPercent;

        public FruitJuice(String id, String name, String price, int discountPercent) {
            super(id, name, price);
            this.discountPercent = discountPercent;
        }

        @Override
        double calculatePrice(){
            return 	price - (price * discountPercent / 100);
        }

        @Override
        public  void mix(){
            System.out.println("ang ép trái cây tươi");
        }
    }


    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee("1", "bạc sỉu", "30000", true);
        drinks[1] = new Coffee("2", "nước cam", "40000", true);
        drinks[2] = null;

        System.out.println("hóa đơn");
        for (int i = 0; i < drinks.length; i++) {
            if(drinks[i] != null){
                System.out.println("đồ uống"+ (i+1));
                drinks[i].displayInfo();
                System.out.println("tiền thanh toán"+ drinks[i].calculatePrice());
            }
        }
    }
}