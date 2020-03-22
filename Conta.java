
package conta;

import Cliente.Cliente;
import java.util.Locale;
import java.util.Scanner;


public class Conta {

  
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner read = new Scanner (System.in);
       
        System.out.println("Quantos Clientes");
        
         
        int nc= read.nextInt();
        Cliente[] vetorCliente = new Cliente[nc];
        
        
       
        for(int i=0; i<nc; i++){
	        read.nextLine();
	        System.out.println("Entre com os dados da nova conta:");
	        System.out.println("NOME:");
	        String nomeCliente = read.nextLine();
	        System.out.println("NUMERO DA CONTA:");
	        int numConta = read.nextInt();       
	        System.out.println("Deseja fazer algum deposito : y/n");
	        read.nextLine();
	        char choice = read.next().charAt(0);
	        if(choice=='y'){
		        read.nextLine(); 
		        System.out.println("Digite o valor que deseja depositar");
		        double depositoInicial=read.nextDouble();
	         
		        vetorCliente[i] = new Cliente (nomeCliente, numConta,depositoInicial);
	        }else {            
	        	vetorCliente[i] = new Cliente(nomeCliente, numConta);
	        }
        
	        vetorCliente[i].mostrarDados();
        }
        
    
       
       read.close();
    }
    
}
