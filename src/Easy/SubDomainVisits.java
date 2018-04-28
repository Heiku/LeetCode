package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomainVisits {
    public List<String> subdomainVisits(String[] cpdomains) {

        List<String> cp = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (String dm : cpdomains){
            String []arr = dm.split(" ");

            // get times domain
            int times = Integer.parseInt(arr[0]);
            String domain = arr[1];

            // str likes "baidu.com"
            String []str = domain.split("\\.");


            if (str.length == 2){
                String second = domain;
                String top = str[1];

                if (map.containsKey(top)){
                    int value = map.get(top);
                    value += times;
                    map.put(top, value);
                }else {
                    map.put(top, times);
                }

                if (map.containsKey(second)){
                    int value = map.get(second);
                    value += times;
                    map.put(second, value);
                }else{
                    map.put(second, times);
                }

            }else{
                String top = str[2];
                String second = str[1] + "." + str[2];
                String thrid = str[0] + "." + str[1] + "." + str[2];

                if (map.containsKey(top)){
                    int value = map.get(top);
                    value += times;
                    map.put(top, value);
                }else {
                    map.put(top, times);
                }

                if (map.containsKey(second)){
                    int value = map.get(second);
                    value += times;
                    map.put(second, value);
                }else{
                    map.put(second, times);
                }

                if (map.containsKey(thrid)){
                    int value = map.get(thrid);
                    value += times;
                    map.put(thrid, value);
                }else{
                    map.put(thrid, times);
                }

            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            String s = entry.getValue() + " " + entry.getKey();
            cp.add(s);
        }
        return cp;
    }

    public static void main(String[] args) {
        String []in = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        SubDomainVisits s = new SubDomainVisits();
        System.out.println(s.subdomainVisits(in));
    }
}
