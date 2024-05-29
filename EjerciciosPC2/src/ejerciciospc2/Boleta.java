package ejerciciospc2;

public class Boleta {
    public static void main (String[] args){
        long[] codigo = {7754125852147L, 7752563210489L, 7796525415L};
        String[] producto = {"DETERGENTE ULTRA", "JAM.PIZZA", "LECHE EN CAJA"};
        int[] cantidad = {6, 2, 12};
        double[] precioU = {3.25, 12.90, 30.50};
        String[] equis = {"X", "X", "X"};
        
        double[] monto = new double[producto.length];
        
        double sumaTotal = 0;
        for (int i = 0; i < producto.length; i++) {
            monto[i] = cantidad[i] * precioU[i];
            sumaTotal += monto[i];
        }

        double igv = sumaTotal * 0.18;
        double importeTotal = sumaTotal + igv;

        StringBuilder sb = new StringBuilder();

        sb.append("                 TIENDA ABC                    \n");
        sb.append("\n\n");
        sb.append("              RUC: 21521458563                 \n");
        sb.append("                Chiclayo-Peru                  \n");
        sb.append("\n");
        sb.append("CAJERO: ROSA\n");

        for (int i = 0; i < codigo.length; i++) {
            sb.append(String.format("%-15d %-20s \n", codigo[i], producto[i]));
            sb.append(String.format("\t\t%-3d %-6s %-10.2f %-10.2f\n", cantidad[i], equis[i], precioU[i], monto[i]));
        }
        
        
        sb.append("\n\n");
        sb.append("OP. GRAVADA:   \t").append(String.format("%.2f", sumaTotal)).append("\n");
        sb.append("I.G.V:         \t").append(String.format("%.2f", igv)).append("\n");
        sb.append("IMPORTE TOTAL: \t").append(String.format("%.2f", importeTotal)).append("\n");
        sb.append("\n");
        sb.append("---------------------------------------------\n");
        sb.append("CLIENTE: CARLOS\n");
        sb.append("---------------------------------------------\n");

        System.out.println(sb.toString());
    }
}
