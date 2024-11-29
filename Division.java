import javax.swing.JOptionPane;

public class Division extends Calculadora {
    public void Division() {
        float a = 0, resul = 0; // Inicializamos resul en 0 para almacenar el resultado
        String continuar = "s�"; // Variable para preguntar si desea ingresar otro n�mero

        // Ciclo para preguntar si se ingresan m�s n�meros
        while (!continuar.equalsIgnoreCase("no")) {
            // Aqui se ingresa el primer numero
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un n�mero", "Division", JOptionPane.INFORMATION_MESSAGE));

            // Para la primera iteraci�n, establecemos el primer n�mero como el resultado
            if (resul == 0) {
                resul = a;
            } else {
                // Verificamos si el n�mero ingresado no es cero para evitar la divisi�n por cero
                if (a != 0) {
                    resul /= a;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se puede dividir entre cero.\n Ingrese otro numero.!", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;  // Vuelve a pedir otro n�mero sin afectar el resultado
                }
            }

            // Preguntar si desea ingresar otro n�mero (si/no)
            continuar = JOptionPane.showInputDialog(null, 
                "El resultado acumulado es: " + resul + "\n�Desea ingresar otro n�mero? (si/no)", "�Preguntando?", JOptionPane.INFORMATION_MESSAGE);

        }

        // Mostrar el resultado final de la divisi�n
        JOptionPane.showMessageDialog(null, "El resultado final de la divisi�n es: \n" + resul, "Resultado de la division", JOptionPane.INFORMATION_MESSAGE);
    }
}

