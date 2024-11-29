
package POO_Proy_Paquete;

import java.util.Random;

public class rng_notas_iniciales {
    int max = 20, min = 0;
    Random rand = new Random();
    
    public int rng_()
    {
    int rng_num;
    rng_num = rand.nextInt((max-min+1)+min);
    return rng_num;
    }
    }
    

