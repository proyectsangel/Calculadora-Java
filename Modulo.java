import javax.swing.JOptionPane;

public class Modulo {
    public void Modulo() {
        int a = 0, resul = 0; // Inicializamos resul en 0 para almacenar el resultado
        String continuar = "s�"; // Variable para preguntar si desea ingresar otro n�mero

        // Ciclo while para preguntar si se ingresan m�s n�meros
        while (!continuar.equalsIgnoreCase("no")) {
            // Aqui se ingresa el primer numero
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un n�mero", "Modulo", JOptionPane.INFORMATION_MESSAGE));

            // Para la primera iteraci�n, establecemos el primer n�mero como el resultado
            if (resul == 0) {
                resul = a;  // El primer n�mero se usa como el valor inicial
            } else {
                // Realizamos el m�dulo entre el resultado acumulado y el n�mero ingresado
                resul %= a;
            }

            // Mostramos el resultado acumulado
            continuar = JOptionPane.showInputDialog(null, 
                "El resultado acumulado es: " + resul + "\n�Desea ingresar otro n�mero? (si/no)", "�Preguntando?", JOptionPane.INFORMATION_MESSAGE);

        }

        // Mostrar el resultado final del m�dulo acumulativo
        JOptionPane.showMessageDialog(null, "El resultado final del m�dulo es: \n" + resul, "Resultado del modulo", JOptionPane.INFORMATION_MESSAGE);
    }
}

