package Lesson1;

public class Cat implements Participant {
    int maxHeight;
    int maxLength;


    public Cat(int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;

    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Кот бежит");
    }
    @Override
    public String toString() {
        return "Кот" ;
    }

}

