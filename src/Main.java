import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Harry Potter e a Câmara Secreta");
        meuFilme.setAnoDeLancamento(2002);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(161);
        meuFilme.avaliar(1);
        meuFilme.avaliar(1);
        meuFilme.avaliar(1);

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.calcularMediaAvaliacoes());
        meuFilme.exibirFichaTecnica();

        Serie friends = new Serie();
        friends.setNome("Friends");
        friends.setAnoDeLancamento(1994);
        friends.setIncluidoNoPlano(true);
        friends.setTemporadas(10);
        friends.setEpisodiosPorTemporada(24);
        friends.setMinutosPorEpisodio(25);
        friends.setAtiva(false);

        friends.exibirFichaTecnica();

        Filme outroFilme = new Filme();
        outroFilme.setNome("Harry Potter e o Prisioneiro de Azkaban");
        outroFilme.setAnoDeLancamento(2004);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.setDuracaoEmMinutos(139);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(meuFilme);
        calculadora.incluir(outroFilme);
        calculadora.incluir(friends);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(friends);
        episodio.setTotalVisualizacoes(500);
        filtro.filtrar(episodio);
    }
}