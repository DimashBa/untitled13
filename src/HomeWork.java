
    public class HomeWork {

        public static void main(String[] args) {
            Jumping[] units = {
                    new Cat(),
                    new Human(),
                    new Robot(),

            };
            for (Jumping unit : units) {
                unit.jump(2);

                if (unit instanceof Treadmill){
                    ((Treadmill) unit).run();
                }
                if (unit instanceof Wall){
                    ((Wall) unit).jump();
                }
            }
            Runing[] units1 = {
                    new Cat(),
                    new Human(),
                    new Robot(),
            };
            for (Runing unit : units1){
                unit.run(50);
            }

        }}
    class Cat implements Jumping,Runing{
        @Override
        public void run(int distance) {
            System.out.println("The cat ran");
        }
        @Override
        public void jump(int length) {
            System.out.println("The cat jump");
        }

        public void run(){
            System.out.println("Successfully ran");
        }
        public void jump(){
            System.out.println("Successfully jump");
        }
    }

    class Human implements  Runing,Jumping{
        @Override
        public void run(int distance) {
            System.out.println("Human ran");
        }
        @Override
        public void jump(int length) {
            System.out.println("Human jump");
        }
    }


    class Robot implements Runing,Jumping{
        @Override
        public void run(int distance) {
            System.out.println("Robot ran");
        }
        @Override
        public void jump(int length) {
            System.out.println("Robot jump");
        }
    }


    interface Runing{

        void run(int distance);
    }

    interface Jumping{

        void jump(int length);
    }
    interface Treadmill{
        void run();
    }
    interface Wall{
        void jump();
    }
    class InterFaces {
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.run(50);
            cat.jump(4);

            Human human = new Human();
            human.jump(2);
            human.run(100);

            Robot robot = new Robot();
            robot.jump(10);
            robot.run(1000);


        }
    }

