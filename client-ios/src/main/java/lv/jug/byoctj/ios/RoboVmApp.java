package lv.jug.byoctj.ios;

import lv.jug.byoctj.ios.dagger.Dagger_DaggerComponent;
import lv.jug.byoctj.shared.SharedController;
import lv.jug.byoctj.shared.domain.Payment;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;

public class RoboVmApp extends UIApplicationDelegateAdapter {

    SharedController service;

    @Override
    public boolean didFinishLaunching(UIApplication application,
                                      UIApplicationLaunchOptions launchOptions) {
        service = Dagger_DaggerComponent.create().getCoreService();

        final UIButton button = UIButton.create(UIButtonType.RoundedRect);
        button.setFrame(new CGRect(115.0f, 121.0f, 200.0f, 37.0f));
        button.setTitle(service.checkPayment(new Payment()), UIControlState.Normal);

        UIWindow window = new UIWindow(UIScreen.getMainScreen().getBounds());
        window.setBackgroundColor(UIColor.lightGray());
        window.addSubview(button);
        window.makeKeyAndVisible();

        return true;
    }

    public static void main(String[] args) {
        try (NSAutoreleasePool pool = new NSAutoreleasePool()) {
            UIApplication.main(args, null, RoboVmApp.class);
        }
    }
}