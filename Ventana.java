import javax.swing.JFrame;

public class Ventana extends JFrame{
		public void Ventana() {
			setSize(500,500);
		}
		
		public static void main(String[] args) {
			Ventana ventana = new Ventana ();
			ventana.setVisible(true);
		}
}
