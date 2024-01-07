package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo{
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
}
