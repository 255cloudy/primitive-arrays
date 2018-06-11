package Arrays;

public class Insertion {
    private int mynum;
    private  int [] myarray;
    public static int position;
    public Insertion (int [] thearray,int num ){
        myarray = thearray;
        mynum = num;
        inserter();
    }
    private void setPosition(int position) {
        this.position = position;
    }
    private void inserter (){
        myarray[position+1]=mynum;
        System.out.println(mynum+" inserted at position"+(position+1) );
    }
}
