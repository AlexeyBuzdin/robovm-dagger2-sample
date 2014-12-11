package lv.jug.byoctj.shared;

import lv.jug.byoctj.shared.domain.Payment;
import lv.jug.byoctj.shared.validator.PaymentValidator;

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
