package Something;

public class HasAlternatingBits {
    public boolean hasAlternatingBits(int n) {

        boolean re = true;

        String []arr = Integer.toBinaryString(n).split("");

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i].equals(arr[i+1])){
                return false;
            }
            else
                re = true;
        }


        return re;
    }

    public static void main(String[] args) {
        HasAlternatingBits h = new HasAlternatingBits();
        System.out.println(h.hasAlternatingBits(6));
    }
}
