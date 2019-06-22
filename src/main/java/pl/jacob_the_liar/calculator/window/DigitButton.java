package pl.jacob_the_liar.calculator.window;

import pl.jacob_the_liar.calculator.core.PressNumber;

import static pl.jacob_the_liar.calculator.window.BackgroundFactory.GREEN;

public class DigitButton extends ClickButton {

    private final String digit;
    private final PressNumber pressNumber;
    private final Refresh refresh;

    public DigitButton(String digit, PressNumber pressNumber, Refresh refresh ) {
        super(digit);
        this.digit = digit;
        this.pressNumber = pressNumber;
        this.refresh = refresh;

        this.setBackground(GREEN.value());

        this.setOnMouseClicked(event -> {
            pressNumber.pressNumber(digit);
            refresh.refreshControls();});
    }
}
