import javax.swing.JOptionPane;

public class Seno {
    public void Seno() {
        double grados = 0, resultado = 0; // Inicializamos el resultado en 0
        String continuar = "sí"; // Variable para preguntar si desea ingresar otro número

        // Ciclo para preguntar si se ingresan más números
        while (!continuar.equalsIgnoreCase("no")) {
            // Preguntar al usuario si desea ingresar un número (en grados)
            grados = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un número (en grados)", "Seno", JOptionPane.INFORMATION_MESSAGE));

            // Convertir los grados a radianes utilizando la libreria math
            double radianes = Math.toRadians(grados);

            // Calcular el seno del ángulo en radianes
            resultado = Math.sin(radianes);

            // Se muestra el resultado del seno
            JOptionPane.showMessageDialog(null, "El seno de " + grados + " grados es: \n" + resultado, "Resultado del seno", JOptionPane.INFORMATION_MESSAGE);

            // Preguntar si desea ingresar otro número (si/no)
            continuar = JOptionPane.showInputDialog(null, 
                "¿Desea calcular el seno de otro número? (si/no)", "¿Preguntando?", JOptionPane.INFORMATION_MESSAGE);
        }

        // Mostramos mensaje final
        JOptionPane.showMessageDialog(null, "El cálculo de seno ha finalizado.", "Salir", JOptionPane.INFORMATION_MESSAGE);
    }
}

