package ejerciciospc2;

public class ReporteASCII {
    public static void main(String[] args) {
        // Datos inicializados
        String[] nombres = {
            "JUAN CARLOS GARCIA RODRIG",
            "ANA MARIELA TORRES MONTEZ",
            "ROSA INOÑAN FARRO",
            "CARLOS ALBERTO ROJAS CHAN",
            "GABRIELA LUCIA ALVITES CH"
        };
        int[] edades = {19, 25, 20, 24, 25};
        int[] grados = {5, 5, 4, 5, 5};
        int[] pc1 = {19, 25, 20, 24, 25};
        int[] pc2 = {20, 17, 18, 15, 20};
        int[] pc3 = {19, 18, 15, 12, 14};
        int[] ef = {17, 18, 15, 12, 14};
        double[] promedios = new double[nombres.length];

        // Calcular promedios individuales y promedio total
        double sumaTotal = 0;
        for (int i = 0; i < nombres.length; i++) {
            promedios[i] = (pc1[i] + pc2[i] + pc3[i] + ef[i]) / 4.0;
            sumaTotal += promedios[i];
        }
        double promedioTotal = sumaTotal / nombres.length;

        // Generar reporte ASCII
        StringBuilder reporte = new StringBuilder();
        reporte.append("##############################################################\n");
        reporte.append("NOMBRE                        EDAD GRADO PC1 PC2 PC3 EF PROM\n");
        reporte.append("##############################################################\n");

        for (int i = 0; i < nombres.length; i++) {
            reporte.append(String.format("%-30s %-4d %-5d %-3d %-3d %-3d %-3d %-5.2f\n",
                    nombres[i], edades[i], grados[i], pc1[i], pc2[i], pc3[i], ef[i], promedios[i]));
        }

        reporte.append("##############################################################\n");
        reporte.append(String.format("PROMEDIO TOTAL:                                  %-5.2f\n", promedioTotal));
        reporte.append("##############################################################\n");

        // Imprimir reporte
        System.out.print(reporte.toString());
        
    }
}