
import javax.swing.JOptionPane;

public class Exponente {
    public void Exponente() {
        int base = 0, resul = 1; // Inicializamos resul en 1 para la multiplicaci�n de exponentes
        int exponente = 0;
        String continuar = "s�"; // Variable para preguntar si desea ingresar otro n�mero

        // Ciclo while para preguntar si se ingresan m�s n�meros
        while (!continuar.equalsIgnoreCase("no")) {
            // Aqui ingresamos la base
            base = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un n�mero (base)", "Exponente (base)", JOptionPane.INFORMATION_MESSAGE));
            
            // Preguntamos por el exponente
            exponente = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el exponente", "Exponente", JOptionPane.INFORMATION_MESSAGE));

            // Aplicando el exponente con math
            resul = (int) Math.pow(base, exponente);

            // Mostrar el resultado de la potencia
            JOptionPane.showMessageDialog(null, "El resultado de " + base + " elevado a " + exponente + " es: " + resul, "Resultado del exponente", JOptionPane.INFORMATION_MESSAGE);

            // Preguntar si desea ingresar otro n�mero (si/no)
            continuar = JOptionPane.showInputDialog(null, 
                "�Desea realizar otro c�lculo de exponente? (si/no)", "�Preguntando?", JOptionPane.INFORMATION_MESSAGE);

        }

        // Se muestra el resultado final
        JOptionPane.showMessageDialog(null, "El c�lculo de exponentes ha finalizado.", "Salir", JOptionPane.INFORMATION_MESSAGE);
    }
}
