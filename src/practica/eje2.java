package practica;
import java.util.Scanner;

public class eje2 {

   
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        String celular;
        int plan;
        double precioCelular, descuento, pagoFinal;
        
        System.out.println("Ingresa la marca de celular (nombres de celulares)");
        celular=lector.nextLine().toLowerCase();
        //lector.nextLine();
        System.out.println("Ingresa el plan 6,12 o 18 meses");
        plan=lector.nextInt();
        
        precioCelular=switch(celular){
            case "motorola"->29.9;
            case "lg"->36;
            case "samsung"->46.80;
            case "huawei"->62;
            case "iphone"->71;
            default->0;
        };
        descuento=switch(plan){
            case 6->13.2;
            case 12->12;
            case 18-> 11.2;
            default->0;
        };
        pagoFinal=precioCelular-(precioCelular*(descuento/100));
        
        String resumen="""
                       RESUMEN DE COMPRA
                       marca celular %S
                       precio celular %f
                       plan d%
                       descuento %f
                       precio Final %f
                       """;
        System.out.printf(resumen,celular,precioCelular,plan,descuento,pagoFinal);
        
        
        
    }
    
}
