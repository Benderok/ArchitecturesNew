package Seminar_5.calculatorMVC;

import Seminar_5.calculatorMVC.view.ConsoleView;
import Seminar_5.calculatorMVC.view.IView;

public class Main {
    public static void main(String[] args) {
        IView view = new ConsoleView();
        view.runCalculator();
    }
}