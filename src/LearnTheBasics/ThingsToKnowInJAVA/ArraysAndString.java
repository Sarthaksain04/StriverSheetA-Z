package LearnTheBasics.ThingsToKnowInJAVA;

public class ArraysAndString  {
    public static void main(String[] args) {
        int[]arr = {2 , 3 , 4 , 1  , 6};
        for (int i = 0; i < arr.length  ; i++) {
            System.out.println(arr[i]);
        }

        String s = "hi am sarthak";
        System.out.println(s.charAt(1));  // if want to print only one character


        for (int i = 0; i < s.length() ; i++) { // if i want to print all of them
            System.out.println(s.charAt(i));
        }
    }
}
