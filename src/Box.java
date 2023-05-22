public class Box <T,A>{
    private String name;
    private int age;
    public static <T> T genericMethod (Box box ){
        T box1 = (T)box;
        return box1;

    }
    public Box() {
    }

    public Box(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
