package server.server.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileStorage implements Repository<String> {
    private static final String LOG_PATH = "src/server/server/repository/Log.txt";

    @Override
    public void save(String text){
        try (FileWriter writer = new FileWriter(LOG_PATH, true)){
            writer.write(text);
            writer.write("\n");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<String> load(){
        List<String> listString = new ArrayList<>();
        if (Files.exists(Path.of(LOG_PATH ))) {
            try (BufferedReader br = new BufferedReader(new FileReader(LOG_PATH))) {
                String line;
                while ((line = br.readLine()) != null) {
                    listString.add(line);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return listString;

    }
}
