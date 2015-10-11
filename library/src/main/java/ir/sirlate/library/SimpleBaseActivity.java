package ir.sirlate.library;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;

public abstract class SimpleBaseActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show();
    }
}
