
package cat.iesjoaquimmir.geoapp.views.console;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square.Square;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.rectangle.rectangle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Cercle.Cercle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Esfera.Esfera;
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
       System.out.printf("6.Surt %n");
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
 }
       }while(opcio!=6);
       
     
       
       
       
       
       
    }
 private static void quadrat(){
      double cuadrat=0;
      Scanner entrada=new Scanner(System.in);
      Square c1 = new Square (1.0);
      System.out.printf("Has escullit el quadrat!!%n");
      System.out.printf("Digues el seu costat:");
        
        cuadrat = entrada.nextDouble();
        
      
          c1.setLado(cuadrat);
          System.out.printf("Area quadrat:%.2f%n",c1.getArea());
          System.out.printf("Perimetre quadrat:%.2f%n",c1.getPerimetre());
 }
 private static void rectangle(){
     Scanner entrada=new Scanner(System.in);
     rectangle b1 = new rectangle (1.0,1.0);
     double rectangleBase=0;
     double rectangleAltura=0;
     System.out.printf("Has escullit el Rectangle!!%n");
        System.out.printf("Digues la seva base:");
        
        rectangleBase = entrada.nextDouble();
       
        System.out.printf("Digues la seva altura:");
        do{
        rectangleAltura = entrada.nextDouble();
        }while(rectangleAltura<=0);
        b1.setBase(rectangleBase);
        b1.setAltura(rectangleAltura);
            System.out.printf("Area rectangle:%.2f%n",b1.getArea());
            System.out.printf("Perimetre rectangle:%.2f%n",b1.getPerimetre());
 }
  private static void rectangle1(){
     Scanner entrada=new Scanner(System.in);
     rectangle b1 = new rectangle (1.0);
     double rectangleBase=0;
     double rectangleAltura=0;
     System.out.printf("Has escullit el Rectangle amb sobrecarrega!!%n");
        System.out.printf("Digues la seva base:");
       
        rectangleBase = entrada.nextDouble();
        
        b1.setBase(rectangleBase);
            System.out.printf("Area rectangle:%.2f%n",b1.getArea());
            System.out.printf("Perimetre rectangle:%.2f%n",b1.getPerimetre());
 }
 private static void cercle(){
   double cercleRadi=0;
   Cercle a1 = new Cercle (1.0);
   Scanner entrada=new Scanner(System.in);
   System.out.printf("Has escullit el Cercle!!%n");
        System.out.printf("Digues el seu radi:");
        
        cercleRadi = entrada.nextDouble();
     
        a1.setRadio(cercleRadi);
            System.out.printf("Area cercle:%.2f%n",a1.getArea());
            System.out.printf("Perimetre cercle:%.2f%n",a1.getPerimetre());  
 }
  private static void esfera(){
    double esferaRadi=0;
       Scanner entrada=new Scanner(System.in);
       Esfera d1 = new Esfera (1.0);
    System.out.printf("Has escullit l'Esfera!!%n");
        System.out.printf("Digues el seu radi:");
       
        esferaRadi = entrada.nextDouble();
        
        d1.setRadio(esferaRadi);
            System.out.printf("Area esfera:%.2f%n",d1.getArea());
            System.out.printf("Perimetre esfera:%.2f%n",d1.getPerimetre());  
  }
    
}
