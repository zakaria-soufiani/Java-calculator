/**
 * Created by zak on 23/05/17.
 */
public class CalculatorModel {
    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber + secondNumber;
    }

    public int getCalculationValue(){
        return calculationValue;
    }
}
