package Arrays;

public class BasicSearching {
    private  int matches;
    public  int indexfound;
    private int[] myarray;
    private String stater ;
    public BasicSearching(int[]thearray,int search){
        myarray = thearray;
        for (int i = 0;i<=thearray.length-1;i++){
            if (myarray[i]==search){
                matches++;
                indexfound = i;
                System.out.println("object found at index : "+indexfound);
            }
        }
        System.out.println(matches+" found");
    }
    public BasicSearching(int[]thearray,int search,String state){
        myarray = thearray;
        int i;
        for ( i = 0;i<=thearray.length-1;i++){
            if (myarray[i]==search){
                for (int z =i;z<thearray.length;z++){
                    if (z==thearray.length-1){
                        break;
                    }else {
                    thearray[z] = thearray[z+1];
                    }
                }

            }


        }

    }
}
