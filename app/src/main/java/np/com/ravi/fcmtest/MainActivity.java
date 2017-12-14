package np.com.ravi.fcmtest;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

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
