public class Nordea {

    public static void main(String[] args) {

        int []smh ={1,2,31,1,2};
        System.out.println("nordeaTest(smh) = " + nordeaTest(smh));
        /**
         * Given an array of ints, return true if the array is length 1 or more,
         * and the first element and the last element are equal.
         * sameFirstLast([1, 2, 3]) → false
         * sameFirstLast([1, 2, 3, 1]) → true
         * sameFirstLast([1, 2, 1]) → true
         *
         *
         */
    }

    public static boolean nordeaTest(int [] arr){

        return arr.length > 1 && (arr[0] == arr[arr.length - 1]);

    }
}
