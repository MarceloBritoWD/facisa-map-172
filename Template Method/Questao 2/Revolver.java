
public class Revolver extends CapitalStrategy {
	
	private double unusedRiskFactor(Loan loan) {
		return 1;
	}
	
	@Override
	public double capital(Loan loan){
		return loan.outstandingRiskAmount() + (loan.unusedRiskAmount() * unusedRiskFactor(loan));
	}
}
