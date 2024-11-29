import javax.swing.JOptionPane;

public class Multi extends Calculadora {
    public void Multi() {
        int a = 0, resul = 1; // Inicializamos resul en 1 para la multiplicación
        String continuar = "sí"; // Variable para preguntar si desea ingresar otro número

        // Ciclo while para preguntar si se ingresan más números
        while (!continuar.equalsIgnoreCase("no")) {
            // Aqui se ingresa el primer numero
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número", "Multiplicacion", JOptionPane.INFORMATION_MESSAGE));

            // Multiplicar el número ingresado al resultado acumulado
            resul *= a;

            // Preguntar si desea ingresar otro número (si/no)
            continuar = JOptionPane.showInputDialog(null, 
                "El resultado acumulado es: " + resul + "\n¿Desea ingresar otro número? (si/no)", "¿Preguntando?", JOptionPane.INFORMATION_MESSAGE);

        }

        // Mostrar el resultado final de la multiplicación
        JOptionPane.showMessageDialog(null, "El resultado final de la multiplicación es: \n" + resul, "Resultado de la multiplicacion", JOptionPane.INFORMATION_MESSAGE);
    }
}
