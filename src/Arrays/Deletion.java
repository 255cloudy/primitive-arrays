package Arrays;

import java.util.Scanner;

public class Deletion {
    private int search;
    private final String state = "sept";
    public Deletion (int[] thearray){
        System.out.println("enter the number you wat to search :");
        Scanner newer = new Scanner(System.in);
        search = newer.nextInt();
        BasicSearching del = new BasicSearching(thearray,search,state);
        System.out.println("the new array is:");
        for (int i = 0;i<=thearray.length-1;i++){
            System.out.println(thearray[i]);
        }
    }

}
