import java.util.ArrayList;
import java.util.List;

public class CantarMusica {
    List<String> primeirosAnimais = new ArrayList<>();
    List<String> segundosAnimais = new ArrayList<>();

    // Método que adiciona Animais a ArrayList primeirosAnimais
    public void adicionarPrimeiroAnimal(String animal) {
        primeirosAnimais.add(animal);
    }

    // Método que adiciona Animais a ArrayList segundosAnimais
    public void adicionarSegundoAnimal(String animal) {
        segundosAnimais.add(animal);
    }


    // Método que imprime o primeiro trecho da música de acordo com os parâmetros que serão usados
    public void imprimirPrimeiroTrecho(boolean imprimirPorIsso, int repetir) {
        // Expressão ternária que imprime "Por isso...!" caso o parâmetro imprimirPorIsso seja verdadeira,
        // senão, imprime uma String vazia
        System.out.println(imprimirPorIsso ? "Por isso...!" : "");
        // Loop que imprime essa estrofe repetidas vezes, com base no valor fornecido pelo parâmetro repetir
        for (int i = 0; i < repetir; i++) {
            // Loop que imprime 2 vezes o verso
            for (int j = 0; j < 2; j++) {
                System.out.println("Erguei as mãos e dai glória a Deus");
            }
            System.out.println("Erguei as mãos");
            System.out.println("E cantai como os filhos do Senhor\n");
        }
    }

    // Método que imprime o segundo trecho da música
    public void imprimirSegundoTrecho() {
        // Adicionando animais as ArraysList
        primeirosAnimais.add("elefantes");
        primeirosAnimais.add("minhoquinha");
        primeirosAnimais.add("cangurus");
        segundosAnimais.add("passarinhos");
        segundosAnimais.add("pinguins");
        segundosAnimais.add("sapinho");
        // Loop que verifica cada posição até o tamanho dos arrays e imprime a estrofe
        for (int i = 0; i < primeirosAnimais.size(); i++) {
            // Loop que imprime 2 vezes o verso
            for (int j = 0; j < 2; j++) {
                System.out.println("Os animaizinhos subiram de dois em dois");
            }
            // Verifica se o nome do animal no array primeirosAnimais termina com a letra "a" e, se sim,
            // imprime o artigo feminino "A" antes do nome do animal
            if (primeirosAnimais.get(i).endsWith("a"))
                System.out.printf("A %s\n", primeirosAnimais.get(i));
            else if (primeirosAnimais.get(i).endsWith("as"))
                System.out.printf("As %s\n", primeirosAnimais.get(i));
            else if (primeirosAnimais.get(i).endsWith("s"))
                System.out.printf("Os %s\n", primeirosAnimais.get(i));
            else
                System.out.printf("O %s\n", primeirosAnimais.get(i));
            // Verifica se o nome do animal no array segundosAnimais termina com a letra "s" e, se sim,
            // imprime o artigo no plural
            if (segundosAnimais.get(i).endsWith("os"))
                System.out.printf("E os %s, como os filhos do Senhor\n\n", segundosAnimais.get(i));
            else if (segundosAnimais.get(i).endsWith("as"))
                System.out.printf("E as %s, como os filhos do Senhor\n\n", segundosAnimais.get(i));
            else if (segundosAnimais.get(i).endsWith("a"))
                System.out.printf("E a %s, como os filhos do Senhor\n\n", segundosAnimais.get(i));
            else if (segundosAnimais.get(i).endsWith("s"))
                System.out.printf("E os %s, como os filhos do Senhor\n\n", segundosAnimais.get(i));
            else
                System.out.printf("E o %s, como os filhos do Senhor\n\n", segundosAnimais.get(i));
        }
    }

    // Método que imprime o terceiro trecho da música
    public void imprimirTerceiroTrecho() {
        // Loop que imprime o verso duas vezes a cada vez que o método é invocado
        for (int i = 0; i < 2; i++) {
            System.out.println("Deus disse a Noé: Constrói uma arca");
        }
        // Imprime o restante da estrofe
        System.out.println("""
                Que seja feita
                De madeira para os filhos do Senhor
                """);
    }

    // Método que imprime o quarto trecho da música de acordo com os parâmetros
    public void imprimirQuartoTrecho(boolean imprimirBracos, int repetir) {

        // Loop que imprime essa estrofe repetidas vezes, com base no valor fornecido pelo parâmetro repetir
        for (int i = 0; i < repetir; i++) {
            System.out.println("O senhor tem muitos filhos");
            System.out.println("Muitos filhos ele tem");
            System.out.println("Eu sou um deles, você também");
            System.out.println("Louvemos ao senhor\n");
        }

        // Expressão ternária que imprime "Braço direito, braço esquerdo" caso o parâmetro imprimirBracos seja verdadeira,
        // senão, imprime uma String vazia
        System.out.print(imprimirBracos ? "Braço direito, braço esquerdo\n\n" : "");
    }

    // Método que imprime o quinto trecho da música
    public void imprimirQuintoTrecho() {
        // Imprime o verso
        System.out.println("""
                Braço direito, braço esquerdo
                Perna direita
                """);
    }

