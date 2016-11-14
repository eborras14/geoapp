package cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Shape;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color.Color;


public class Square extends Shape  {
    //<editor-fold defaultstate="collapsed" desc="Estat:Atributs">
    private double lado;
    public static final double valor_def=1.0;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:Metodes">
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado<=0.0){
            throw new IllegalArgumentException(String.format("Valor %f no valid",lado));
        }
        this.lado = lado;
    }
 
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
  
//    public Square (){
//        this(valor_def);
//    }
    public Square (double lado , Color backgroundColor , Color foregroundColor){
        super(backgroundColor,foregroundColor);
        this.setLado(lado);
       
    }
      public Square (double lado){
        this(lado,new Color(Color.MAX_VALUE,Color.MAX_VALUE,Color.MAX_VALUE),new Color(Color.MIN_VALUE,Color.MIN_VALUE,Color.MIN_VALUE));
        
        
        
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
    public double getArea(){
        return Math.pow(getLado(),2);
    }
     public double getPerimetre(){
        return 4*getLado();
    }
 
//</editor-fold>
//</editor-fold>

    

} 
