package kata;

public class SmallEnough {

    public static boolean smallEnough(int[] a, int limit) {
        for(int aVal : a) {
            if(aVal > limit) {
                return false;
            }
        }
        return true;
    }

}
