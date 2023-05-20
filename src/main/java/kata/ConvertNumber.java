package kata;

public class ConvertNumber {

    public static int[] digitize(long n) {
        String nStr = String.valueOf(n);
        int[] nStrArr = new int[nStr.length()];

        for(int i=0; i< nStrArr.length; i++) {
            nStrArr[i] = Integer.parseInt(nStr.split("")[nStr.length()-1-i]);
        }

        return nStrArr;
    }
}
