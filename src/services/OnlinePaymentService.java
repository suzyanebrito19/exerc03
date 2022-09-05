package services;

public interface OnlinePaymentService {
	double paymentFee(double quantia);
	double interest(double quantia, int meses);
}
