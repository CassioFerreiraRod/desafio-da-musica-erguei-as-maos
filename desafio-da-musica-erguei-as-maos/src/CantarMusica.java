public class CantarMusica {

    // Método que imprime o primeiro trecho da múscia
    public void primeiroTrecho(boolean ehPorIsso, int repetir) {
        // Condicional que imprime "Por isso...!" caso a varivel ehPorIsso seja verdadeira, senão, imprime nada
        System.out.println(ehPorIsso ? "Por isso...!" : "");

        // Loop que que imprime a quantidade de vezes de acordo com o agumento repetir do método
        for (int i = 0; i < repetir; i++) {
            // Looop que imprime duas vezes a cada iteração do loop principal
            for (int j = 0; j < 2; j++) {
                System.out.println("Erguei as mãos e dai glória a Deus");
            }
            System.out.println("Erguei as mãos");
            System.out.println("E cantai como os filhos do Senhor\n");
        }

    }

    // Método que imprime o segundo trecho da múscia
    public void segundoTrecho(int posicao) {
        // Criando array para salvar o nome do animanis
        String[] primeirosAnimais = {"elefante", "minhoquinha", "canguru"};
        String[] segundosAnimais = {"passarinhos", "pinguins", "sapinho"};

        // Loop que verifica se o argumento posição é menor ou igual a 2
        while (posicao <= 2) {
            // Loop que que imprime 2 vezes a linha3
            for (int i = 0; i < 2; i++) {
                System.out.println("Os animaizinhos subiram de dois em dois");
            }
            // Imprime o verso e substitui de acordo com a posição das array
            System.out.printf("O %s\n", primeirosAnimais[posicao]);
            System.out.printf("E os %s, como os filhos do Senhor\n\n", segundosAnimais[posicao]);
            posicao++; // icrementa o argumento para continuar o laço
        }
    }

    // Método que imprime o terceiro trecho da múscia
    public void terceiroTrecho() {

        // Looop que imprime duas vezes a cada vez que o método é invocado
        for (int i = 0; i < 2; i++) {
            System.out.println("Deus disse a Noé: Constrói uma arca");
        }
        System.out.println("Que seja feita");
        System.out.println("De madeira para os filhos do Senhor\n");
    }

    // Método que imprime o quarto trecho da múscia
    public void quartoTrecho() {
        System.out.println("O senhor tem muitos filhos");
        System.out.println("Todos filhos ele tem");
        System.out.println("Eu sou um deles, você também");
        System.out.println("Louvemos ao senhor\n");

    }

    // Método que imprime o quinto trecho da múscia
    public void quintoTrecho(boolean ehBraco, int repetir) {

        // Looop que imprime duas vezes a cada chamada do método
        for (int i = 0; i < repetir; i++) {
            System.out.println("O senhor tem muitos filhos");
            System.out.println("Muitos filhos ele tem");
            System.out.println("Eu sou um deles, você também");
            System.out.println("Louvemos ao senhor\n");
        }
        // Condicional que imprime "Braço direito, braço esquerdo" caso a varivel ehBraco seja verdadeira,
        // senão, imprime nada
        System.out.println(ehBraco ? "Braço direito, braço esquerdo\n" : "");
    }

    // Método que imprime o sexto trecho da múscia
    public void sextoTrecho(boolean ehBraco) {

        // Condicional que imprime "Braço direito, braço esquerdo Perna direita" caso a varivel ehBraco seja verdadeira,
        // senão, imprime nada
        System.out.println(ehBraco ? """
                Braço direito, braço esquerdo
                Perna direita
                """ : "");

        // Invocando o método quinto trecho
        quintoTrecho(false, 1);

    }

    // Método que imprime o sétimo trecho da múscia
    public void setimoTrecho(boolean ehTrechoFinal) {
        // Condicional que imprime o verso sem quebra de linha caso a varivel ehTrechoFinal seja verdadeira
        // senão, imprime com quebra de linha
        System.out.println(ehTrechoFinal ? """
                Braço direito, braço esquerdo
                Perna direita, perna esquerda""" : """
                Braço direito, braço esquerdo
                Perna direita, perna esquerda
                """);
    }

    // Método que imprime o oitavo trecho da múscia
    public void oitavoTrecho(boolean ehBalanca) {
        // Condicional que imprime "Balança a cabeça" caso a varivel ehBalanca seja verdadeira,
        // senão, imprime nada
        System.out.println(ehBalanca ? "Balança a cabeça" : " ");

        // Invocando o método quintoTrecho()
        quintoTrecho(false, 1);
        // Invocando o método sétimoTrecho()
        setimoTrecho(false);
    }

    // Método que imprime o nono trecho da múscia
    public void nonoTrecho() {
        System.out.println("Balança a cabeça, dá uma voltinha");
    }

    // Método que imprime o decimo trecho da múscia
    public void decimoTrecho(boolean ehAbraco) {
        // Condicional que imprime "Da um pulinho e abraça o irmão" caso a varivel ehAbraco seja verdadeira,
        // senão, imprime "Da um pulinho"
        System.out.println(ehAbraco ? "Da um pulinho e abraça o irmão" : "Da um pulinho\n");
    }

    // Método que imprime a primeira parte da múscia
    public void reproduzirPrimeiraParte() {
        primeiroTrecho(false, 1);
        segundoTrecho(0);
        terceiroTrecho();
        primeiroTrecho(true, 3);
    }

    // Método que imprime a segunda parte da múscia
    public void reproduzirSegundaParte() {
        quartoTrecho();
        quintoTrecho(true, 1);
        quintoTrecho(false, 1);
        sextoTrecho(true);
        setimoTrecho(false);
        sextoTrecho(false);
        setimoTrecho(false);
        oitavoTrecho(true);
        nonoTrecho();
        quintoTrecho(false, 1);
        setimoTrecho(true);
        nonoTrecho();
        decimoTrecho(false);
        quintoTrecho(false, 1);
        setimoTrecho(true);
        nonoTrecho();
        decimoTrecho(true);

    }

}
