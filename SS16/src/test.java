
//public class Ex2 {
//    static void main() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chuỗi: ");
//        String input = sc.nextLine();
//        input = input.trim().toLowerCase();
//        String[] words = input.split(" ");
//        Map<Integer, List<String>> map = new HashMap<>();
//        for (String word : words) {
//            int length = word.length();
//            if (!map.containsKey(length)) {
//                map.put(length, new java.util.ArrayList<>());
//            }
//            map.get(length).add(word);
//        }
//        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
//            System.out.print("Độ dài: " + entry.getKey());
//            for (String word : entry.getValue()) {
//                System.out.println("  " + word);
//            }
//        }
//    }
//}
//
//
//public class bai3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Vui long nhap chuoi ngoac: ");
//        String s = sc.nextLine();
//        if (s.isEmpty()) {
//            System.out.println("Chuoi khong hop le");
//            return;
//        }
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == '(' || c == '[' || c == '{') {
//                stack.push(c);
//            } else if (c == ')' || c == ']' || c == '}') {
//                if (stack.isEmpty()) {
//                    System.out.println("Khong hop le");
//                    return;
//                }
//                char top = stack.peek();
//                if ((top == '(' && c == ')') ||
//                        (top == '[' && c == ']') ||
//                        (top == '{' && c == '}')) {
//
//                    stack.pop();
//                } else {
//                    System.out.println("Khong hop le");
//                    return;
//                }
//            }
//        }
//        if (stack.isEmpty()) {
//            System.out.println("Hop le");
//        } else {
//            System.out.println("Khong hop le");
//        }
//    }
//}
//
//
//
//public class bai1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        List<String> students = new ArrayList();
//        int studentSize =0;
//        System.out.println("nhap so luong sinh vien: ");
//        studentSize = input.nextInt();
//        input.nextLine();
//        for (int i =0; i<studentSize;i++){
//            String newStudent;
//            System.out.println("sinh vien thư "+ i+":");
//            newStudent = input.nextLine();
//            students.add(newStudent);
//        }
//        String longestName = "";
//        String regex = "^A.*";
//        Pattern pattern = Pattern.compile(regex);
//        int maxLength =0;
//        int startingNameCount = 0;
//        for (String student : students){
//            if (student.length()>maxLength){
//                maxLength= student.length();
//                longestName = student;
//            }
//            Matcher matcher = pattern.matcher(student);
//            if (matcher.matches()){
//                startingNameCount++;
//            }
//        }
//        System.out.println("Longest Name: " + longestName);
//        Collections.sort(students);
//        System.out.println("Sorted List");
//        for (String student :students){
//            System.out.println(student+"");
//        }
//        System.out.println("Number of names starting with A:" + startingNameCount);
//
//    }
//}
//
//
//
//
//
//public class bai2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Map<Integer,Integer> number = new HashMap<>();
//        int n=0;
//        System.out.println("nhap so luong phan tu");
//        n = input.nextInt();
//        for (int i = 0; i<n;i++){
//            System.out.println("So thu"+i+":");
//            int num = input.nextInt();
//            int count = number.getOrDefault(num, 0);
//            number.put(num, count + 1);
//        }
//        int max = 0;
//        for (Map.Entry<Integer, Integer> entry : number.entrySet()) {
//            if (entry.getValue() > max) {
//                max = entry.getValue();
//            }
//        }
//        List<Integer> elementsWithMax = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry : number.entrySet()) {
//            if (entry.getValue() == max) {
//                elementsWithMax.add(entry.getKey());
//            }
//        }
//        for (Map.Entry<Integer, Integer> entry : number.entrySet()) {
//            System.out.println(entry.getKey() + " xuat hien: " + entry.getValue());
//
//        }
//
//        System.out.println("Cac phan tu co so lan xuat hien nhieu nhat (" + max + "  lan):");
//        for (Integer element : elementsWithMax) {
//            System.out.println(element);
//        }
//
//    }
//}