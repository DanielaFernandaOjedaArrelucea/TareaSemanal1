package practica;
import java.util.Scanner;

public class PRACTICA {

   
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        String operacion;
        double lado, base, altura, radio;
        double areaTotal;
        System.out.println("Ingrese una opción: cuadrado,rectángulo, triángulo o círculo");
        operacion=lector.nextLine().toLowerCase();
        
        if(operacion.equals("cuadrado")|| operacion.contains("cua")){
            System.out.println("Ingresa el lado: ");
            lado=lector.nextDouble();
            areaTotal=lado*lado;
        }else if(operacion.equals("rectángulo")|| operacion.contains("rec")){
            System.out.println("Ingresa la base y altura: ");
            base=lector.nextDouble();
            altura=lector.nextDouble();
            areaTotal=base*altura;
        }else if(operacion.equals("triángulo")|| operacion.contains("tri")){
            System.out.println("Ingresa la base y altura: ");
            base=lector.nextDouble();
            altura=lector.nextDouble();
            areaTotal=(base*altura)/2;  
        }else if(operacion.equals("círculo")|| operacion.contains("cir")){
        System.out.println("Ingresa el radio ");
            radio=lector.nextDouble();
            areaTotal= Math.PI*Math.pow(radio, 2);
        }else{
           System.out.println("Operacion inválida");
           areaTotal=0;
        }
             System.out.println("El area total es "+areaTotal);
        
    }
    
}
