package ir.sirlate.library;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;

public class ToasterActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Toast.makeText(this, "hi! My name is: " + getClass().getSimpleName(), Toast.LENGTH_LONG).show();
    }
}
