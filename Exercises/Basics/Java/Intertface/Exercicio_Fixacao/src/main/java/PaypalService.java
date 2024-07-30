public class PaypalService implements OnlinePaymentService{
    public PaypalService() {
    }

    public Double paymentFee (Double amount) {
        return amount * 0.02;
    }

    public Double interest (Double amount, Integer months) {
        return amount * 0.01 * months;
    }

    @Override
    public String toString() {
        return "PaypalService{}";
    }
}
