package pl.jacob_the_liar.calculator.window;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

enum BackgroundFactory {

    GREEN (204, 255, 153),
    RED (255, 153, 153),
    YELLOW (255, 255, 153),
    BLUE (153, 153, 255),
    WHITE (255, 255, 255),
    GRAY (105, 105, 105);


    private final int r;
    private final int g;
    private final int b;

    BackgroundFactory(int red, int green, int blue){
        r = red;
        g = green;
        b = blue;
    }

    Background value(){
        Background background = new Background(
                new BackgroundFill(
                        Color.rgb(r, g, b),
                        CornerRadii.EMPTY,
                        Insets.EMPTY
                )
        );
        return background;

    }

}
