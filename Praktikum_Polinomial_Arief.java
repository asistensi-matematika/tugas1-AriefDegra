
package praktikum_polinomial_arief;
    import java.util.Scanner;
    public class Praktikum_Polinomial_Arief {
        public static void main(String[] args) {
          Scanner arief = new Scanner(System.in);
          System.out.print(" Input      : ");
          int a = arief.nextInt();int b = arief.nextInt();int c = arief.nextInt();
          System.out.println(" ");
          //Bentuk Polinomial
          if(a != 0 ){
          if(a >0 && b > 0 && c >=0){
              System.out.println("Polinomial "+a+"x^2 +"+b+"x +"+c+" memiliki");
          }else if(a>0 && b>=0 && c <0){
               System.out.println("Polinomial "+a+"x^2 +"+b+"x "+c+" memiliki");
          }else if(a>0 && b<0 && c <0){
               System.out.println("Polinomial "+a+"x^2 "+b+"x "+c+" memiliki");
          }else if(a<0 && b<0 && c <0){
               System.out.println("Polinomial "+a+"x^2 "+b+"x "+c+" memiliki");
          }else if(a<0 && b>=0 && c <0){
               System.out.println("Polinomial "+a+"x^2 +"+b+"x "+c+" memiliki");
          }else if(a<0 && b>=0 && c >=0){
               System.out.println("Polinomial "+a+"x^2 "+b+"x +"+c+" memiliki");
          }else{
               System.out.println("Polinomial "+a+"x^2 "+b+"x +"+c+" memiliki");
          }
          }else{
              System.out.print(" Nilai a tidak boleh 0");
              return;
          }
          //Diskriminan
          double d = (b*b) - (4*a*c); 
          System.out.println("1. Dikriminan                   : "+d);
          
          //Akar-akar
          if (d>=0){
          double m = (-1*b + Math.sqrt(d))/(2*a);
          double n = (-1*b - Math.sqrt(d))/(2*a);
          System.out.println("2. Akar-akar dari polinomial    : "+m+" dan "+n);
          }else{
          double b1 = (-1*b)*0.5;
          double d1 = (-1*d);
          double d2 = Math.sqrt(d1)*0.5;
          double temp = Math.pow(10, 3);
          double d3 = (double) Math.round(d2*temp)/temp;
          if(b1 != 0){
          System.out.println("2. Akar-akar dari polinomial    : "+b1+" + "+d3+"i"+" dan "+b1+" - "+d3+"i");
          }else{
              System.out.println("2. Akar-akar dari polinomial    : " +d3+"i"+" dan -"+d3+"i"); 
          }
          }
          
          //Titik Stasioner
          double r = -1*b;
          double p = r/(2*a);
          double t = -1*d;
          double q = t/(4*a);
          System.out.println("3. Titik stasioner              : ("+p+","+q+")");
          
          //Kecekungan Kurva
          if(a > 0 ){
              System.out.println("4. Kecekungan Kurva             : atas ");
          }else{
              System.out.println("4. Kecekungan Kurva             : bawah");
          }
          
          //Nilai minimum lokal
              System.out.println("5. Nilai minimum lokal          : " +q);
              
          
          
    }
    
}
