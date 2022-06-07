package jogo;

public class Lados {

	private double ladoUm;
	private double ladoDois;
	private double ladoTres;
	private double ladoQuatro;
	
	Lados(double recebeLadoUm, double recebeLadoDois, double recebeLadoTres, double recebeLadoQuatro){
		this.setLadoUm(recebeLadoUm);
		this.setLadoDois(recebeLadoDois);
		this.setLadoTres(recebeLadoTres);
		this.setLadoQuatro(recebeLadoQuatro);
	}
	
	public final double getLadoUm() {
		return ladoUm;
	}
	public final void setLadoUm(double ladoUm) {
		this.ladoUm = ladoUm;
	}
	public final double getLadoDois() {
		return ladoDois;
	}
	public final void setLadoDois(double ladoDois) {
		this.ladoDois = ladoDois;
	}
	public final double getLadoTres() {
		return ladoTres;
	}
	public final void setLadoTres(double ladoTres) {
		this.ladoTres = ladoTres;
	}
	public final double getLadoQuatro() {
		return ladoQuatro;
	}
	public final void setLadoQuatro(double ladoQuatro) {
		this.ladoQuatro = ladoQuatro;
	}
	
	void verificarTipoRetangulo() {
		if (this.ladoUm == this.ladoDois && this.ladoTres == this.ladoQuatro) {
			System.out.println("É um Retangulo");
		} else {
			System.out.println("Não é Retangulo");
		}
	}
}