import javax.swing.JOptionPane;

public class Tangente {
    public void Tangente() {
        double grados = 0, resultado = 0; // Inicializamos el resultado en 0
        String continuar = "s�"; // Variable para preguntar si desea ingresar otro n�mero

        // Ciclo para preguntar si se ingresan m�s n�meros
        while (!continuar.equalsIgnoreCase("no")) {
            // Preguntar al usuario si desea ingresar un n�mero (en grados)
            grados = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un n�mero (en grados)", "Tangente", JOptionPane.INFORMATION_MESSAGE));

            // Convertir los grados a radianes
            double radianes = Math.toRadians(grados);

            // Calcular la tangente del �ngulo en radianes
            resultado = Math.tan(radianes);

            // Mostrar el resultado de la tangente
            JOptionPane.showMessageDialog(null, "La tangente de " + grados + " grados es: \n" + resultado, "Resultado de la tangente", JOptionPane.INFORMATION_MESSAGE);

            // Preguntar si desea ingresar otro n�mero (si/no)
            continuar = JOptionPane.showInputDialog(null, 
                "�Desea calcular la tangente de otro n�mero? (si/no)", "�Preguntando?", JOptionPane.INFORMATION_MESSAGE);
        }

        // Mostrar mensaje final
        JOptionPane.showMessageDialog(null, "El c�lculo de tangente ha finalizado.", "Salir", JOptionPane.INFORMATION_MESSAGE);
    }
}

