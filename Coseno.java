import javax.swing.JOptionPane;

public class Coseno {
    public void Coseno() {
        double grados = 0, resultado = 0; // Inicializamos el resultado en 0
        String continuar = "s�"; // Variable para preguntar si desea ingresar otro n�mero

        // Ciclo para preguntar si se ingresan m�s n�meros
        while (!continuar.equalsIgnoreCase("no")) {
            // Aqui el usuario ingresa el numero
            grados = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un n�mero (en grados)", "Coseno", JOptionPane.INFORMATION_MESSAGE));

            // Convertir los grados a radianes utilizando la libreria math
            double radianes = Math.toRadians(grados);

            // Calcular el coseno del �ngulo en radianes
            resultado = Math.cos(radianes);

            // Mostrar el resultado del coseno
            JOptionPane.showMessageDialog(null, "El coseno de " + grados + " grados es: \n" + resultado, "Resultado del coseno", JOptionPane.INFORMATION_MESSAGE);

            // Preguntar si desea ingresar otro n�mero (si/no)
            continuar = JOptionPane.showInputDialog(null, 
                "�Desea calcular el coseno de otro n�mero? (si/no)", "�Preguntando?", JOptionPane.INFORMATION_MESSAGE);
        }

        // Mostrar mensaje final
        JOptionPane.showMessageDialog(null, "El c�lculo de coseno ha finalizado.", "Salir", JOptionPane.INFORMATION_MESSAGE);
    }
}
