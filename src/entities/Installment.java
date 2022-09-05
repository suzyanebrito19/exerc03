package entities;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Installment {
private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dueDate;
	private Double quantia;
	
	public Installment(Date dueDate, Double quantia) {
		this.dueDate = dueDate;
		this.quantia = quantia;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getQuantia() {
		return quantia;
	}

	public void setAmount(Double quantia) {
		this.quantia = quantia;
	}

	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", quantia);
 	}
}
