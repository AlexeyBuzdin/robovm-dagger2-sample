package lv.jug.byoctj.android;

import lv.jug.byoctj.android.dagger.Dagger_DaggerComponent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import lv.jug.byoctj.shared.SharedController;
import lv.jug.byoctj.shared.domain.Payment;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedController controller = Dagger_DaggerComponent.create().getSharedController();

        TextView textView = new TextView(this);
        textView.setText(controller.checkPayment(new Payment()));
        setContentView(textView);
    }
}
