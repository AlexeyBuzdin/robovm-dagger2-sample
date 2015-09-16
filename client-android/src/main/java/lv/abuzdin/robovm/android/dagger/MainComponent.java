package lv.abuzdin.robovm.android.dagger;

import dagger.Component;
import lv.abuzdin.robovm.shared.SharedController;

@Component(modules = AndroidModule.class)
public interface MainComponent {
    SharedController getSharedController();
}
