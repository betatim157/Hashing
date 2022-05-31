public class HashSuche {
    private int[] zahlen = new int [10];
    private double[] zahlen1 = new double[10];
    private int mod = 10;

   public HashSuche(){

    }
    public void berechneHash(){

    }

    public int fuegeEin(int pSchlüssel,double wert){
     int k = 0;
     int z;
     z = pSchlüssel%mod;
     if(zahlen[z] == 0)
     {
         zahlen[z] = pSchlüssel;
         zahlen1[z] = wert;
     }else
     {
        for(int i = 1; i< zahlen.length; i++)
        {
            k++;
            if(zahlen[z+i] == 0)
            {
                zahlen[z+i] = pSchlüssel;
                zahlen1[z+i] = wert;
            }
            if(i==9){
                System.out.println("Alle Felder sind belget.");
            }

        }
     }
     return k;
    }
}
