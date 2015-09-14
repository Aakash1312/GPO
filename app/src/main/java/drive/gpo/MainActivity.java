package drive.gpo;

import android.app.Activity;
        import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
import android.widget.Toast;

import org.apache.http.auth.NTCredentials;

public class MainActivity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        Button addImage = (Button) findViewById(R.id.send);
        addImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NetworkThread a=new NetworkThread();
a.execute();
            }
        });
    }
}

