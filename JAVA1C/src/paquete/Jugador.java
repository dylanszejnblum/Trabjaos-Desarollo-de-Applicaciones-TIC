package paquete;


public class Jugador {
    
    private int fue;
    private int vel;
    private int def;
    private String pos;
    
    public Jugador(int f, int v, int d, String p){
        if (f > 0 && f < 99 && v > 0 && v < 99 && d > 0 && d < 99){
            this.def = d;
            this.vel = v;
            this.fue = f;
            this.pos.equals(p);
        }
        else{
            throw new IllegalArgumentException("0 a 99");
        }
    }
    
    int getFuerza(){
        return this.fue;
    }
    
    int getVelocidad(){
        return this.vel;
    }
    
    int getDefinicion(){
        return this.def;
    }
    
    String getPosicion(){
        return this.pos;
    }
    
    
    
}
