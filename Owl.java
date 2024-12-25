public class Owl extends Animal implements Flyable {
    @Override
    void sound() {
        System.out.println("hoot hoot (ฮูก ฮูก)");
    }

    @Override
    public void fly() {
        System.out.println("prbbb prbbb hoottt");
    }

    @Override
    public void glide() {
        System.out.println("....!??");
    }
}
