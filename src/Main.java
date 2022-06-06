import javax.swing.*;
import java.awt.*;

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
     f.setSize(2600,1100);
     f.setResizable(false);
     f.setLocation(50,50);
     f.setVisible(true);
     f.setLayout(new FlowLayout(FlowLayout.CENTER,40,0));
     JPanel panel = new JPanel();
     panel.setPreferredSize(new Dimension(2600,500));
     f.add(panel);

     //Erstellung des Strings
        String[] LabelName = new String[10];
        String[] LabelName1 = new String[10];
        for(int i = 0; i<LabelName.length; i++)
        {
            LabelName[i] = s.gibSchlüssel(i);
            LabelName1[i] = s.gibWert(i);
        }
        //Erstellung des visuellen Arrays
        JLabel[] bilder = new JLabel[10];
        JLabel[] zahlen = new JLabel[10];
        JLabel[] zahlen1 = new JLabel[10];


        for(int p = 0; p<zahlen.length; p++){
            zahlen[p] = new JLabel();
            zahlen1[p] = new JLabel();
            bilder[p] = new JLabel();
        }
        int x = 40;

        for(int i = 0; i<zahlen.length; i++)
        {
            //Icons
            x = x+30;
            bilder[i].setIcon(new ImageIcon("Person.jpg"));
            bilder[i].setPreferredSize(new Dimension(200, 40));
            bilder[i].setHorizontalTextPosition(SwingConstants.CENTER);
            bilder[i].setVerticalAlignment(SwingConstants.CENTER);
            f.add(bilder[i]);
        }

        for(int i= 0; i<zahlen.length; i++) {
            x = x + 30;

            //Schlüssel
            zahlen[i].setText(LabelName[i]);
            zahlen[i].setPreferredSize(new Dimension(200, 40));
            zahlen[i].setFont(new Font(null, Font.PLAIN, 30));
            zahlen[i].setHorizontalTextPosition(SwingConstants.CENTER);
            zahlen[i].setVerticalAlignment(SwingConstants.CENTER);
            f.add(zahlen[i]);
        }

        for(int i = 0; i< zahlen1.length; i++)
        {
            x= x+30;
          //Werte
          zahlen1[i].setText(LabelName1[i]);
          zahlen1[i].setPreferredSize(new Dimension (200, 40));
          zahlen1[i].setFont(new Font(null,Font.PLAIN,30));
          zahlen1[i].setHorizontalTextPosition(SwingConstants.CENTER);
          zahlen1[i].setVerticalAlignment(SwingConstants.CENTER);
          f.add(zahlen1[i]);
        }


    }

}