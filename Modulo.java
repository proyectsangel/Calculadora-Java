import javax.swing.JOptionPane;

public class Modulo {
    public void Modulo() {
        int a = 0, resul = 0; // Inicializamos resul en 0 para almacenar el resultado
        String continuar = "sí"; // Variable para preguntar si desea ingresar otro número

        // Ciclo while para preguntar si se ingresan más números
        while (!continuar.equalsIgnoreCase("no")) {
            // Aqui se ingresa el primer numero
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número", "Modulo", JOptionPane.INFORMATION_MESSAGE));

            // Para la primera iteración, establecemos el primer número como el resultado
            if (resul == 0) {
                resul = a;  // El primer número se usa como el valor inicial
            } else {
                // Realizamos el módulo entre el resultado acumulado y el número ingresado
                resul %= a;
            }

            // Mostramos el resultado acumulado
            continuar = JOptionPane.showInputDialog(null, 
                "El resultado acumulado es: " + resul + "\n¿Desea ingresar otro número? (si/no)", "¿Preguntando?", JOptionPane.INFORMATION_MESSAGE);

        }

        // Mostrar el resultado final del módulo acumulativo
        JOptionPane.showMessageDialog(null, "El resultado final del módulo es: \n" + resul, "Resultado del modulo", JOptionPane.INFORMATION_MESSAGE);
    }
}

