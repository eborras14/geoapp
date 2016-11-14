package cat.iesjoaquimmir.geoapp.model.businesslayer.entities.rectangle;

import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color.Color;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Shape;


public class rectangle extends Shape {
     //<editor-fold defaultstate="collapsed" desc="Estat:Atributs">
    private double base;
    private double altura=10.0;
    public static final double valor_defB=1.0;
    public static final double valor_defA=1.0;
    private Color backgroundColor;
    private Color foregroundColor;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:Metodes">
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    
     public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base<=0.0){
            throw new IllegalArgumentException(String.format("Valor %f no valid",base));
        }
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura<=0.0){
            throw new IllegalArgumentException(String.format("Valor %f no valid",altura));
        }
        this.altura = altura;
    }


//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public rectangle (double base , double altura,Color backgroundColor,Color foregroundColor){
        super(backgroundColor,foregroundColor);
        this.setBase(base);
        this.setAltura(altura);
    }
 
     public rectangle (double base,Color backgroundColor,Color foregroundColor){
        super(backgroundColor,foregroundColor);
        this.setBase(base);
    }
    public rectangle (double base,double altura){
        this(base,altura,new Color(Color.MAX_VALUE,Color.MAX_VALUE,Color.MAX_VALUE),new Color(Color.MIN_VALUE,Color.MIN_VALUE,Color.MIN_VALUE));
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
    public double getArea(){
        return getBase()*getAltura();
    }
     public double getPerimetre(){
        return 2*(getBase()+getAltura());
    }
  
    
//</editor-fold>
//</editor-fold>

  

   
}
