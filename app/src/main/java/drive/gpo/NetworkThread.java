package drive.gpo;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by neetesh on 8/30/2015.
 */
public class NetworkThread extends AsyncTask  {
    @Override
    protected Object doInBackground(Object[] objects) {
        Network m = new Network("140050012@iitb.ac.in", "aakash@1");

        String toArr = "nidsdocs@gmail.com";
        m.setTo(toArr);
        m.setFrom("nidsdocs1@gmail.com");
        m.setSubject("This is an email sent using my Mail JavaMail wrapper from an Android device.");
        m.setBody("Email body.");
        try {
            m.send();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            /*
            m.addAttachment("/sdcard/filelocation");
/*
                    if(m.send()) {
                        Toast.makeText("Email was sent successfully.", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText("Email was not sent.", Toast.LENGTH_LONG).show();
                    }
                    */
        } catch(Exception e) {
            //Toast.makeText(MailApp.this, "There was a problem sending the email.", Toast.LENGTH_LONG).show();
            Log.e("MailApp", "Could not send email", e);
        }

        return null;
    }
}
