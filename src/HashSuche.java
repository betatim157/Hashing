public class HashSuche {
    private int[] a = new int [10];
    private int mod = 10;

   public HashSuche(){

    }
    public void berechneHash(){

    }

    public int fuegeEin(int wert){
     int k = 0;
     int z;
     z = wert%mod;
     if(a[z] == 0)
     {
         a[z] = wert;
     }else
     {
        for(int i = 0; i< a.length; i++) {
            if(a[z+i] == 0){
                a[z+i] = wert;
            }

        }
     }
     return k;
    }
}
