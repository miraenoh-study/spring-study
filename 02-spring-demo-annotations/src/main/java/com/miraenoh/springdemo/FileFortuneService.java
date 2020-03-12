package com.miraenoh.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.*;

@Component
public class FileFortuneService implements FortuneService {
    private List<String> data = new ArrayList<>();

    @Override
    public String getFortune() {
        if (data.size() > 0) {
            // Pick the random fortune and return it
            Random random = new Random();
            return data.get(random.nextInt(data.size()));
        } else {
            return null;
        }
    }

    @PostConstruct
    private void readFortunesFile() {
        System.out.println(">> FileFortuneService: inside of readFortunesFile()");
        // Read the file
        try {
            ClassLoader classLoader = FileFortuneService.class.getClassLoader();
            File file = new File(Objects.requireNonNull(classLoader.getResource("Fortunes.txt")).getFile());
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                data.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
