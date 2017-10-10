package com.example.listener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.listener.R.id.tvOut;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvOut = (TextView) findViewById(tvOut);
        Button btnOk = (Button) findViewById(R.id.btnOk);
        Button btnCancel = (Button) findViewById(R.id.btnCancel);
    }
    View.OnClickListener oclBtn = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // по id определеяем кнопку, вызвавшую этот обработчик
            switch (view.getId()) {
                case R.id.btnOk:
                    tvOut.setText ( "Нажата кнопуля ОК" );
                    break;
            }
        }
    };

}
