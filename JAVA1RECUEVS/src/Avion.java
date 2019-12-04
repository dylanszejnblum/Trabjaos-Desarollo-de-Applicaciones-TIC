
import java.util.ArrayList;
public class Avion {
    private int cantFilas;
    private double precioMaximo;
    public ArrayList<Asiento>asientos = new ArrayList<Asiento>();
    public Avion(int filas, double precio){
        if (filas >= 1){
            cantFilas = filas;
        } else {
            throw new IllegalArgumentException();
        }
        if (precio >= 1){
            precioMaximo = precio;
        } else {
            throw new IllegalArgumentException();
        }
        
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < 7; j++) {
                
                double precioAsiento = precioMaximo;
                if(j==1 || j==5){
                    precioAsiento =(precioMaximo*0.8f);
                }
                if(j==2 || j==4){
                    precioAsiento =(precioMaximo*0.7f);
                }
                if(j==3){
                    precioAsiento =(precioMaximo*0.6f);
                }
                asientos.add(new Asiento(i,j,precioAsiento));
            }
        }
    }
    public Asiento buscar_mas_barato(){
        Asiento masBarato = new Asiento(0,0,precioMaximo);
        double posMenor = precioMaximo;
        for (int i = 0; i < asientos.size(); i++) {
            
                double precioAsiento = asientos.get(i).get_precio();
                
                if(precioAsiento< posMenor && asientos.get(i).esta_vacio() == true){
                     masBarato = asientos.get(i);
                    posMenor = precioAsiento;
                } 
                    
        }
        return masBarato;
    }
    
}