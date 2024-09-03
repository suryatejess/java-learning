package Interface;

public class B implements A{
    @Override
    public void show() {
        System.out.println("B show");
    }

    @Override
    public void config() {
        System.out.println("B config");
    }
}
