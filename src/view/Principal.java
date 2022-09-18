package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {

		FatController fat = new FatController();

		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 20"));
		
		if (num < 0 || num > 20) {
			System.out.println("Valor invalido");
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 20"));
		}

		long res = fat.fatorial(num);
		System.out.println("Resultado fatorial: " + res);
	}
}
