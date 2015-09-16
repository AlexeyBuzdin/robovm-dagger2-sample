package lv.abuzdin.robovm.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import lv.abuzdin.robovm.android.dagger.DaggerMainComponent;
import lv.abuzdin.robovm.shared.Payment;
import lv.abuzdin.robovm.shared.SharedController;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedController controller = DaggerMainComponent.create().getSharedController();

        TextView textView = new TextView(this);
        textView.setText(controller.checkPayment(new Payment()));
        setContentView(textView);
    }
}
