public class Main {
    public static void main(String[] args) {
    Box<String,Integer> box = new Box<>("Bobo",22);

        System.out.println((Box) Box.genericMethod(box));
    }
}