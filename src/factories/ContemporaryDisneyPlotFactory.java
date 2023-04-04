package factories;

import characters.Character;
import characters.ContemporaryDisneyCharacter;
import epicCrisies.ContemporaryDisneyEpicCrisis;
import epicCrisies.EpicCrisis;
import plots.ContemporaryDisneyPlot;
import plots.Plot;

public class ContemporaryDisneyPlotFactory implements PlotFactory{
    @Override
    public Character createCharacter() {
        return new ContemporaryDisneyCharacter();
    }

    @Override
    public EpicCrisis createEpicCrisis() {
        return new ContemporaryDisneyEpicCrisis();
    }

    @Override
    public Plot createPlot() {
        return new ContemporaryDisneyPlot();
    }
}
