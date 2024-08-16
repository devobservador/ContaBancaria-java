package contacorrente;

public class ContaBancaria {
    // atributos da nossa clase

    public int numConta;
    protected String tipo; // cc = conta corrente ou cp = contapou
    private String dono;
    private int saldo;
    private  boolean status;



    public void InformacoesDaConta(){
        System.out.println("--------------------------------------");
        System.out.println("Numero da conta : " +this.getNumConta());
        System.out.println("Tipo da conta  :" + this.getTipo() );
        System.out.println("Titula da conta " + this.getDono());
        System.out.println("Saldo atual : " + this.getSaldo());
        System.out.println("Status da conta : " + this.getStatus());

    }

    // criando nossos construtores

    public ContaBancaria(int num, String tip, String don, int sald, boolean sta){
        this.numConta=  num;
        this.tipo = tip;
        this.dono = don;
        this.saldo= sald;
        this.status=sta;
    }

        // criando nossó métodos acessores (get)
    public int getNumConta(){
        return numConta;
    }

    public String getTipo(){
        return tipo;
    }

    public String getDono(){
        return dono;
    }
    public int getSaldo(){
        return saldo;

    }
    public boolean getStatus(){
        return status;
    }

    // criando os nossos métodos modificadores (set)
    public void setNumConta(int num){
        this.numConta = num;

    }

    public void setTipo(String tip){
        this.tipo= tip;

    }
    public void setDono(String don){
        this.dono= don;
    }
    public void setSaldo(int saldo){
        this.saldo= saldo;
    }
    public void setStatus(boolean sta ){
        this.status=sta;

    }

    // criando nosso métodos
    public void abrirConta(){
        this.setStatus(true);
        System.out.println("Conta aberta com sucesso seu merda");
        if (this.getTipo().equals("CC") && this.getStatus()){
            this.setSaldo(50);
            System.out.println(" Ao abrir a conta corrente você ganhou um valor de " +getSaldo());
        }
        else if (this.getTipo().equals("CP") && this.getStatus()) {
            this.setSaldo(150);
            System.out.println(" Ao abrir uma conta poupança você ganha um valor de  " +getSaldo());

        }


    }



    public void fecharConta(){
        double débitos=0;
        if (this.getSaldo()>=1 ||débitos>=1  ){
            System.out.println("No momento você não pode encerrar a conta");

        } else if (this.getSaldo()==0 || débitos==0) {
            System.out.println("Conta encerrada com sucesso");

        }


    }

    public void depositar(int depositar) {
        this.setStatus(true);
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+depositar);
            System.out.println("valor recebido " +getSaldo());

        }

    }
    public void sacar(int sacar){
        this.setStatus(true);
        if(this.getStatus() && this.getSaldo()>=sacar){
            this.setSaldo(this.getSaldo()-sacar);
            System.out.println("saque realizado no valor de " + getSaldo());


        }else{
            System.out.println("saldo insuficiente para saque, saldo disponivel : " +getSaldo());
        }




    }
    public void  pagarMensal() {
        int mensalidade ;
        if (this.getTipo().equals("CC")){
            mensalidade=12;
            this.setSaldo(this.getSaldo()-mensalidade);
            System.out.println("Descontado valor de  12 reais do seu saldo " +this.getSaldo());

        } else if (this.getTipo().equals("CP")) {
            mensalidade = 20;
            this.setSaldo(this.getSaldo()-mensalidade);
            System.out.println("Descontado valor de  20 reais do seu saldo. Saldo atual " +getSaldo());

        }

    }
}