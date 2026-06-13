import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import com.ramyres.Partida;
import com.ramyres.Tabela;

@Testable
public class TabelaTest {
    
    public static String[] ObterPartidas(){
        String txt = """                
        1, Atlético_Mineiro, Palmeiras, 2x2				
        1, Internacional, Athletico_Paranaense, 0x1				
        1, Coritiba, Red_Bull_Bragantino, 0x1				
        1, Vitória, Remo, 2x0				
        1, Fluminense, Grêmio, 2x1				
        1, Corinthians, Bahia, 1x2				
        1, Chapecoense, Santos, 3x2				
        1, São_Paulo, Flamengo, 1x7				
        1, Mirassol, Vasco, 2x1				
        1, Botafogo, Cruzeiro, 4x0
        """;
        return txt.split("\n");
    }

    @Test
    public void Tabela_Deve_Adicionar_Partidas_E_Registrar_Historico_Corretamente(){
        Tabela t = new Tabela();

        var partidas = ObterPartidas();

        for(String linha: partidas)
            t.adicionarPartida(new Partida(linha));

        assertEquals(t.getHistorico().size(),partidas.length,"O histórico deve ter todas as partidas");
    }

    @Test
    public void Tabela_Deve_Adicionar_Partidas_E_A_Classificacao_Deve_Ter_Todos_os_Times(){
        Tabela t = new Tabela();

        var partidas = ObterPartidas();

        for(String linha: partidas)
            t.adicionarPartida(new Partida(linha));

        HashSet<String> times = new HashSet<>();
        for(var h : t.getHistorico()){
            times.add(h.getTimeA().getNome());
            times.add(h.getTimeB().getNome());
        }

        assertEquals(t.obterClassificacao().size(), times.size(),"Deve ter todos os times na classificação");
    }

    @Test
    public void Tabela_Deve_Adicionar_Partidas_E_A_Classificacao_Estar_Correta(){
        Tabela t = new Tabela();

        var partidas = ObterPartidas();

        for(String linha: partidas)
            t.adicionarPartida(new Partida(linha));

        
        var classificacao = t.obterClassificacao();
        System.out.println();
        for(var time : classificacao)
            System.out.println(time.getNome() + " - " + time.getPontos());

        assertEquals(classificacao.get(0).getNome(), "Flamengo", "O primeiro colocado deve ser o Flamengo");
        assertEquals(classificacao.get(1).getNome(), "Botafogo", "O segundo colocado deve ser o Botafogo");
        assertEquals(classificacao.get(2).getNome(), "Vitória", "O terceiro colocado deve ser o Vitória");

        assertEquals(classificacao.get(classificacao.size() - 3).getNome(), "Remo", "O ultimo colocado deve ser o Remo");
        assertEquals(classificacao.get(classificacao.size() - 2).getNome(), "Cruzeiro", "O ultimo colocado deve ser o Cruzeiro");
        assertEquals(classificacao.get(classificacao.size() - 1).getNome(), "São_Paulo", "O ultimo colocado deve ser o São Paulo");
    }
}
