import javax.swing.*;

public class Main extends JFrame{


    public static void main(String[] args) {
    //Generelles
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

    //Fenster erstellen
     JFrame f = new JFrame();
     f.setTitle("HashSuche");
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setSize(1300,1100);
     f.setLocation(50,50);
     f.setVisible(true);



     //Erstellung des Strings
        String[] LabelName = new String[10];
        String[] LabelName1 = new String[10];
        for(int i = 0; i<LabelName.length; i++)
        {
            LabelName[i] = s.gibSchlüssel(i);
            LabelName1[i] = s.gibWert(i);
        }
        //Erstellung des visuellen Arrays
        JLabel[] zahlen = new JLabel[10];
        JLabel[] zahlen1 = new JLabel[10];
        int x = 40;
        for(int i= 0; i<zahlen.length; i++)
        {
            x= x+30;
          zahlen[i].setText(LabelName[i]);
          zahlen[i].setSize(100,80);
          zahlen[i].setVisible(true);
          zahlen[i].setHorizontalTextPosition(x);
          zahlen[i].setVerticalAlignment(JLabel.CENTER);
          f.add(zahlen[i]);

        }
    }

}