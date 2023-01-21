package modelo.entidade;

import modelo.excecao.DominioExcecao;

public class Conta {

	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;

	public Conta() {
	}

	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public void SetNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer GetNumero() {
		return numero;
	}

	public void SetTitular(String titular) {
		this.titular = titular;
	}

	public String GetTitular() {
		return titular;
	}

	public Double GetSaldo() {
		return saldo;
	}

	public void SetLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public Double GetLimiteSaque() {
		return limiteSaque;
	}

	public Double Deposito(Double quantidade) {
		return saldo += quantidade;
	}

	public Double Saque (Double quantidade) throws DominioExcecao {
			if(quantidade > saldo) {
			throw new DominioExcecao ("Sem saldo suficiente");
			}
			if(quantidade > limiteSaque) {
				throw new DominioExcecao ("Excedeu o limite de Saque");
			}
		
		return saldo -= quantidade;
	}

}
