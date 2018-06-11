package Arrays;

import java.util.Scanner;


public class Control {
    public static void main(String[]args){
        Choices choice;
        int[] nums = new int[20];
        System.out.println("enter 10 intagers");
        Scanner scan = new Scanner(System.in);
        for (int i = 0;i<=10;i++){
            System.out.println("enter an intager");
           nums[i] = scan.nextInt();
           Insertion.position++;
        }
        for (int i = 0;i<=10;i++){System.out.println(nums[i]);}
        System.out.println("select an action :");
        System.out.println("[01] INSERT");
        System.out.println("[02]SEARCH");
        System.out.println("[03]DELETE");
        int choicer = scan.nextInt();
        if (choicer == 1){
            choice =Choices.INSERT;
        }else if (choicer ==2 ){
            choice = Choices.SEARCH;
        }else {
            choice = Choices.DELETE;
        }

        switch (choice){
            case DELETE:
                Deletion del = new Deletion(nums);
                break;
            case INSERT:
                System.out.println("enter the number you want to insert :");
                int number =scan.nextInt();
                Insertion ins = new Insertion(nums,number);
                break;
            case SEARCH:
                System.out.println("enter the number you want to search :");
                int numbers = scan.nextInt();
                BasicSearching ser = new BasicSearching(nums,numbers);
                break;

        }

    }
}
