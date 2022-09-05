package services;

public class PaypalService implements OnlinePaymentService {

	private static final double FEE_PERCENTAGE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;

	@Override
	public double paymentFee(double quantia) {
		return quantia * FEE_PERCENTAGE;
	}
	@Override
	public double interest(double quantia, int meses) {
		return quantia * MONTHLY_INTEREST * quantia;
	}
}

