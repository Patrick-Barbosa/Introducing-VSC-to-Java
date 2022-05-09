public class App {
  

    public static void main(String[] args) throws Exception {
        
        Calculadora.adicao(2f, 2f);
        Calculadora.subtracao(2f, 2f);
        Calculadora.multiplicacao(2f, 2f);
        Calculadora.divisao(2f, 2f);

        Emprestimo.metodoEmprestimo(10, 10000);
        Emprestimo.metodoEmprestimo(10000, 500000);

        Saudacoes.Mensagem(3);
        Saudacoes.Mensagem(8);
        Saudacoes.Mensagem(13);
        Saudacoes.Mensagem(19);
        Saudacoes.Mensagem(10000);
    }
    
}
