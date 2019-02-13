package challenge;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvProcessor {

    public List<Player> processCsv() {

        String csvFile = "data.csv";
        String line;
        String csvSplitter = ",";

        List<Player> players = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(this.getClass().getClassLoader().getResource(csvFile).getFile()))))) {
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] buffer = line.split(csvSplitter);
                players.add(new Player(buffer[0], buffer[2], buffer[3], buffer[6], buffer[8], buffer[14], buffer[17], buffer[18]));
            }
        } catch (IOException e) {
            System.out.println("Erro ao processar arquivo.");
            e.printStackTrace();
        }

        return players;
    }
}
