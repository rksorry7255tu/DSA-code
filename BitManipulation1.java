//Code for Get Bit


public class BitManipulation1 {
    public static void main(String []args){
        int n=5;
        int pos=1;
        int bitMask=1<<pos;

        if((bitMask & n)==0){
            System.out.println("bit was Zero");
        }else{
            System.out.println("bit was one");
        }
    }
}