    // Método que imprime o sexto trecho da música
    public void imprimirSextoTrecho(boolean ehQuebraDeLinha) {
        // Criando uma variável para salvar o verso
        String verso = """
                Braço direito, braço esquerdo
                Perna direita, perna esquerda""";
        // Expressão ternária que imprime o verso com quebra de linha caso o parâmetro ehQuebraDeLinha seja verdadeira
        // senão, imprime sem quebra de linha
        System.out.println(ehQuebraDeLinha ? verso + "\n" : verso);
    }

    // Método que imprime o sétimo trecho da música
    public void imprimirSetimoTrecho() {
        // Imprime o verso da música
        System.out.println("Balança a cabeça");
    }

    // Método que imprime o oitavo trecho da música
    public void imprimirOitavoTrecho() {
        // Imprime o verso da música
        System.out.println("Balança a cabeça, dá uma voltinha");
    }

    // Método que imprime o nono trecho da música
    public void imprimirNonoTrecho(boolean ehAbraco) {
        // Expressão ternária que imprime "Dá um pulinho e abraça o irmão" caso o parâmetro ehAbraco seja verdadeira,
        // senão, imprime "Dá um pulinho"
        System.out.println(ehAbraco ? "Dá um pulinho e abraça o irmão\n" : "Dá um pulinho\n");
    }

    // Método que imprime a primeira parte da música
    public void reproduzirPrimeiraParte() {
        // Invocando imprimirPrimeiroTrecho() com argumento 'false' para não imprimir a parte 'Por isso...!'
        // e com o argumento '1' para quantidade de vezes
        imprimirPrimeiroTrecho(false, 1);

        // Invocando imprimirSegundoTrecho() para imprimir o trecho da música
        imprimirSegundoTrecho();

        // Invocando imprimirTerceiroTrecho() para imprimir o trecho da música
        imprimirTerceiroTrecho();

        // Invocando imprimirPrimeiroTrecho() com argumento 'true' para não imprimir a parte 'Por isso...!'
        // e com o argumento '3' para quantidade de vezes
        imprimirPrimeiroTrecho(true, 3);
    }

    // Método que imprime a segunda parte da música
    public void reproduzirSegundaParte() {
        // Invocando imprimirQuartoTrecho() com argumento 'true' para imprimir a parte 'Braço direito, braço esquerdo'
        // e com o argumento '2' para quantidade de vezes
        imprimirQuartoTrecho(true, 2);

        // Invocando o imprimirQuartoTrecho() com argumento 'false' para não imprimir a parte 'Braço direito, braço esquerdo'
        // e com o argumento '1' para quantidade de vezes
        imprimirQuartoTrecho(false, 1);

        // Invocando o imprimirQuintoTrecho() para imprimir o trecho da música
        imprimirQuintoTrecho();

        // Invocando o imprimirQuartoTrecho() com argumento 'false' para não imprimir a parte 'Braço direito, braço esquerdo'
        // e com o argumento '1' para quantidade de vezes
        imprimirQuartoTrecho(false, 1);

        // Invocando o imprimirSextoTrecho() com argumento 'true' para imprimir o verso com quebra de linha
        imprimirSextoTrecho(true);

        // Invocando o imprimirQuartoTrecho() com argumento 'false' para não imprimir a parte 'Braço direito, braço esquerdo'
        // e com o argumento '1' para quantidade de vezes
        imprimirQuartoTrecho(false, 1);

        // Invocando o imprimirSextoTrecho() com argumento 'true' para imprimir o verso com quebra de linha
        imprimirSextoTrecho(true);

        // Invocando o imprimirSetimoTrecho() para imprimir o trecho da música
        imprimirSetimoTrecho();

        // Invocando o imprimirQuartoTrecho() com argumento 'false' para não imprimir a parte 'Braço direito, braço esquerdo'
        // e com o argumento '1' para quantidade de vezes
        imprimirQuartoTrecho(false, 1);

        // Invocando o imprimirSextoTrecho() com o argumento 'true' para imprimir o verso com quebra de linha
        imprimirSextoTrecho(true);

        // Invocando o imprimirOitavoTrecho() para imprimir o trecho da música
        imprimirOitavoTrecho();

        // Invocando o imprimirQuartoTrecho() com argumento 'false' para não imprimir a parte 'Braço direito, braço esquerdo'
        // e com o argumento '1' para quantidade de vezes
        imprimirQuartoTrecho(false, 1);

        // Invocando o imprimirSextoTrecho() com argumento 'false' para imprimir o verso sem quebra de linha
        imprimirSextoTrecho(false);

        // Invocando o imprimirOitavoTrecho() para imprimir o trecho da música
        imprimirOitavoTrecho();

        // Invocando o nonoTrecho() com argumento 'false' para imprimir o verso 'Dá um pulinho'
        // e não 'Dá um pulinho e abraça o irmão'
        imprimirNonoTrecho(false);

        // Invocando o imprimirQuartoTrecho() com argumento 'false' para não imprimir a parte 'Braço direito, braço esquerdo'
        // e com o argumento '1' para quantidade de vezes
        imprimirQuartoTrecho(false, 1);

        // Invocando o imprimirSextoTrecho() com argumento 'false' para imprimir o verso sem quebra de linha
        imprimirSextoTrecho(false);

        // Invocando o imprimirOitavoTrecho() para imprimir o trecho da música
        imprimirOitavoTrecho();

        // Invocando o imprimirNonoTrecho() com argumento 'true' para imprimir o verso 'Dá um pulinho e abraça o irmão'
        // e não 'Dá um pulinho'
        imprimirNonoTrecho(true);
    }

}
