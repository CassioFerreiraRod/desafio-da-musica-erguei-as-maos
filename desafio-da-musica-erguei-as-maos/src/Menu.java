
import java.util.Scanner;

public class Menu {
    // Criando um atributo do tipo CantarMusica
    private CantarMusica musica;
    // Construtor que irá instanciar CantarMusica() que irá atribuir ao atributo musica sempre que for invocado
    public Menu() {
        this.musica = new CantarMusica();
    }
    // Método que irá iniciar e gerenciar o menu de interação
    public void iniciarMenu() {
        // Instanciando a classe Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);
        // Variável que controla a continuidade do menu
        boolean continuar = true;

        // Bloco de tratamento de exceção para lidar com possíveis erros
        try {
            // Loop que mantém a execução do menu enquanto a variável 'continuar' permanecer verdadeira
            while (continuar) {
                // Imprime as opções para reprodução da música
                System.out.println("""
                        Desafio da música erguei as mãos
                        Como deseja reproduzir a música ?
                        1 - para a musica toda
                        2 - para somente a primeira parte
                        3 - para somente a segunda parte
                        4 - para sair
                        """);
                // Variável que recebe a entrada do Scanner
                String opcao = scanner.next();
                // Bloco que verifica as entradas recebidas na variável 'opção'
                switch (opcao) {
                    case "1":
                        // Reproduz a primeira parte da música
                        musica.reproduzirPrimeiraParte();
                        // Imprime o verso que divide a primeira parte da segunda
                        System.out.println("E atenção agora, porque\n");
                        // Reproduz a segunda parte da música
                        musica.reproduzirSegundaParte();
                        break;
                    case "2":
                        // Reproduz a primeira parte da música
                        musica.reproduzirPrimeiraParte();
                        // Imprime o verso que divide a primeira parte da segunda
                        System.out.println("E atenção agora, porque\n");
                        break;
                    case "3":
                        // Imprime o verso que divide a primeira parte da segunda
                        System.out.println("E atenção agora, porque\n");
                        // Reproduz a segunda parte da música
                        musica.reproduzirSegundaParte();
                        break;
                    case "4":
                        // Recebe o valor false caso a entrada seja '4' e encerra o bloco
                        continuar = false;
                        // Saindo do Menu
                        break;
                    default:
                        // Imprime caso não seja uma opção esperada
                        System.out.println("Opção Inválida. Digite uma opção válida\n");
                        break;
                }
            }

        } // Captura uma exceção do tipo IllegalStateException,
          // geralmente lançada quando há operações inválidas no scanner
        catch (IllegalStateException e) {
            // Imprime essa mensagem caso aconteça algum erro
            System.out.println("Erro, encerrando o sistema.");
        }
        // Finaliza o scanner
        scanner.close();
    }
}


