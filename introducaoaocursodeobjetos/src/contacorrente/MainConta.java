package contacorrente;

public class MainConta {
    public static void main(String[] args) {
        // instacia o nosso objeto
        ContaBancaria contaCorreto = new ContaBancaria(107818, "CC", "samuel", 0, true);
        contaCorreto.InformacoesDaConta();
        contaCorreto.abrirConta();

        ContaBancaria conta02 = new ContaBancaria(111,"CP","Isabel",0,false);
        conta02.InformacoesDaConta();
        conta02.abrirConta();


    }

}
