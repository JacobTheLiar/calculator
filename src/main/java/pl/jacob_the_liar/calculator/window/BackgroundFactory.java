package pl.jacob_the_liar.calculator.window;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class BackgroundFactory {

    public static Background green(){
        Background background = new Background(
                new BackgroundFill(
                        Color.rgb(204, 255, 153),
                        CornerRadii.EMPTY,
                        Insets.EMPTY
                )
        );
        return background;
    }
    public static Background red(){
        Background background = new Background(
                new BackgroundFill(
                        Color.rgb(255, 153, 153),
                        CornerRadii.EMPTY,
                        Insets.EMPTY
                )
        );
        return background;
    }
    public static Background yellow(){
        Background background = new Background(
                new BackgroundFill(
                        Color.rgb(255, 255, 153),
                        CornerRadii.EMPTY,
                        Insets.EMPTY
                )
        );
        return background;
    }

    public static Background blue(){
        Background background = new Background(
                new BackgroundFill(
                        Color.rgb(153, 153, 255),
                        CornerRadii.EMPTY,
                        Insets.EMPTY
                )
        );
        return background;
    }


    public static Background white(){
        Background background = new Background(
                new BackgroundFill(
                        Color.rgb(255, 255, 255),
                        CornerRadii.EMPTY,
                        Insets.EMPTY
                )
        );
        return background;
    }


    public static Background gray(){
        Background background = new Background(
                new BackgroundFill(
                        Color.rgb(105, 105, 105),
                        CornerRadii.EMPTY,
                        Insets.EMPTY
                )
        );
        return background;
    }
}
