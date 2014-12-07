package lv.jug.byoctj.android;

import lv.jug.byoctj.android.dagger.Dagger_DaggerComponent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import lv.jug.byoctj.shared.CoreService;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CoreService coreService = Dagger_DaggerComponent.create().getCoreService();

        TextView textView = new TextView(this);
        textView.setText(coreService.provideString("Android"));
        setContentView(textView);
    }
}
