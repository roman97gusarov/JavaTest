package by.car.rent.reader;

import java.io.BufferedReader;
import java.io.IOException;

public class ConsoleReader implements Reader {
    private BufferedReader reader;

    public ConsoleReader(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public String readLine() throws IOException {
        return reader.readLine().trim();

    }

    @Override
    public void close() throws Exception {
        reader.close();
    }
}
