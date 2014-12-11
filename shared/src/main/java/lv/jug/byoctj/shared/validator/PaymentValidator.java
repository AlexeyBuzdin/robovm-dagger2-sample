package lv.jug.byoctj.shared.validator;

import lv.jug.byoctj.shared.domain.Payment;

import javax.inject.Inject;

public class PaymentValidator {

    @Inject
    public PaymentValidator() {
    }

    public boolean isValid(Payment payment){
        return payment.getAmount() > 0;
    }
}
