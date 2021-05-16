package Lesson1;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat(4, 200),
                new Robot(1,3),
                new Man(3,1000)
        };
        Obstacle[] obstacles = {
                new Wall(3),
                new Treadmill(400)
        };
        for (Participant participant : participants) {
            System.out.println("Препятствие преодолевает " + participant);
            boolean winner = true;
            for (Obstacle obstacle : obstacles) {
                System.out.println(participant + " проходит " + obstacle);
                if (obstacle.toJump(participant.getMaxHeight()) ||
                        obstacle.toRun(participant.getMaxLength())) {
                    System.out.println("Успешно прошел");
                } else {
                    winner = false;
                    System.out.println("Не смог пройти");
                    break;
                }
            }

        }

    }
}
