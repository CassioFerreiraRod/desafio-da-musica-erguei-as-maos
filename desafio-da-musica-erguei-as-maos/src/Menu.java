
import java.util.InputMismatchException;
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
                        menuSecundario();
                        // Reproduz a primeira parte da música
                        musica.reproduzirPrimeiraParte();
                        // Imprime o verso que divide a primeira parte da segunda
                        System.out.println("E atenção agora, porque\n");
                        // Reproduz a segunda parte da música
                        musica.reproduzirSegundaParte();
                        break;
                    case "2":
                        menuSecundario();
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
        catch (InputMismatchException e) {
            // Imprime essa mensagem caso aconteça algum erro
            System.out.println("Erro, encerrando o sistema.");
        }

        // Finaliza o scanner
        scanner.close();
    }

    public void menuSecundario() {
        Scanner scanner = new Scanner(System.in);
        // Exibe as instruções para o usuário
        System.out.println("""
                Deseja adicionar mais animais a este trecho?
                "A minhoquinha
                E os pinguins, como os filhos do Senhor"
                s - para sim
                n - para não
                """);
        String opcao = scanner.next();
        switch (opcao) {
            case "s":
                // Se o usuário selecionar "s" para sim, solicita os nomes dos animais
                Scanner animalScanner = new Scanner(System.in);
                System.out.println("Qual o primeiro?");
                // Lê o nome do primeiro animal inserido pelo usuário
                String primeiroAnimal = animalScanner.next();
                // Adiciona o primeiro animal à música
                musica.adicionarPrimeiroAnimal(primeiroAnimal);

                // Solicita e lê o nome do segundo animal inserido pelo usuário
                System.out.println("Qual o segundo?");
                String segundoAnimal = animalScanner.next();
                // Adiciona o segundo animal à música
                musica.adicionarSegundoAnimal(segundoAnimal);
                break;
            case "n":
                // Se o usuário selecionar "n" para não, sai do menu sem fazer alterações
                break;
            default:
                // Sai do menu sem fazer alterações e imprime essa mensagem
                System.out.println("Opção inválida. Então não irá adicionar nenhum animal.");
                break;
        }
    }
}


