package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
   private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void exibirFichaTecnica() {
        String printMeuFilme = """
                *************************************\n
                Nome do filme: %s
                Ano de lançamento: %d
                Incluído no plano: %b
                Duração em minutos: %d
                Diretor: %s
                \n*************************************
                """.formatted(getNome(), getAnoDeLancamento(), getIncluidoNoPlano(), getDuracaoEmMinutos(), getDiretor());

        System.out.println(printMeuFilme);
    }


    @Override
    public int getClassificacao() {
        return (int) getSomaDasAvaliacao() / 2;
    }
}
