import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zak on 23/05/17.
 */
public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel){

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalculateListner());
    }

    class CalculateListner implements ActionListener{
        public void actionPerformed(ActionEvent arg0){
            int firstNumber, secondNumber = 0;

            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNumbers(firstNumber, secondNumber);

                theView.setCalcSolution(theModel.getCalculationValue());
            }

            catch (NumberFormatException ex){
                theView.displayErrorMessage("You need to enter two integers");
            }
        }
    }
}
