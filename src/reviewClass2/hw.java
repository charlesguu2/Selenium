package reviewClass2;

public class hw {

    static String maxLength(String [] arr) {
        String largestValue = "";

        for( int i = 0 ; i < arr.length ; i++ ) {
            largestValue += arr[i];

        }
        return largestValue;

    }



    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}
