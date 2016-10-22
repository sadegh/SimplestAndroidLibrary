package ir.sirlate.library;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ToasterActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,
            "Hey there! My name is: " + getClass().getSimpleName(),
            Toast.LENGTH_LONG).show();
    }
}
