
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
        Cliente[] vetorCliente= new Cliente[nc];
        
        char choice;
       /* FORMULARIO DENTRO DO FOR PARA PEGAR INFORMACOES DO CLIENTES*/
       double saldoInicial=0;
        for(int i=0; i<nc; i++){
         read.nextLine();
        System.out.println("Entre com os dados da nova conta:");
        System.out.println("NOME:");
        String nomeCliente = read.nextLine();
        System.out.println("NUMERO DA CONTA:");
        int numConta = read.nextInt();
        
        vetorCliente[i]= new Cliente(nomeCliente, numConta);
      /*  System.out.println("numero do cliente:");
        int numCliente=read.nextInt();
        */
            System.out.println("numerocliente");
         int numc=read.nextInt();
         System.out.println("Deseja fazer algum deposito : y/n");
         read.nextLine();
         choice = read.next().charAt(0);
         /* IF DENTRO DO FOR PARA SABER SE O  CLIENTE VAI FAZER ALGUM SAQUE*/
         if(choice=='y'){
         read.nextLine(); 
         System.out.println("Digite o valor que deseja depositar");
         double depositoInicial=read.nextDouble();
         /* VETOR PARA GUARDA CADA INFORMACOES DE CADA CLEINTE*/
        
          vetorCliente[numc] = new Cliente (nomeCliente, numConta,depositoInicial);
        }
             
       
        else {
            
            vetorCliente[numc]= new Cliente(nomeCliente, numConta);
        }
        /*MOSTRAR INFORMACOES DE TODA TABELA NO FINAL*/
         
     
     
       }
            for (int i=0; i<nc; i++){
         System.out.println("dados dos clientes:\n"+vetorCliente[i].ToString());
        /*System.out.println("Dados da conta:"+vetorCliente[i]);*/
                
                 
        }
      System.out.println("Deseja fazer transfencia?y/n");
                choice= read.next().charAt(0);
                
                if(choice=='y'){
                    System.out.println("numero da conta que irar fazer transferencia:");
               int numConta=read.nextInt();
                    System.out.println("Valor que deseja transferir");
                 double quantidade= read.nextDouble();
                  
                         vetorCliente[nc].deposit(quantidade);
                }
       
       read.close();
    }
    
}
