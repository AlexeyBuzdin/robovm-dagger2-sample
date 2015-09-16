package lv.abuzdin.robovm.shared;

import javax.inject.Inject;

public class SharedController {

    PaymentValidator paymentValidator;

    @Inject
    public SharedController(PaymentValidator paymentValidator) {
        this.paymentValidator = paymentValidator;
    }

    public String checkPayment(Payment payment) {
        return "Payment is " + (paymentValidator.isValid(payment) ? "valid" : "invalid");
    }
}
