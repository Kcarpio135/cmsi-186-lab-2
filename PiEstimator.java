public class PiEstimator {

    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new IllegalArgumentException("Exactly one argument required");
            }
            int darts = Integer.parseInt(args[0]);
            if (darts < 1) {
              System.err.println("At least one dart required");
            } else {
              System.out.println(estimate(darts));
            }
        } catch (NumberFormatException e) {
            System.err.println("Argument must be an integer");
        } catch (IllegalArgumentException e) {
            System.err.println("Exactly one argument required");
        }
    }

    public static double estimate(int darts) {
      if (darts < 1) {
          throw new IllegalArgumentException("At least one dart required");
        }
      double circleHits = 0;
      for (int i = 0; i <= darts; i++){
        if (Math.hypot(Math.random(), Math.random())<= 1){
          circleHits++;
        }

      }
        return 4 * circleHits / darts;
    }

}
