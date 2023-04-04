package app;

import characters.Character;
import epicCrisies.EpicCrisis;
import factories.PlotFactory;
import plots.Plot;

public class Application {
    private Character character;
    private EpicCrisis epicCrisis;
    private Plot plot;

    public Application(PlotFactory factory) {
        this.character = factory.createCharacter();
        this.epicCrisis = factory.createEpicCrisis();
        this.plot = factory.createPlot();
    }

    @Override
    public String toString() {
        return "Application{" +
                "character=" + character.name() +
                ", epicCrisis=" + epicCrisis.name() +
                ", plot=" + plot.asText() +
                '}';
    }
}
