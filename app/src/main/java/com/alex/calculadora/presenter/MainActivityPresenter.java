package com.alex.calculadora.presenter;

public interface MainActivityPresenter {
    void sumar(String number1,String number2);//interactor
    void showError(String error);//view
    void showResult(String result);//view
}
