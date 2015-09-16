package lv.abuzdin.robovm.ios.dagger;

import dagger.Component;
import lv.abuzdin.robovm.shared.SharedController;

@Component(modules = IOSModule.class)
public interface DaggerComponent {
    SharedController getCoreService();
}
