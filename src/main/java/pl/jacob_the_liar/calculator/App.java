package pl.jacob_the_liar.calculator;

import javafx.application.Application;
import javafx.stage.Stage;
import pl.jacob_the_liar.calculator.window.CalculatorApp;
import pl.jacob_the_liar.calculator.window.Window;

public class App  extends Application
{
    public static void main( String[] args )
    {
        System.out.println( "Calculator ver 0.1" );

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        Window calc = new CalculatorApp(primaryStage);
        calc.show();

    }
}
