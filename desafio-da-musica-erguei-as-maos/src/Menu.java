
import java.util.Scanner;

public class Menu {


    public void iniciarMenu() {
        CantarMusica musica = new CantarMusica();
        System.out.println("""
                Desafio da musica erguei as mãos
                Como deseja reproduzir a música ?
                1 - para a musica toda
                2 - para somente a primeira parte
                3 - para somente a segunda parte
                """);
        Scanner scanner = new Scanner(System.in);
        String opcao = scanner.next();
        switch (opcao) {
            case "1":
                musica.reproduzirPrimeiraParte();
                System.out.println("E atenção agora, porque\n");
                musica.reproduzirSegundaParte();
                break;
            case "2":
                musica.reproduzirPrimeiraParte();
                System.out.println("E atenção agora, porque");
                break;
            case "3":
                System.out.println("E atenção agora, porque\n");
                musica.reproduzirSegundaParte();
                break;
            default:
                System.out.println("Opção Inválida. Digite uma opção válida\n");
                iniciarMenu();
                break;
        }
    }

}


