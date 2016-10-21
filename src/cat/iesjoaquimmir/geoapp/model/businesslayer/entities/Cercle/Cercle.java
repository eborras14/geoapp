
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Cercle;


public class Cercle {
       //<editor-fold defaultstate="collapsed" desc="Estat:Atributs">
    private double radio;
    
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
    public Cercle (double radio){
        this.setRadio(radio);
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
