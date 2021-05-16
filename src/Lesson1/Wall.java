package Lesson1;

public class Wall implements Obstacle{
        int height;

        public Wall(int height) {
            this.height = height;
        }

        @Override
        public boolean toRun(int maxLength) {
            return false;
        }

        @Override
        public boolean toJump(int maxHeight) {
            return (maxHeight >= height);
        }

        @Override
        public String toString() {
            return "Стена высотой " + height + " м";
        }
}
