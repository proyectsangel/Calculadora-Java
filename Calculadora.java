import javax.swing.JOptionPane;

public class Calculadora {
	
	int a, b, resul;
	

	public static void main(String[] args) {
		
		int opc = 0;
		
		do {
			try {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "**************Calculadora************** \n Elija una opcion: \n1. Suma \n 2. Resta \n 3. Multiplicacion \n"
					+ "4. Division \n 5. Exponente \n 6. Modulo \n 7. Seno \n 8. Coseno \n 9. Tangente \n 10. Salir", "Menú Principal", JOptionPane.INFORMATION_MESSAGE));
			
			Suma s = new Suma();
			Resta r = new Resta();
			Multi m = new Multi();
			Division d = new Division();
			Exponente e = new Exponente();
			Modulo mo = new Modulo();
			Seno se = new Seno();
			Coseno c = new Coseno();
			Tangente t = new Tangente();
			
			switch(opc) {
			
			case 1:
				s.Suma();
				break;
				
			case 2:
				r.Resta();
				break;
				
			case 3:
				m.Multi();
				break;
				
			case 4:
				d.Division();
				break;
				
			case 5:
				e.Exponente();
				break;
				
			case 6:
				mo.Modulo();
				break;
				
			case 7:
				se.Seno();
				break;
				
			case 8:
				c.Coseno();
				break;
				
			case 9:
				t.Tangente();
				break;
				
			case 10:
				Salir();
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Ingresa una de las opciones..!!", "Error", JOptionPane.ERROR_MESSAGE);
				break;
			
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error.!! Ingrese un numero..!", "Error", JOptionPane.ERROR_MESSAGE);
			
		}
		}while(opc != 10);
		
		

	}
	
	public static void Salir() {
		
		JOptionPane.showMessageDialog(null, "Programa terminado...!!", "Salida...", JOptionPane.INFORMATION_MESSAGE);
		
	}

}


