package lv.jug.byoctj.ios;

import lv.jug.byoctj.ios.dagger.Dagger_DaggerComponent;
import lv.jug.byoctj.ios.dagger.IOSModule;
import lv.jug.byoctj.shared.CoreService;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;

public class RoboVmApp extends UIApplicationDelegateAdapter {

    CoreService service;

    @Override
    public boolean didFinishLaunching(UIApplication application,
                                      UIApplicationLaunchOptions launchOptions) {
        service = Dagger_DaggerComponent.create().getCoreService();

        final UIButton button = UIButton.create(UIButtonType.RoundedRect);
        button.setFrame(new CGRect(115.0f, 121.0f, 91.0f, 37.0f));
        button.setTitle(service.provideString("iOS"), UIControlState.Normal);

        button.addOnTouchUpInsideListener((c, e) -> {
            button.setTitle("Hello", UIControlState.Normal);
        });

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