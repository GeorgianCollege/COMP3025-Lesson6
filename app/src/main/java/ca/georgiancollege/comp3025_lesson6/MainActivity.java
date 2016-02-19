package ca.georgiancollege.comp3025_lesson6;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // PRIVATE INSTANCE VARIABLES
    private TextView _welcomeLabel;
    private  Button _clickMeButton;
    private EditText _userInputTextBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // create a reference to the TextView Control
        this._welcomeLabel = (TextView) findViewById(R.id.welcomeLabel);

        // create a reference to the EditText Control
        this._userInputTextBox = (EditText) findViewById(R.id.userInputTextBox);

        this._userInputTextBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // change welcome  label whenever user changes the EditText Control
                _welcomeLabel.setText(_userInputTextBox.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        // create a reference to the Button Control
        this._clickMeButton = (Button) findViewById(R.id.clickMeButton);

        // create a click listener for our Button Control
        this._clickMeButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // this is where the fun happens
                _welcomeLabel.setText(getString(R.string.welcome_string));
            }
        });

    }


}
