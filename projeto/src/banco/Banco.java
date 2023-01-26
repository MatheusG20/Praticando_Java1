package banco;

import modelos.Conta;

public class Banco {

	public static void main(String[] args) {
		Conta a = new Conta("Conta 1");
		Conta b = new Conta("Conta 2");
		System.out.println(a.toString());
		System.out.println(b.toString());
		a.depositar(200);
		System.out.println(a.toString());
		a.sacar(300);
	}

}
