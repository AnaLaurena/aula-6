package model;

public class ContaCorrente extends Conta {
		private double ValorTaxa;
	
		ContaCorrente(String Email, double ValorTaxa) {
			super (Email);
			this.ValorTaxa = ValorTaxa;
			
		}
		public String Saque (double valorSaque) {	
			if(valorSaque <= Saldo) {
			Saldo =- ValorTaxa;
				Saldo =- valorSaque;
			return ("Valor Sacado:" + valorSaque 
					+"\nValor Saldo Após o Saque:"
					+ Saldo
					);
			}else {
				return "Saldo insuficiente";
			}
					
		}
		public String Deposito (double valorDeposito) {
			Saldo += valorDeposito;
			return ("Valor Sacado;" + valorDeposito 
					+ "\nValor saldo Após o Saque :"
					+ Saldo);
			
			
		}
		 public double getsaldo( ) {
return Saldo;
		 }

		
	
		  
}
		 
		 
		 
		 