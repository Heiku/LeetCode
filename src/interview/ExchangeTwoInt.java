package interview;

public class ExchangeTwoInt {

    public void swap1(int i, int j){

        i = i + j - i;
        j = i + j - j;
    }

    public void swap2(int i, int j){
        i = i ^ j;
        j = i ^ j;
        i = i ^ j;

        System.out.println(i);
        System.out.println(j);
    }


    public static void main(String[] args) {
        int i = 3, j = 5;
        new ExchangeTwoInt().swap2(i, j);

    }
}
