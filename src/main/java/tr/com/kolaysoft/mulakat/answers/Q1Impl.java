package tr.com.kolaysoft.mulakat.answers;

import tr.com.kolaysoft.mulakat.Q1;

import java.util.List;

/**
 * Created with IntelliJ IDEA at 28.06.2021.
 *
 * @author Mehmet Mumcu
 */
public class Q1Impl implements Q1 {

    @Override
    public boolean isSubSet(List<String> sentence1, List<String> sentence2) {
        
        int flag = 0;
        for (int i = 0; i < sentence2.size(); i++) {
            flag = 0;
            for (int j = 0; j < sentence1.size(); j++) {

                if(sentence1.get(j).equals(sentence2.get(i))){

                    sentence1.remove(j);
                    flag = 1;
                    break;
                }

            }
            if(flag == 0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args)
    {
        List<String> a3 = new ArrayList<>();
        List<String> a2 = new ArrayList<>();
        String a = "marketten iki kilo elma aldım";//1.cümle
        String c = "marketten elma aldım"; // 2.cümle
        String b = "";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) != ' '){
                b = b+ a.charAt(i);
            }
            else{
                a3.add(b);
                b = "";
            }

        }
        a3.add(b);
        b = "";
        for(int i=0;i<c.length();i++){
            if(c.charAt(i) != ' '){
                b = b+ c.charAt(i);
            }
            else{
                a2.add(b);
                b = "";
            }

        }
        a2.add(b);
        b = "";

        Q1Impl t = new Q1Impl();

        String temp = "";
        for(int i=0;i<a3.size();i++){
            temp = temp + a3.get(i) + " ";
        }
        System.out.println(temp);
        temp = "";
        for(int i=0;i<a2.size();i++){
            temp = temp + a2.get(i) + " ";
        }
        System.out.println(temp);
        boolean b1 = t.isSubSet(a3,a2);
        System.out.println(b1);
    }

}
