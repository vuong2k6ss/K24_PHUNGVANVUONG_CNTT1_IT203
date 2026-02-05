public class gioi2 {
    static class Animal {
        public void sound() {
            System.out.println("Động vật phát ra âm thanh");
        }
    }

    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Chó sủa: Gâu gâu!");
        }

        public void wagTail() {
            System.out.println("Chó đang vẫy đuôi 🐕");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        // animal.wagTail();  //loi biên dịch

        //kiểm tra instanceof và ép kiểu
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.wagTail();
        }
    }
}
