import javax.swing.JOptionPane;

public class Division extends Calculadora {
    public void Division() {
        float a = 0, resul = 0; // Inicializamos resul en 0 para almacenar el resultado
        String continuar = "sí"; // Variable para preguntar si desea ingresar otro número

        // Ciclo para preguntar si se ingresan más números
        while (!continuar.equalsIgnoreCase("no")) {
            // Aqui se ingresa el primer numero
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número", "Division", JOptionPane.INFORMATION_MESSAGE));

            // Para la primera iteración, establecemos el primer número como el resultado
            if (resul == 0) {
                resul = a;
            } else {
                // Verificamos si el número ingresado no es cero para evitar la división por cero
                if (a != 0) {
                    resul /= a;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se puede dividir entre cero.\n Ingrese otro numero.!", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;  // Vuelve a pedir otro número sin afectar el resultado
                }
            }

            // Preguntar si desea ingresar otro número (si/no)
            continuar = JOptionPane.showInputDialog(null, 
                "El resultado acumulado es: " + resul + "\n¿Desea ingresar otro número? (si/no)", "¿Preguntando?", JOptionPane.INFORMATION_MESSAGE);

        }

        // Mostrar el resultado final de la división
        JOptionPane.showMessageDialog(null, "El resultado final de la división es: \n" + resul, "Resultado de la division", JOptionPane.INFORMATION_MESSAGE);
    }
}

