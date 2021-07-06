package tr.com.kolaysoft.mulakat.answers;

import tr.com.kolaysoft.mulakat.Q2;

import java.util.List;

/**
 * Created with IntelliJ IDEA at 28.06.2021.
 *
 * @author Mehmet Mumcu
 */
public class Q2Impl implements Q2 {
    @Override
    public List<StudentExamResult> bestM(List<StudentExamResult> students, int m) {
         int count;
        int size = students.size();

        StudentExamResult temp2 = new StudentExamResult();
        count = m;
        if(m>size){
            count = size;
        }

        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                if(students.get(j).result < students.get(j+1).result){
                    //temp2.studentId = students.get(i).studentId;
                    //temp2.result = students.get(i).result;

                    temp2 = students.get(j);
                    students.set(j,students.get(j+1));
                    students.set(j+1,temp2);
                }
            }

        }
        List<StudentExamResult> sonuc = new ArrayList<>();
        for(int i=0;i<count;i++){
            sonuc.add(students.get(i));

        }
        return sonuc;
    }
    public static void main (String[] args){

        String eh;
        String id;
        int res;
        Scanner input = new Scanner(System.in);
        List<StudentExamResult> a = new ArrayList<>();
        List<StudentExamResult> b = new ArrayList<>();
        Q2Impl t = new Q2Impl();


        int flag = 0;
        while(flag == 0){
            System.out.println("Sinav notu girmek istiyor musunuz(E/H)");
            eh = input.next();
            if(eh.equals("E")){
                System.out.println("Ogrenci Id:");
                id = input.next();
                System.out.println("Result:");
                res = input.nextInt();
                StudentExamResult temp = new StudentExamResult();
                temp.studentId = id;

                temp.result = res;
                a.add(temp);
            }
            else{
                flag = 1;
            }
        }
        System.out.println("Kac adet best result istiyorsunuz:");
        int mm = input.nextInt();
        b = t.bestM(a,mm);
        String ress = "";
        System.out.println("Id    Result");
        for(int i=0;i<b.size();i++){
            ress = "";
            ress = b.get(i).studentId +"    " + (b.get(i).result);
            System.out.println(ress);
    }
}
