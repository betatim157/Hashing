import javax.swing.*;

public class Main{
    public static void main(String[] args) {
    HashSuche s = new HashSuche();
    s.fuegeEin(22, 10.5);
    s.fuegeEin(12324,6);
    System.out.println(s.fuegeEin(13456,73));
    System.out.println(s.fuegeEin(10,2));
    System.out.println(s.fuegeEin(13456,3));
    System.out.println(s.fuegeEin(1341236,93));
    System.out.println(s.fuegeEin(131412556,13));
    System.out.println(s.fuegeEin(1345612312,223));
    System.out.println(s.fuegeEin(13412256,23));
    System.out.println(s.fuegeEin(134145656,55));


    s.showarray();


    }
}