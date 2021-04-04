import java.util.Arrays;
import java.util.Random;

public class AutomationUniversityJava {

    private static final int LENGTH = 6;

    public static void main(String[] args) {

        generateNumbers();
        binarySearch(generateNumbers(),5);
    }
    public static boolean binarySearch(int[] arr, int numberToSearchFor){
        Arrays.sort(arr);

        int indexNumber = Arrays.binarySearch(arr, numberToSearchFor);
        if(indexNumber>=0){
            return true;
        }else{
            return false;
        }
    }

    /**
     *
     * @param arr
     * @param numberToSearchFor
     * @return
     */
    public static boolean search(int[] arr,int numberToSearchFor){
        for(int a : arr){
           if(a==numberToSearchFor){
               return true;
           }
        }
        return false;
    }

    public static int[] generateNumbers(){
        int[]arr = new int[LENGTH];
        Random random = new Random();

        for(int i=0;i<LENGTH;i++){
            int randomNumber;
            do{
                randomNumber=random.nextInt(25)+1;
            }while (search(arr,randomNumber));
            arr[i]=randomNumber;
            System.out.println("randomNumber = " + randomNumber);
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        return arr;
    }
}