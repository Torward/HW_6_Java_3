import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //arrayFourOne
        System.out.println(arrayFourOne(new int[]{1,4,1,1,}));
   //   System.out.println(arrayFourOne(new int[]{1,1,1,1,1,1,1}));
//        System.out.println(arrayFourOne(new int[]{4,4,4,4,4,4}));
//        System.out.println(arrayFourOne(new int[]{1,2,1,4,4}));
//        //looking4
//        System.out.println(Arrays.toString(arrayLooking4(new int[]{6,5,4,2,1,4,3,5})));
//        System.out.println(Arrays.toString(arrayLooking4(new int[]{4,4,4,4,6,6,5,4})));
//        System.out.println(Arrays.toString(arrayLooking4(new int[]{8,7,2,1,1,6})));




    }

    public static int[] arrayLooking4(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("Здесь нет 4!");
    }

    public static boolean arrayFourOne(int[] arr) {
        boolean has1 = false;
        boolean has4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }
            if (arr[i] == 1) {
                has1 =  true;
            }
            if(arr[i] == 4){
                has4 = true;
            }

        }
        return has1 && has4;
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
