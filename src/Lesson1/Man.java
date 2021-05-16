package Lesson1;

public class Man implements Participant{
    int maxHeight;
    int maxLength;

    public Man(int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public String toString() {
        return "Человек";
    }
}
