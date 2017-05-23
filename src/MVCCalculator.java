/**
 * Created by zak on 23/05/17.
 */
public class MVCCalculator {
    public static void main(String[] args){
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();

        CalculatorController theController = new CalculatorController(theView, theModel);

        theView.setVisible(true);
    }
}
