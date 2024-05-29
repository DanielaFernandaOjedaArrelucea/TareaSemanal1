package ejerciciospc2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SalarioMensual {

    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        String nombre="", apellido="";
        double salario=0;
        boolean datosCompletos=false;
        int opcion;

        Pattern nombresPatron=Pattern.compile("^[A-Za-z\\s]+$");

        String menu="""
                    ######## MENU DE OPCIONES #######
                    # 1. Ingresar Empleado          #
                    # 2. Ingresar Salario           #
                    # 3. Emitir Boleta              #
                    # 4. Salir                      #
                    #################################
                    Seleccione una Opcion: 
                    """;
        
        String impresion="""
                         Resumen de boletas de pago
                         nombre del empleado: %S
                         Apellidos del empleado: %S
                         Tipo: Contratado
                         
                         Salario ENE: %5.2f Salario FEB: %5.2f
                         Salario MAR: %5.2f Salario ABR: %5.2f
                         Salario MAY: %5.2f Salario JUN: %5.2f
                         Salario JUL: %5.2f Salario AGO: %5.2f
                         Salario SEP: %5.2f Salario OCT: %5.2f
                         Salario NOV: %5.2f Salario DIC: %5.2f
                         
                         total: %10.2f
                         descuento: %10.2f
                         """;
        
        do{
            System.out.print(menu);
            opcion=lector.nextInt();

            switch(opcion){
                case 1->{
                    lector.nextLine();
                    System.out.println("ingresar nombre");
                    nombre=lector.nextLine();
                    if(!nombresPatron.matcher(nombre).matches()){
                        System.out.println("nombre invalido");
                        continue;
                    }
                    
                    System.out.println("ingresar apellido");
                    apellido=lector.nextLine();
                    if(!nombresPatron.matcher(apellido).matches()){
                        System.out.println("apellido invalido");
                        continue;
                    }
                }
                case 2->{
                    System.out.println("ingresar salario mensual");
                    salario=lector.nextDouble();
                    
                    if(salario<=0){
                        System.out.println("Ingrese un salario correcto");
                        continue;
                    }
                    
                    datosCompletos=true;
                }
                case 3->{
                    if(!datosCompletos || nombre.isEmpty() || nombre.isBlank() ||
                            apellido.isEmpty() ||apellido.isBlank() || salario<=0){
                        System.out.println("Datos incompletos");
                    }else{
                        System.out.printf(impresion,nombre,apellido,
                                salario,salario,salario,
                                salario,salario,salario,
                                salario,salario,salario,
                                salario,salario,salario,
                                salario*12,salario*0.2);
                        
                    }
                
                }
                case 4->{
                    System.out.println("Saliendo........");
                }
                default->{
                    System.out.println("Opcion no valida");
                }
            }
        }while(opcion!=4);
    }
        
    
    
}