package com.alex.calculadora.interactor;

import com.alex.calculadora.presenter.MainActivityPresenter;

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivityPresenter presenter;

    public MainActivityInteractorImpl(MainActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void sumar(String number1, String number2) {
            Double resultado = Double.valueOf(number1)+Double.valueOf(number2);
            presenter.showResult(String.valueOf(resultado));
            //presenter.showError(e);
    }
}
