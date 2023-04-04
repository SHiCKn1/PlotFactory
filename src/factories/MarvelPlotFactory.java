package factories;

import characters.Character;
import characters.MarvelCharacter;
import epicCrisies.EpicCrisis;
import epicCrisies.MarvelEpicCrisis;
import plots.MarvelPlot;
import plots.Plot;

public class MarvelPlotFactory implements PlotFactory{
    @Override
    public Character createCharacter() {
        return new MarvelCharacter();
    }

    @Override
    public EpicCrisis createEpicCrisis() {
        return new MarvelEpicCrisis();
    }

    @Override
    public Plot createPlot() {
        return new MarvelPlot();
    }
}
