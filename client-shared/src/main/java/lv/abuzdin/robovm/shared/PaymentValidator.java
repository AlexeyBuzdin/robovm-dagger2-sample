package lv.abuzdin.robovm.shared;

import javax.inject.Inject;

public class PaymentValidator {

    @Inject
    public PaymentValidator() {
    }

    public boolean isValid(Payment payment) {
        return false;
    }
}
