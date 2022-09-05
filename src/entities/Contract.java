package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer numero;
	private Date date;
	private Double totalValor;
	
	private List<Installment> installments = new ArrayList<>();
	
	public Contract(Integer numero, Date date, Double totalValor) {
		this.numero = numero;
		this.date = date;
		this.totalValor = totalValor;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValor() {
		return totalValor;
	}

	public void setTotalValor(Double totalValor) {
		this.totalValor = totalValor;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void addInstallment(Installment installment) {
		installments.add(installment);
	}

	public void removeInstallment(Installment installment) {
		installments.remove(installment);
	}
}
