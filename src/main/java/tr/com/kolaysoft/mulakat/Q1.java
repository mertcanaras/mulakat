package tr.com.kolaysoft.mulakat;

import java.util.List;

/**
 * 2 adet cumle verilecek. 2. cumle birincisi kullanilarak olusturulabilir mi?
 *
 * Ornek-1: sonuc: dogru
 * cumle 1: ben kitap okumayi cok severim
 * cumle 2: kitap okumayi severim
 *
 * Ornek-2: sonuc: yanlis, tum kelimeler birincide olmasina ragmen 'iki' kelimesi ilk cumlede bir defa oldugu icin yanlis.
 * cumle 1: iki kere uc dort degildir
 * cumle 2: iki kere iki dort.
 *
 *
 * @author Mehmet Mumcu
 */
public interface Q1 {

     boolean isSubSet(List<String> words, List<String> sentence);

}
