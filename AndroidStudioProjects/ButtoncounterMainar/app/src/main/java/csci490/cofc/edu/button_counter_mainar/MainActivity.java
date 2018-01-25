package csci490.cofc.edu.button_counter_mainar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;

    private TextView counterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterText = (TextView)findViewById(R.id.counterText);
    }

    public void addClicked(View view) {
        counter++;
        counterText.setText(String.valueOf(counter));
    }

    public void subtractClicked(View view) {
        counter--;
        counterText.setText(String.valueOf(counter));
    }

    public void resetClicked(View view) {
        counter = 0;
        counterText.setText(String.valueOf(counter));
    }

}
