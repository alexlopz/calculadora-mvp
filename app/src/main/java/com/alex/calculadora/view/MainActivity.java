package com.alex.calculadora.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.alex.calculadora.R;
import com.alex.calculadora.presenter.MainActivityPresenter;
import com.alex.calculadora.presenter.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainActivityView{

    private EditText edNumber1, edNumber2;
    private TextView tvResult;
    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNumber1 = (EditText)findViewById(R.id.edNumber1);
        edNumber2 = (EditText)findViewById(R.id.edNumber2);
        tvResult = (TextView)findViewById(R.id.tvResult);


        presenter = new MainActivityPresenterImpl(this);



    }

    public void suma(View view){
        String number1 = edNumber1.getText().toString();
        String number2 = edNumber2.getText().toString();
        presenter.sumar(number1, number2);
    }

    @Override
    public void showResult(String result) {
        tvResult.setText(result);
    }

    @Override
    public void showError(String error) {
        tvResult.setText(error);
    }
}
