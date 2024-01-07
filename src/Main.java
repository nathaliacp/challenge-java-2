import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Harry Potter e a Câmara Secreta");
        meuFilme.setAnoDeLancamento(2002);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(161);
        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);

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
    }
}