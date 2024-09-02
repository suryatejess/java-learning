package GetterSetter;

class Human {
    private int age = 18;
    private String name = "Surya";

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.name wont work
        System.out.println(obj.getName() + " " +  obj.getAge());


        obj.setAge(20);
        System.out.println("\nSet name\n" + obj.getName() + " " +  obj.getAge());
    }
}

