
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Esfera;

import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color.Color;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Shape;

public class Esfera extends Shape{
       //<editor-fold defaultstate="collapsed" desc="Estat:Atributs">
    private double radio;
    public static final double valor_def=1.0;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:Metodes">
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
   /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
          if (radio<=0.0){
            throw new IllegalArgumentException(String.format("Valor %f no valid",radio));
        }
        this.radio = radio;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Esfera (double radio,Color backgroundColor, Color foregroundColor){
        super(backgroundColor,foregroundColor);
        this.setRadio(radio);
    }
    public Esfera (){
        this(valor_def,null,null);
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
    public double getArea(){
        return 4*Math.PI*Math.pow(getRadio(),2);
    }
    public double getPerimetre(){
        return (4/3*Math.PI)*Math.pow(getRadio(),3);
    }
    
//</editor-fold>
//</editor-fold>

   
}
