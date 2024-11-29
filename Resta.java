import javax.swing.JOptionPane;

public class Resta extends Calculadora {
    public void Resta() {
        // Inicializamos 'result' con el primer n�mero que el usuario ingresa.
        int a = 0, result = 0;
        String continuar = "s�"; // Variable para preguntar si desea ingresar otro n�mero

        // Ciclo para preguntar si se ingresan m�s n�meros
        while (!continuar.equalsIgnoreCase("no")) {
            // Aqui el usuario ingresa el primer numero
            if (result == 0) {
                // Si resul es 0, se toma el primer n�mero ingresado como el valor inicial
                result = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer n�mero para la resta", "Resta", JOptionPane.INFORMATION_MESSAGE));
            } else {
                // Si resul tiene un valor acumulado, resta el siguiente n�mero ingresado
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un n�mero a restar", "Resta", JOptionPane.INFORMATION_MESSAGE));
                result -= a; // Operacion donde se hace la resta
            }

            // Se muestra el resultado acumulado
            continuar = JOptionPane.showInputDialog(null, 
                "El resultado acumulado es: " + result + "\n�Desea ingresar otro n�mero? (si/no)", "�Preguntando?", JOptionPane.INFORMATION_MESSAGE);

        }

        // Aquise muestra el resultado final de la resta
        JOptionPane.showMessageDialog(null, "La resta final es: " + result, "Resultado de la resta", JOptionPane.INFORMATION_MESSAGE);
    }
}
