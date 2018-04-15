import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Mandelbrot extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame window;
	
	public Mandelbrot() {
		window = new JFrame("Mandelbrot Set");
		window.setVisible(true);
		window.setSize(600, 600);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.WHITE);
	}
	
	public void iterate(Imaginary i) {
		
	}
	
	@Override
	public void paint(Graphics g) {
		this.getGraphics().drawLine(100, 200, 300, 400);
	}
	
	public static void main(String[] args) {
		Mandelbrot nelsonMandela = new Mandelbrot();
		nelsonMandela.repaint();
	}
}
