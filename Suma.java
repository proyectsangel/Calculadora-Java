import javax.swing.JOptionPane;

public class Suma extends Calculadora {
    public void Suma() {
        
        String continuar = "sí"; // Variable para preguntar si desea ingresar otro número

        // Ciclo para preguntar si se ingresan mas numeros
        while (!continuar.equalsIgnoreCase("no")) {
        	
            // Aqui el usuario debe ingresar un numero
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Suma", JOptionPane.INFORMATION_MESSAGE));

            // Se suma el número ingresado al resultado acumulado
            resul += a;

            // Preguntar si se desea ingresar otro numero (si/no) y terminar
            continuar = JOptionPane.showInputDialog(null, 
                "El resultado acumulado es: " + resul + "\n¿Desea ingresar otro número? (si/no)", "¿Preguntando?", JOptionPane.INFORMATION_MESSAGE);

        }

        // Aqui se muestra el resultado final de la suma
        JOptionPane.showMessageDialog(null, "La suma final es: " + resul, "Resultado de la suma", JOptionPane.INFORMATION_MESSAGE);
    }
}
