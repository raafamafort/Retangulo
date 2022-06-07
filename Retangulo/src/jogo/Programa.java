package jogo;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		// RECEBENDO VALORES
		double receberLadoUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado de cima do retangulo: "));
		double receberLadoDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado de baixo do retangulo: "));
		double receberLadoTres = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado esquerdo do retangulo: "));
		double receberLadoQuatro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado direito do retangulo: "));
		
		// OBJETO
		Lados ret = new Lados(receberLadoUm, receberLadoDois, receberLadoTres, receberLadoQuatro);
		
		// OUTPUT
		System.out.println("Um  retangulo formado por lados com valores de: " + ret.getLadoUm() + " " + ret.getLadoDois()
				+ " " + ret.getLadoTres() + " " + ret.getLadoQuatro());

		ret.verificarTipoRetangulo();
	}
}