/**
 * Created by USER on 18.02.2017.
 */
public class StringBufferHomeWork {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Алгоритмы+Данные=Программы");
        System.out.println(s);
        int p1 = s.indexOf("+");
        System.out.println(p1);
        int p2 = s.indexOf("=");
        System.out.println(p2);
        System.out.println(s.delete(9,16));
        s.append("-");
        System.out.println(s.append("Данные"));

    }
}
