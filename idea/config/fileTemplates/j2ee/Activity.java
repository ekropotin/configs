package ${PACKAGE_NAME};

import android.app.Activity;
import android.os.Handler;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;

#parse("File Header.java")
public class ${NAME} extends Activity {
    private final static String TAG = ${NAME}.class.getSimpleName();
    private final int MSG_1 = 0;
    private Handler mUiHandler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_1:
                    //
                    break;
                default:
                    break;
            }
        }
    };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
    }

    @Override
    protected void onResume() {
        super.onResume();
        //
    }

    @Override
    protected void onPause() {
        //
        super.onPause();
    }
}