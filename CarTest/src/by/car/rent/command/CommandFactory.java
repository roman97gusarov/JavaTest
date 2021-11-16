package by.car.rent.command;

import by.car.rent.car.CarManager;
import by.car.rent.car.CarReader;
import by.car.rent.command.impl.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class CommandFactory {
    private final Map<String, Command> commandMap;

    public CommandFactory(CarManager carManager, CarReader carReader) {
        commandMap = new HashMap<>();
        commandMap.put("1", new OfferCarCommand(carManager));
        commandMap.put("2", new TakeCarCommand(carReader, carManager));
        commandMap.put("3", new GoCarCommand(carManager, carReader));
        commandMap.put("4", new FillUpCarCommand(carReader, carManager));
        commandMap.put("5", new OnLightsCarCommand(carManager));
        commandMap.put("6", new OffLightsCarCommand(carManager));
        commandMap.put("7", new ExitCommand());



    }

    public Optional<Command> findCommand(String command){
        return  Optional.of(commandMap.get(command));

    }

    public String getDescriptions() {
       return commandMap
                .entrySet()
                .stream()
                .map(c -> c.getKey()+ ". " + c.getValue().getDescription())
                .reduce((a, b) -> a + "\n" + b)
                .orElse("No commands found");
    }

}