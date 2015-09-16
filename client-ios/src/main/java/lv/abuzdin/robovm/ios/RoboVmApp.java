package lv.abuzdin.robovm.ios;

import lv.abuzdin.robovm.ios.dagger.DaggerDaggerComponent;
import lv.abuzdin.robovm.shared.Payment;
import lv.abuzdin.robovm.shared.SharedController;
import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.*;

public class RoboVmApp extends UIApplicationDelegateAdapter {

    SharedController service;

    @Override
    public boolean didFinishLaunching(UIApplication application,
                                      UIApplicationLaunchOptions launchOptions) {
        service = DaggerDaggerComponent.create().getCoreService();

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