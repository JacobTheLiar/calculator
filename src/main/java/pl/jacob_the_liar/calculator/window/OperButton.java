package pl.jacob_the_liar.calculator.window;

import pl.jacob_the_liar.calculator.core.Operations;

public class OperButton extends ClickButton {

    private final String operation;
    private final Operations operations;
    private final Refresh refresh;

    public OperButton(String operation, Operations operations, Refresh refresh) {
        super(operation);
        this.operation = operation;
        this.operations = operations;
        this.refresh = refresh;


        if (operation.contains("C"))
            this.setBackground(BackgroundFactory.red());
        else
            this.setBackground(BackgroundFactory.yellow());

        this.setOnMouseClicked(event -> {
            doOperation();
            refresh.refreshControls();
        });

    }

    private void doOperation() {
        switch (operation) {
            case "+":
                operations.add();
                break;
            case "-":
                operations.sub();
                break;
            case "×":
                operations.multi();
                break;
            case "÷":
                operations.div();
                break;
            case "C":
                operations.clearDisplay();
                break;
            case "CE":
                operations.clearEverything();
                break;
            case "±":
                operations.plusMinus();
                break;
            default:
                operations.result();
        }
    }
}
