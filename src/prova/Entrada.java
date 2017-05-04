package prova;

import javax.swing.JOptionPane;

public class Entrada {

	public static int lerInt(String p){	
		int a ;
		return a = Integer.parseInt(JOptionPane.showInputDialog(p));
	}
	
	public static double lerDouble(String p){	
	double b;
	
	return b = Double.parseDouble(JOptionPane.showInputDialog(p));
	
	}
	
	public static String lerString(String p){
		return  p = JOptionPane.showInputDialog(p);
	}
	
	public static long lerLong(String p){
		long b ;
		return b = Long.parseLong(JOptionPane.showInputDialog(p));
	}
	
	public static void mostra(String p){
		JOptionPane.showMessageDialog(null, p);
	}
}
