package lv.jug.byoj.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import lv.jug.byojct.core.CoreService;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CoreService coreService = new CoreService();

        TextView textView = new TextView(this);
        textView.setText(coreService.provideString("Android"));
        setContentView(textView);
    }
}