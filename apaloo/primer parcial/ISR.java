package EjercicioTres;
public class ISR {
    double limiteInferior, limiteSuperior, cuotaFija, porcentaje;

    // Constructor
    public ISR(double limiteInferior, double limiteSuperior, double cuotaFija, double porcentaje){
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.cuotaFija = cuotaFija;
        this.porcentaje = porcentaje;
    }

    public String toString(){
        return "Limite Inferior: " + limiteInferior + ", Limite Superior: " + limiteSuperior +
                ", Cuota Fija: " + cuotaFija + ", Porcentaje: " + porcentaje;
    }

    // Método para calcular el impuesto según el ingreso
    private static double pagarImpuestos(ISR[][] tablaISR, double ingreso) {
        // Iterar sobre las filas de la tabla ISR
        for (int i = 0; i < tablaISR.length; i++) {
            ISR filaActual = tablaISR[i][0];

            // Si el ingreso cae dentro del intervalo de la fila actual
            if (ingreso >= filaActual.limiteInferior && ingreso <= filaActual.limiteSuperior) {
                // Calcular ISR
                double impuesto = filaActual.cuotaFija + (ingreso - filaActual.limiteInferior) * (filaActual.porcentaje / 100);
                return impuesto;
            }
        }

        return 0.0;
    }

    public static void main(String[] args) {
        // Crear la tabla de ISR (8 filas, 4 columna)
        ISR[][] tablaISR = {
                {new ISR(0.01, 5952.84, 0.00, 1.92)},
                {new ISR(5952.85, 50524.92, 114.24, 6.40)},
                {new ISR(50524.93, 88793.04, 2966.76, 10.88)},
                {new ISR(88793.05, 103218.00, 7130.88, 16.00)},
                {new ISR(103218.01, 123580.20, 9438.60, 17.92)},
                {new ISR(123580.21, 249243.48, 13087.44, 21.36)},
                {new ISR(249243.49, 392841.96, 39929.04, 23.52)},
                {new ISR(392841.97, Double.MAX_VALUE, 73703.40, 30.00)}
        };

        double ingreso = 5000.00;
        double impuestoAPagar = pagarImpuestos(tablaISR, ingreso);
        System.out.println("El impuesto a pagar es: " + impuestoAPagar);
    }
}
