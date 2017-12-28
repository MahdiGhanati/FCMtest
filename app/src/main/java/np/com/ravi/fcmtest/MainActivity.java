package np.com.ravi.fcmtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String tkn = FirebaseInstanceId.getInstance().getToken();
//        Toast.makeText(MainActivity.this, "Current token ["+tkn+"]",
//                Toast.LENGTH_LONG).show();
//        Log.d("App", "Token ["+tkn+"]");
    }
}
