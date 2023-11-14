package method;

public class Cars {

        // Non-static method
        public void drive(String destination) {
            System.out.println("Driving to " + destination);
        }

        // Static method
        public static void beep () {
            System.out.println("beep! beep!");
        }

        public static void main(String[] args) {

            Cars myCar = new Cars();


            myCar.drive("the park");


            Cars.beep();
        }
    }
