import javax.swing.JOptionPane;

public class Tangente {
    public void Tangente() {
        double grados = 0, resultado = 0; // Inicializamos el resultado en 0
        String continuar = "sí"; // Variable para preguntar si desea ingresar otro número

        // Ciclo para preguntar si se ingresan más números
        while (!continuar.equalsIgnoreCase("no")) {
            // Preguntar al usuario si desea ingresar un número (en grados)
            grados = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un número (en grados)", "Tangente", JOptionPane.INFORMATION_MESSAGE));

            // Convertir los grados a radianes
            double radianes = Math.toRadians(grados);

            // Calcular la tangente del ángulo en radianes
            resultado = Math.tan(radianes);

            // Mostrar el resultado de la tangente
            JOptionPane.showMessageDialog(null, "La tangente de " + grados + " grados es: \n" + resultado, "Resultado de la tangente", JOptionPane.INFORMATION_MESSAGE);

            // Preguntar si desea ingresar otro número (si/no)
            continuar = JOptionPane.showInputDialog(null, 
                "¿Desea calcular la tangente de otro número? (si/no)", "¿Preguntando?", JOptionPane.INFORMATION_MESSAGE);
        }

        // Mostrar mensaje final
        JOptionPane.showMessageDialog(null, "El cálculo de tangente ha finalizado.", "Salir", JOptionPane.INFORMATION_MESSAGE);
    }
}

