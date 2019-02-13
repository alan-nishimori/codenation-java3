package challenge;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	private CsvProcessor csvProcessor = new CsvProcessor();
	private List<Player> players = csvProcessor.processCsv();

	// Quantas nacionalidades (coluna `nationality`) diferentes existem no arquivo?
	public int q1() {
//		Map<String, Long> result = players.stream().map(Player::getNationality).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return (int)players.stream().map(Player::getNationality).distinct().count();
	}

	// Quantos clubes (coluna `club`) diferentes existem no arquivo?
	// Obs: Existem jogadores sem clube.
	public int q2() {
		return (int)players.stream().map(Player::getClub).distinct().count();
	}

	// Liste o nome completo (coluna `full_name`) dos 20 primeiros jogadores.
	public List<String> q3() {
		return players.stream().map(Player::getFullName).limit(20).collect(Collectors.toList());
	}

	// Quem são os top 10 jogadores que possuem as maiores cláusulas de rescisão?
	// (utilize as colunas `full_name` e `eur_release_clause`)
	public List<String> q4() {
		return null;
	}

	// Quem são os 10 jogadores mais velhos (use como critério de desempate o campo `eur_wage`)?
	// (utilize as colunas `full_name` e `birth_date`)
	public List<String> q5() {
		return null;
	}

	// Conte quantos jogadores existem por idade. Para isso, construa um mapa onde as chaves são as idades e os valores a contagem.
	// (utilize a coluna `age`)
	public Map<Integer, Integer> q6() {
		return null;
	}

}
