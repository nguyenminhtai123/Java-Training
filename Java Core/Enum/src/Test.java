
    class Jogger {
        public static void main(String[] args) {
            Jogger jogger = new Runner();
            FitnessBuff runner = new Runner();
//            jogger.move();                        // Line 07
//            (FitnessBuff)jogger.move();           // Line 08
            ((FitnessBuff)jogger).move();         // Line 09
//            runner.move();                        // Line 10
//            (FitnessBuff)runner.move();           // Line 11
//            ((FitnessBuff)runner).move();         // Line 12
        }
    }
    class Runner extends Jogger implements FitnessBuff {
        public void move() { System.out.println("Make way!"); }
    }
    interface FitnessBuff { public void move(); }

