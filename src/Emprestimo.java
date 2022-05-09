public class Emprestimo {
    
    
    public static void metodoEmprestimo(int quantidadeParcelas, float valor){
        
        if (quantidadeParcelas > 20) {
            System.out.println("Você está pedindo muitos meses para parcelar a quantia. Por favor, escolha uma quantidade abaixo de 20 meses.");
        } else {
                float taxaFinal = taxaEmprestimo() * quantidadeParcelas;
                float valorFinal = taxaFinal * valor;
                System.out.println( "O valor total a ser pago no empréstimo é de R$:" + valorFinal);}   
    }
    
    public static float taxaEmprestimo() {
        final float taxa_Padrao = 0.05f;
        return taxa_Padrao;
    }

}
