package drive.gpo;

import android.app.Activity;
        import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;

abstract public class MainActivity extends AsyncTask <String, Void, String> {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button send = (Button) this.findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                try {
                    Network sender = new Network("username@gmail.com", "password");
                    sender.sendMail("This is Subject",
                            "This is Body",
                            "user@gmail.com",
                            "user@yahoo.com");
                } catch (Exception e) {
                    Log.e("SendMail", e.getMessage(), e);
                }

            }
        });

    }
}

