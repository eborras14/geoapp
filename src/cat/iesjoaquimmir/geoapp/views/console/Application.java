
package cat.iesjoaquimmir.geoapp.views.console;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square.Square;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.rectangle.rectangle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Cercle.Cercle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Esfera.Esfera;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color.Color;
import java.io.PrintStream;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
      int opcio;
      
       do{
       
       Scanner entrada=new Scanner(System.in);
       System.out.printf("1.Quadrat %n");
       System.out.printf("2.Rectangle %n");
       System.out.printf("3.Cercle %n");
       System.out.printf("4.Esfera %n");
       System.out.printf("5.Rectangle (amb sobrecarrega) %n");
       System.out.printf("6.Color hexadecimal %n");
       System.out.printf("7.Color RGB aleatori %n");
       System.out.printf("8.Surt %n");
       System.out.printf("Quina figura vols? %n");
       opcio = entrada.nextInt();   
       switch (opcio) {
 
        case 1:
        quadrat (); 
        break;
        case 2:
        rectangle();
        break;
        case 3:
        cercle();
        break;
        case 4:
        esfera();
        break;
        case 5:
        rectangle1();
        break;
        case 6:
        color();
        break;
        case 7:
        colorRandom();
        break;
 }
       }while(opcio!=8);  
    }
  
  private static void colorRandom(){
      Color co3 = Color.getRandom();
      System.out.printf("%d %d %d %n%n%n",co3.getRed(),co3.getGreen(),co3.getBlue()); 
      System.out.printf("%co1 -> %s %n",co3.toHexString()); 
      System.out.printf("%d %d %d %n%n%n",co3.toRGBString(true)); 
      System.out.printf("%d %d %d %n%n%n",co3.toRGBString(false)); 
      System.out.printf("%d %d %d %n%n%n",co3.toRGBString()); 
  }
  private static void color(){
      String colorR=null;
      Scanner entrada=new Scanner(System.in);
      Color co1 = new Color (125,125,255);
      System.out.printf("Color hexadecimal:");
      colorR = entrada.next();
      Color co2 = Color.fromHexString(colorR);
      System.out.printf("r: %d g: %d b:%d %n%n%n", co2.getRed(),co2.getGreen(),co2.getBlue());
      System.out.printf("r: %d g: %d b:%d %n", co1.getRed(),co1.getGreen(),co1.getBlue());  
      System.out.printf("co1 -> %s %n",co1.toHexString(true));
      System.out.printf("co1 -> %s %n%n",co1.toHexString(false));
      
  }
    
 private static void quadrat(){
      double cuadrat=0;
      Scanner entrada=new Scanner(System.in);
      Color cb = Color.getRandom();
      Color cf = Color.getRandom();
      System.out.printf("Has escullit el quadrat!!%n");
      System.out.printf("Digues el seu costat:");
         cuadrat = entrada.nextDouble();
         Square c1 = new Square (cuadrat,cb,cf);
         Square c2 = new Square (cuadrat);
         //Square c1_sobrecarrega = new Square ();
         
          System.out.printf("Area quadrat:%.2f%n",c1.getArea());
          System.out.printf("Perimetre quadrat:%.2f%n",c1.getPerimetre());
          System.out.printf("Color fons:%s %nColor vora: %s%n",c1.getBackgroundColor().toHexString(),c1.getForegroundColor().toHexString());
          System.out.printf("<-----COLORS PER DEFECTE---->%n");
          System.out.printf("Color fons:%s %nColor vora: %s%n",c2.getBackgroundColor().toHexString(),c2.getForegroundColor().toHexString());
          System.out.printf("Comptador: %d%n",Square.getCounter());
//          System.out.printf("Area quadrat:%.2f%n",c1_sobrecarrega.getArea());
//          System.out.printf("Perimetre quadrat:%.2f%n",c1_sobrecarrega.getPerimetre());
 }
 private static void rectangle(){
     Scanner entrada=new Scanner(System.in);
     Color co33 = Color.getRandom();
     Color co34 = Color.getRandom();
     double rectangleBase=0;
     double rectangleAltura=0;
     System.out.printf("Has escullit el Rectangle!!%n");
        System.out.printf("Digues la seva base:");
        
        rectangleBase = entrada.nextDouble();
       
        System.out.printf("Digues la seva altura:");
        do{
        rectangleAltura = entrada.nextDouble();
        }while(rectangleAltura<=0);
        rectangle b1_c= new rectangle (rectangleBase,rectangleAltura,co33,co34);
            System.out.printf("Area rectangle:%.2f%n",b1_c.getArea());
            System.out.printf("Perimetre rectangle:%.2f%n",b1_c.getPerimetre());
            System.out.printf("Color fons:%s %nColor vora: %s%n",b1_c.getBackgroundColor().toHexString(),b1_c.getForegroundColor().toHexString());
//            rectangle b1_s = new rectangle ();
            rectangle b2 = new rectangle (rectangleBase,rectangleAltura);
            System.out.printf("<-----COLORS PER DEFECTE---->%n");
            System.out.printf("Color fons:%s %nColor vora: %s%n",b2.getBackgroundColor().toHexString(),b2.getForegroundColor().toHexString());
//            System.out.printf("Area quadrat:%.2f%n",b1_s.getArea());
//            System.out.printf("Perimetre quadrat:%.2f%n",b1_s.getPerimetre());
 }
  private static void rectangle1(){
     Scanner entrada=new Scanner(System.in);
     
     double rectangleBase=0;
     double rectangleAltura=0;
     System.out.printf("Has escullit el Rectangle amb sobrecarrega!!%n");
        System.out.printf("Digues la seva base:");
       Color cb = Color.getRandom();
      Color cf = Color.getRandom();
        rectangleBase = entrada.nextDouble();
        rectangle b1 = new rectangle (rectangleBase,cb,cf);
       
            System.out.printf("Area rectangle:%.2f%n",b1.getArea());
            System.out.printf("Perimetre rectangle:%.2f%n",b1.getPerimetre());
 }
 private static void cercle(){
   double cercleRadi=0;
   
   Scanner entrada=new Scanner(System.in);
   System.out.printf("Has escullit el Cercle!!%n");
        System.out.printf("Digues el seu radi:");
        Color cb = Color.getRandom();
        Color cf = Color.getRandom();
        cercleRadi = entrada.nextDouble();
        Cercle a1 = new Cercle (cercleRadi,cb,cf);
        Cercle a1_s = new Cercle (cercleRadi,cb,cf);
            System.out.printf("Area cercle:%.2f%n",a1.getArea());
            System.out.printf("Perimetre cercle:%.2f%n",a1.getPerimetre());
            
            System.out.printf("<-----S O B R E C A R R E G A ---->%n");
            System.out.printf("Area quadrat:%.2f%n",a1_s.getArea());
            System.out.printf("Perimetre quadrat:%.2f%n",a1_s.getPerimetre());
 }
  private static void esfera(){
    double esferaRadi=0;
       Scanner entrada=new Scanner(System.in);
    System.out.printf("Has escullit l'Esfera!!%n");
        System.out.printf("Digues el seu radi:");
        Color cb = Color.getRandom();
        Color cf = Color.getRandom();
        esferaRadi = entrada.nextDouble();
        Esfera d1 = new Esfera (esferaRadi,cb,cf);
        Esfera d1_s = new Esfera ();
            System.out.printf("Area esfera:%.2f%n",d1.getArea());
            System.out.printf("Perimetre esfera:%.2f%n",d1.getPerimetre()); 
            System.out.printf("<-----S O B R E C A R R E G A ---->%n");
            System.out.printf("Area esfera:%.2f%n",d1_s.getArea());
            System.out.printf("Perimetre esfera:%.2f%n",d1_s.getPerimetre());
  }
    
}
