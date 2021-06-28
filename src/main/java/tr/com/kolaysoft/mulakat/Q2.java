package tr.com.kolaysoft.mulakat;

import java.util.List;

/**
 * Siniftaki sinava giren ogrenciler arasindan en basarili m tanesini bulan bir metod yaziniz.
 *
 * Not: result degeri yuksek olan basarilidir.
 *
 * @author Mehmet Mumcu
 */
public interface Q2 {

    class StudentExamResult {
        public String studentId;
        public int result;
    }

    List<StudentExamResult> bestM(List<StudentExamResult> students, int m);
}
