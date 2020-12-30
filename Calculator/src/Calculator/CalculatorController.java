package Calculator;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML private TextField resultTextField;

    @FXML private Button clearButton;

    @FXML private Button oneButton;

    @FXML private Button fourbutton;

    @FXML private Button sevenButton;

    @FXML private Button twoButton;

    @FXML private Button fiveButton;

    @FXML private Button eightButton;

    @FXML private Button threeButton;

    @FXML private Button sixButton;

    @FXML private Button nineButton;

    @FXML private Button divideButton;

    @FXML private Button multiplyButton;

    @FXML private Button minusButton;

    @FXML private Button plusButton;

    @FXML private Button zeroButton;

    @FXML private Button equalButton;

    String temp = "";
    String temp2 = "";
    String operator = "";
    boolean operatorPressed = false;
    //double result = 0;


    private void calculateButtonPressed(ActionEvent event) {
        try {
//            BigDecimal amount = new BigDecimal(amountTextField.getText());
//            BigDecimal totalUsers = new BigDecimal(userTextField.getText());
//            BigDecimal tip = amount.multiply(tipPercentage);
//            BigDecimal total = amount.add(tip);
//            BigDecimal totalPerHead = total.divide(totalUsers);
//
//            tipTextField.setText(currency.format(tip));
//            totalTextField.setText(currency.format(total));
//            perHeadTextField.setText(currency.format(totalPerHead));
        }
        catch (NumberFormatException ex) {
//            amountTextField.setText("Enter amount");
//            amountTextField.selectAll();
//            amountTextField.requestFocus();
        }
    }

    @FXML
    private void oneClick(ActionEvent event) {
        temp +=1;
        if (operatorPressed){
            resultTextField.setText(temp2 + operator + temp);
        }else {
            resultTextField.setText(temp + operator + temp2);
        }
    }
    @FXML
    private void twoClick(ActionEvent event) {
        temp +=2;
        if (operatorPressed){
            resultTextField.setText(temp2 + operator + temp);
        }else {
            resultTextField.setText(temp + operator + temp2);
        }
    }
    @FXML
    private void threeClick(ActionEvent event) {
        temp +=3;
        if (operatorPressed){
            resultTextField.setText(temp2 + operator + temp);
        }else {
            resultTextField.setText(temp + operator + temp2);
        }
    }
    @FXML
    private void fourClick(ActionEvent event) {
        temp +=4;
        if (operatorPressed){
            resultTextField.setText(temp2 + operator + temp);
        }else {
            resultTextField.setText(temp + operator + temp2);
        }
    }
    @FXML
    private void fiveClick(ActionEvent event) {
        temp +=5;
        if (operatorPressed){
            resultTextField.setText(temp2 + operator + temp);
        }else {
            resultTextField.setText(temp + operator + temp2);
        }
    }
    @FXML
    private void sixClick(ActionEvent event) {
        temp +=6;
        if (operatorPressed){
            resultTextField.setText(temp2 + operator + temp);
        }else {
            resultTextField.setText(temp + operator + temp2);
        }
    }
    @FXML
    private void sevenClick(ActionEvent event) {
        temp +=7;
        if (operatorPressed){
            resultTextField.setText(temp2 + operator + temp);
        }else {
            resultTextField.setText(temp + operator + temp2);
        }
    }
    @FXML
    private void eightClick(ActionEvent event) {
        temp +=8;
        if (operatorPressed){
            resultTextField.setText(temp2 + operator + temp);
        }else {
            resultTextField.setText(temp + operator + temp2);
        }
    }@FXML
    private void nineClick(ActionEvent event) {
        temp +=9;
        if (operatorPressed){
            resultTextField.setText(temp2 + operator + temp);
        }else {
            resultTextField.setText(temp + operator + temp2);
        }
    }
    @FXML
    private void zeroClick(ActionEvent event) {
        temp +=0;
        if (operatorPressed){
            resultTextField.setText(temp2 + operator + temp);
        }else {
            resultTextField.setText(temp + operator + temp2);
        }
    }
    @FXML
    private void plusClick(ActionEvent event) {
        temp2 = temp;
        operator = "+";
        temp = "";
        resultTextField.setText(temp2 + operator + temp);
        operatorPressed=true;
    }
    @FXML
    private void minusClick(ActionEvent event) {
        temp2 = temp;
        operator = "-";
        temp = "";
        resultTextField.setText(temp2 + operator + temp);
        operatorPressed=true;

    }
    @FXML
    private void divideClick(ActionEvent event) {
        temp2 = temp;
        operator = "/";
        temp = "";
        resultTextField.setText(temp2 + operator + temp);
        operatorPressed=true;
    }
    @FXML
    private void multiplyClick(ActionEvent event) {
        temp2 = temp;
        temp = "";
        operator = "*";
        resultTextField.setText(temp2 + operator + temp);
        operatorPressed=true;
    }

    @FXML
    private void onFinalClick(ActionEvent event) {
        resultTextField.setText("");
        double num1 = Integer.parseInt(temp);
        double num2 = Integer.parseInt(temp2);
        double result = 0;

        switch (operator) {
            case "/":
                result = num2 / num1;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            default:
                result = 0;
        }




        resultTextField.setText(String.valueOf(result));

    }


    @FXML
    private void onCClick(ActionEvent event) {
        resultTextField.setText("");
        temp = "";
        temp2 = "";
        operator = "";

    }

    // called by FXMLLoader to initialize the controller
    public void initialize() {
//        // 0-4 rounds down, 5-9 rounds up
//        currency.setRoundingMode(RoundingMode.HALF_UP);
//
//        // listener for changes to tipPercentageSlider's value
//        tipPercentageSlider.valueProperty().addListener(
//                new ChangeListener<Number>() {
//                    @Override
//                    public void changed(ObservableValue<? extends Number> ov,
//                                        Number oldValue, Number newValue) {
//                        tipPercentage =
//                                BigDecimal.valueOf(newValue.intValue() / 100.0);
//                        tipPercentageLabel.setText(percent.format(tipPercentage));
//                    }
//                }
//        );
    }
}
