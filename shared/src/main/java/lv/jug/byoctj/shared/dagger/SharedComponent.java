package lv.jug.byoctj.shared.dagger;

import dagger.Component;
import lv.jug.byoctj.shared.validator.PaymentValidator;

@Component(modules = SharedModule.class)
public interface SharedComponent {

    PaymentValidator getPaymentValidator();

}
