package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean ativa;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void exibirFichaTecnica() {
        String minhaSerie ="""
                *************************************\n
                Nome da série: %s
                Ano de lançamento: %d
                Incluído no plano: %b
                Temporadas: %d
                Episódios por temporada: %d
                Duração total em minutos: %d
                Duração em minutos por episódio: %d
                Ativa: %b
                \n*************************************
                """.formatted(getNome(), getAnoDeLancamento(), getIncluidoNoPlano(), getTemporadas(), getEpisodiosPorTemporada(), getDuracaoEmMinutos(), getMinutosPorEpisodio(), getAtiva());
        System.out.println(minhaSerie);
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
