import javax.swing.JOptionPane;

public class Multi extends Calculadora {
    public void Multi() {
        int a = 0, resul = 1; // Inicializamos resul en 1 para la multiplicaci�n
        String continuar = "s�"; // Variable para preguntar si desea ingresar otro n�mero

        // Ciclo while para preguntar si se ingresan m�s n�meros
        while (!continuar.equalsIgnoreCase("no")) {
            // Aqui se ingresa el primer numero
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un n�mero", "Multiplicacion", JOptionPane.INFORMATION_MESSAGE));

            // Multiplicar el n�mero ingresado al resultado acumulado
            resul *= a;

            // Preguntar si desea ingresar otro n�mero (si/no)
            continuar = JOptionPane.showInputDialog(null, 
                "El resultado acumulado es: " + resul + "\n�Desea ingresar otro n�mero? (si/no)", "�Preguntando?", JOptionPane.INFORMATION_MESSAGE);

        }

        // Mostrar el resultado final de la multiplicaci�n
        JOptionPane.showMessageDialog(null, "El resultado final de la multiplicaci�n es: \n" + resul, "Resultado de la multiplicacion", JOptionPane.INFORMATION_MESSAGE);
    }
}
