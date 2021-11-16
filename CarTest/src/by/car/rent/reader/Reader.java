package by.car.rent.reader;

import java.io.IOException;

public interface Reader extends AutoCloseable {
    public String readLine() throws IOException;
}
