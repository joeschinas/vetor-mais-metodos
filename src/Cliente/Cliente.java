
package Cliente;


public class Cliente {
    
     private String nomeCliente;
     private int numConta;
     private Double saldoConta=0.0;

    public Cliente() {
    }

    public Cliente(String nomeCliente,int numConta) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
    }

    public Cliente(String nomeCliente, int numConta, double depositoInicial) {
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
        this.saldoConta = depositoInicial;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void deposit(double quantidade){
    
    saldoConta+=quantidade;
    }
    public void saque(double quantidade){
    saldoConta-=quantidade;
    }
    public void transfer(double quantidade){
   
    }
    public String ToString(){
    
    return  "Titular da Conta:\n"
            +getNomeCliente()
            +"\nNumero da conta:\n"
            +getNumConta()
            +"\nSaldo em conta:\n"
            +getSaldoConta();
    }

}
