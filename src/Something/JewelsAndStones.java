package Something;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        String[] j = J.split("");
        String[] s = S.split("");

        int count = 0;
        for (String i : j){
            for (String k : s){
                if (k.equals(i)){
                    count++;
                }
            }
        }

        return count;
    }
}
