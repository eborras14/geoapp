
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color.Color;

public abstract class Shape {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
        private Color backgroundColor;
        private Color foregroundColor;
        private static int counter=0;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes">
        //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
           public Color getBackgroundColor() {
           return backgroundColor;
            }

            public void setBackgroundColor(Color backgroundColor) {
            this.backgroundColor = backgroundColor;
            }

            public Color getForegroundColor() {
            return foregroundColor;
            }

            public void setForegroundColor(Color foregroundColor) {
            this.foregroundColor = foregroundColor;
            }
    
//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Constructors">
            public Shape (Color backgroundColor,Color foregroundColor){
                this.setBackgroundColor(backgroundColor);
                this.setForegroundColor(foregroundColor);
                counter++;
            }
//</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="Metodes d'objecte">
            public static int getCounter(){
                return counter;
            }
//</editor-fold>
//</editor-fold>
     
}
