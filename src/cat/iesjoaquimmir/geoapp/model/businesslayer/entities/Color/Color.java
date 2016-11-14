
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color;
import java.util.Random;
public class Color {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private int red;
    private int green;
    private int blue;
    private static int counter=0;
    public static final int MAX_VALUE=255;
    public static final int MIN_VALUE=0;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    
    public int getRed() {
        return red;
    }
    public void setRed(int red) {
        if(red<0 || red > 255){
            throw new IllegalArgumentException(
            String.format("Valor %dno vàlido para la coordenada R",red)
            );
        }
        this.red = red;
    }
    public int getGreen() {
        return green;
    }
    public void setGreen(int green) {
         if(green<0 || green > 255){
            throw new IllegalArgumentException(
            String.format("Valor %dno vàlido para la coordenada R",green)
            );
        }
        this.green = green;
    }
    public int getBlue() {
        return blue;
    }
    public void setBlue(int blue) {
         if(blue<0 || blue > 255){
            throw new IllegalArgumentException(
            String.format("Valor %dno vàlido para la coordenada R",blue)
            );
        }
        this.blue = blue;
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Color (int red, int green, int blue){
        counter++;
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
    }
   
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="mètodes estàtics">
    public static int getCounter(){
        return counter;
    }
    public static  Color fromHexString(String color){
        if (color == null){
            throw new NullPointerException("Es obligatori indicar una" + "cadena de text");
        }
        if (!color.matches("^#[0-9A-Fa-f]{6}$")){
            throw new IllegalArgumentException(
            String.format("El text %s no te format hexadecimal",color)
            );
        }
        return new Color(Integer.parseInt(color.substring(1,3),16),
                        Integer.parseInt(color.substring(3,5),16),
                        Integer.parseInt(color.substring(5,7),16));
    }
    public static Color getRandom (){
      Random aleat = new Random();
      int numero = aleat.nextInt(256);
      return new Color(aleat.nextInt(256), aleat.nextInt(256) , aleat.nextInt(256));
    }
  
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="metodes d'objecte">
    public String toHexString(boolean upper){
        return String.format(upper ? "#%02X%02X%02X" : "#%02x%02x%02x", getRed(), getGreen(), getBlue());
    }
    public String toHexString(){
        return toHexString(true);
    }
    public String toRGBString(boolean upper){
        return String.format(upper ? "RGB(%03d,%03d,%03d)" :  "rgb(%03d,%03d,%03d)", getRed(), getGreen(), getBlue());
    }
    public String toRGBString(){
        return toRGBString(false);
    }
//</editor-fold>
//</editor-fold>

  
    
}
