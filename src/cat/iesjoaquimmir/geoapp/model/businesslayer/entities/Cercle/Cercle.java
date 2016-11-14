
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Cercle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color.Color;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Shape;

public class Cercle extends Shape {
       //<editor-fold defaultstate="collapsed" desc="Estat:Atributs">
    private double radio;
    public static final double valor_def=1.0;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:Metodes">
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    
    public double getRadio() {
        return radio;
    }

   
    public void setRadio(double radio) {
        if (radio<=0.0){
            throw new IllegalArgumentException(String.format("Valor %f no valid",radio));
        }
        this.radio = radio;
    }
    
 
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Cercle (double radio,Color backgroundColor, Color foregroundColor){
        super(backgroundColor,foregroundColor);
        this.setRadio(radio);
    }
    public Cercle (Color backgroundColor, Color foregroundColor){
        this(valor_def,backgroundColor,foregroundColor);
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
    public double getArea(){
        return Math.PI*getRadio();
    }
     public double getPerimetre(){
        return 2*Math.PI*getRadio();
    }
//</editor-fold>
//</editor-fold>

  
}
