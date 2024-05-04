package DebugExercise;

/**
 * Exercise for learning how the debug, breakpoint, and step-into
 * feature work.
 */
public class DebugExercise1 {
//    public static int divideThenRound(int top, int bottom) {
//        //int will truncate the result make integer less than 0 to only be 0, which is not correct
//        double quotient = (double) top / bottom;
////
//        if (quotient < 0) {
//            return (int) quotient;
//        } else {
//            return Math.round((float) quotient);
//        }
//
//    }
        public static int divideThenRound(double top, double bottom) {
            return (int) Math.round(top / bottom);
        }

    public static void main(String[] args) {
        int t = 10;
        int b = 2;
        int result = divideThenRound(t, b);
        System.out.println("round(" + t + "/" + b + ")=" + result);

        int t2 = 9;
        int b2 = 4;
        int result2 = divideThenRound(t2, b2);
        System.out.println("round(" + t2 + "/" + b2 + ")=" + result2);

        int t3 = 3;
        int b3 = 4;
        int result3 = divideThenRound(t3, b3);
        System.out.println("round(" + t3 + "/" + b3 + ")=" + result3);
    }
}
