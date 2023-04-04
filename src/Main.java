import app.Application;
import factories.MarvelPlotFactory;
import factories.PlotFactory;

public class Main {
    public static void main(String[] args) {
        PlotFactory factory = new MarvelPlotFactory();
        Application app = new Application(factory);
        System.out.println(app.toString());
    }
}