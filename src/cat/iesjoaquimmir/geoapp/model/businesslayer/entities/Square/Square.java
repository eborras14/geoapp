package cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square;


public class Square  {
    //<editor-fold defaultstate="collapsed" desc="Estat:Atributs">
    private double lado;
    
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
    public Square (double lado){
        this.setLado(lado);
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
