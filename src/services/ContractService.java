package services;

import java.util.Calendar;
import java.util.Date;
import entities.Contract;
import entities.Installment;

public class ContractService {
private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int meses) {
		double basicQuota = contract.getTotalValor() /meses;
        for (int i = 1; i <= meses; i++) {
            Date date = addMeses(contract.getDate(), i);
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double fullQuota =  updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            contract.addInstallment(new Installment(date, fullQuota));
        }
	}
	
	private Date addMeses(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
