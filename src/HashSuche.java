public class HashSuche {
    //Attribute für Array und Schlüssel
    private final int[] zahlen = new int [10];
    private final double[] zahlen1 = new double[10];
    private final int mod = 10;

   public HashSuche(){

    }
    public int berechneHash(int pSchlüssel){
     return (pSchlüssel%10);
    }
    //Fügt einen Wert ein
    public int fuegeEin(int pSchlüssel,double wert){
     int k = 0;
     int z;
     z = pSchlüssel%mod; //Rest wird berechnet und danach sortiert
     if(zahlen[z] == 0)
     {
         zahlen[z] = pSchlüssel; //Schlüssel wird direkt eingefügt da dort noch kein Wert liegt
         zahlen1[z] = wert;
     }else
     {
        for(int i = 0; i< zahlen.length-1; i++)
        {
         if(z+i!=9)
            {
                k++;
                if(zahlen[z+i] == 0)
                {
                    zahlen[z + i] = pSchlüssel;
                    zahlen1[z + i] = wert;
                    return k;
                }
            }else{
             break;
         }
        }
     }
     return -1;
    }

    public int suchePositionVon(int pSchlüssel){
       int b = -1; //Wenn -1 dann ausgeben wird heißt das der Schlüssel garnicht vorliegt
       for(int i = 0; i<9; i++)
       {
           if(zahlen[i] == pSchlüssel)
           {
               return i; // Dort wurde dann die Stelle gefunden
           }
       }
       return b;
    }
    public double gibWertVon(int pSchlüssel){ //ähnlich wie die vorherige Methode diesmal jedoch mit anderem Array und Wert wird ausgegeben
       double b = -1; //Wenn -1 dann ausgeben wird heißt das der Schlüssel garnicht vorliegt
        for(int i = 0; i <9; i++)
        {
            if(zahlen[i] == pSchlüssel)
            {
                return zahlen1[i];// Dort wurde dann die Stelle gefunden
            }
        }
        return b;
    }
    //Relevant für Gui
    public String gibSchlüssel(int Stelle)
    {
        int i = zahlen[Stelle];
        if(i == 0){
            return "Null";
        }else {
            String Value = Integer.toString(i);
            return Value;
        }
    }

   //Relevant für Gui
    public String gibWert(int Stelle)
    {
        double d = zahlen1[Stelle];
        if(d == 0){
           return "Null";
        }else{
            String Value = Double.toString(d);
            return Value;
        }
    }

    public void showarray(){
        System.out.println(java.util.Arrays.toString(zahlen));
        System.out.println(java.util.Arrays.toString(zahlen1));
       }



}
