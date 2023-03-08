package com.mss.salary;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class IncomeTaxService {

	@Value("${cessAmount}")
	private double cessAmount;

	@Value("${eightyCMaxLimit}")
	private double eightyCMaxLimit;

	@Value("${standardDeductionLimit}")
	private double standardDeductionLimit;

	@Value("${npsSchemeMaxLimit}")
	private double npsSchemeMaxLimit;

	@Value("${eightyDMaxLimit}")
	private double eightyDMaxLimit;

	@Value("${twentyFourBMaxLimit}")
	private double twentyFourBMaxLimit;

	@Value("${ltaMaxLimit}")
	private double ltaMaxLimit;

	@Value("${taxAmount}")
	private double taxAmount;

	@Value("${lessthan75}")
	private double lessthan75;

	@Value("${lessthan10L}")
	private double lessthan10L;

	@Value("${lessthan125L}")
	private double lessthan125L;

	@Value("${lessthan150L}")
	private double lessthan150L;

	@Value("${greaterthan10l}")
	private double greaterthan10l;

	@Value("${above150L}")
	private double above150L;

	@Value("${oldSlab1End}")
	private double oldSlab1End;

	@Value("${oldSlab2Start}")
	private double oldSlab2Start;

	@Value("${oldSlab2End}")
	private double oldSlab2End;

	@Value("${oldSlab3Start}")
	private double oldSlab3Start;

	@Value("${olSlab3End}")
	private double olSlab3End;

	@Value("${olSlab4End}")
	private double olSlab4End;

	@Value("${newSlab1End}")
	private double newSlab1End;

	@Value("${newSlab2Start}")
	private double newSlab2Start;

	@Value("${newSlab2End}")
	private double newSlab2End;

	@Value("${newSlab3Start}")
	private double newSlab3Start;

	@Value("${newSlab3End}")
	private double newSlab3End;

	@Value("${newSlab4Start}")
	private double newSlab4Start;

	@Value("${newSlab4End}")
	private double newSlab4End;

	@Value("${newSlab5Start}")
	private double newSlab5Start;

	@Value("${newSlab5End}")
	private double newSlab5End;

	@Value("${newSlab6Start}")
	private double newSlab6Start;

	@Value("${newSlab6End}")
	private double newSlab6End;

	@Value("${newlab7End}")
	private double newlab7End;

	// Below are the Percentages from Property File

	@Value("${fivePercent}")
	private double fivePercent;

	@Value("${tenPercent}")
	private double tenPercent;

	@Value("${fifteenPercent}")
	private double fifteenPercent;

	@Value("${twentyPercent}")
	private double twentyPercent;

	@Value("${twentyFivePercent}")
	private double twentyFivePercent;

	@Value("${thirtyPercent}")
	private double thirtyPercent;

	@Value("${newSlabL1End}")
	private double newSlabL1End;
	@Value("${newSlabL2Start}")
	private double newSlabL2Start;
	@Value("${newSlabL2End}")
	private double newSlabL2End;
	@Value("${newSlabL3Start}")
	private double newSlabL3Start;
	@Value("${newSlabL3End}")
	private double newSlabL3End;
	@Value("${newSlabL4Start}")
	private double newSlabL4Start;
	@Value("${newSlabL4End}")
	private double newSlabL4End;
	@Value("${newSlabL5Start}")
	private double newSlabL5Start;
	@Value("${newSlabL5End}")
	private double newSlabL5End;
	@Value("${newSlabL6End}")
	private double newSlabL6End;
	@Value("${lessthan9L}")
	private double lessthan9L;
	@Value("${lessthan12L}")
	private double lessthan12L;
	@Value("${lessthan15L}")
	private double lessthan15L;
	@Value("${greaterthan15}")
	private double greaterthan15;
	@Value("${noTaxAmount}")
	private double noTaxAmount;

	public Map<String, Object> calculateTax(String regimeType, double totalAmount, double eightyC, double npsScheme,
			double eightyD, double twentyFourB, double lta, double standardDeduction) {
		Map<String, Object> response = new HashMap<>();
		response.put("success", false);
		response.put("message", "Oops, something went wrong!");

		try {
			// if the slab type becomes new
			if (regimeType != null && !"".equals(regimeType) && regimeType.equals("new")) {
				if (totalAmount <= newSlab2End) {
					response.put("success", true);
					response.put("message", "Income Tax Rate - Nill");
					response.put("taxAmount", taxAmount);

				}
//					else if (totalAmount >= newSlab2Start && totalAmount <= newSlab2End) {
//
//     				double calAmount = totalAmount - newSlab1End;
//					taxAmount = fivePercent * calAmount;
//					double s=fourPercentCessOnTaxAmount(taxAmount);
//					System.out.println(s);
//					response.put("success", true);
//					response.put("message", "5% of total amount + 4% cess");
//					response.put("taxAmount", fourPercentCessOnTaxAmount(taxAmount));
//					
//
//				} 
				else if (totalAmount >= newSlab3Start && totalAmount <= newSlab3End) {
					double calAmount = totalAmount - newSlab2End;
					taxAmount = lessthan75 + tenPercent * calAmount;
					response.put("success", true);
					response.put("message", "₹ 12,500 + 10% above ₹ 5,00,000 + 4% cess");
					response.put("taxAmount", fourPercentCessOnTaxAmount(taxAmount));

				} else if (totalAmount >= newSlab4Start && totalAmount <= newSlab4End) {
					double calAmount = totalAmount - newSlab3End;
					taxAmount = lessthan10L + fifteenPercent * calAmount;
					response.put("success", true);
					response.put("message", "₹ 37,500 + 15% above ₹ 7,50,000 + 4% cess");
					response.put("taxAmount", fourPercentCessOnTaxAmount(taxAmount));

				} else if (totalAmount >= newSlab5Start && totalAmount <= newSlab5End) {
					double calAmount = totalAmount - newSlab4End;
					taxAmount = lessthan125L + twentyPercent * calAmount;
					response.put("success", true);
					response.put("message", "₹ 75,000 + 20% above ₹ 10,00,000 + 4% cess");
					response.put("taxAmount", fourPercentCessOnTaxAmount(taxAmount));

				} else if (totalAmount >= newSlab6Start && totalAmount <= newSlab6End) {
					double calAmount = totalAmount - newSlab5End;
					taxAmount = lessthan150L + twentyFivePercent * calAmount;
					response.put("success", true);
					response.put("message", "₹ 1,25,000 + 25% above ₹ 12,50,000 + 4% cess");
					response.put("taxAmount", fourPercentCessOnTaxAmount(taxAmount));

				} else {
					double calAmount = totalAmount - newlab7End;
					taxAmount = above150L + thirtyPercent * calAmount;
					response.put("success", true);
					response.put("message", "₹ 1,87,500 + 30% above ₹ 15,00,000 + 4% cess");
					response.put("taxAmount", fourPercentCessOnTaxAmount(taxAmount));
				}

			}
			// If the slab type is latest for 2023
			else if (regimeType != null && !"".equals(regimeType) && regimeType.equals("latest")) {
				totalAmount -= standardDeductionLimit;

				if (totalAmount <= newSlabL1End) {
					response.put("success", true);
					response.put("message", "Income Tax Rate - Nill");
					response.put("taxAmount", taxAmount);

				} else if (totalAmount >= newSlabL2Start && totalAmount <= newSlabL2End) {

					double calAmount = totalAmount - newSlabL1End;
					taxAmount = fivePercent * calAmount;
					double s = fourPercentCessOnTaxAmount(taxAmount);
					response.put("success", true);
					response.put("message", "5% of total amount + 4% cess");
					response.put("taxAmount", fourPercentCessOnTaxAmount(taxAmount));
					
				} else if (totalAmount >= newSlabL3Start && totalAmount <= newSlabL3End) {
					if (totalAmount <= noTaxAmount) {
						response.put("success", true);
						response.put("message", "Income Tax Rate - Nill");
						response.put("taxAmount", taxAmount);
					} else {
						double calAmount = totalAmount - newSlabL2End;
						taxAmount = lessthan9L + tenPercent * calAmount;
						response.put("success", true);
						response.put("message", "₹ 15000 + 10% above ₹ 6,00,000 + 4% cess");
						response.put("taxAmount", fourPercentCessOnTaxAmount(taxAmount));
					}

				} else if (totalAmount >= newSlabL4Start && totalAmount <= newSlabL4End) {
					double calAmount = totalAmount - newSlabL3End;
					taxAmount = lessthan12L + fifteenPercent * calAmount;
					response.put("success", true);
					response.put("message", "₹ 45,000 + 15% above ₹ 9,00,000 + 4% cess");
					response.put("taxAmount", fourPercentCessOnTaxAmount(taxAmount));

				} else if (totalAmount >= newSlabL5Start && totalAmount <= newSlabL5End) {
					
					double calAmount = totalAmount - newSlabL4End;
					taxAmount = lessthan15L + twentyPercent * calAmount;
					response.put("success", true);
					response.put("message", "₹ 90,000 + 20% above ₹ 12,00,000 + 4% cess");
					response.put("taxAmount", fourPercentCessOnTaxAmount(taxAmount));

				} else {
			
					double calAmount = totalAmount - newSlabL5End;
					taxAmount = greaterthan15 + thirtyPercent * calAmount;
					response.put("success", true);
					response.put("message", "₹ 1,50,000 + 30% above ₹ 15,00,000 + 4% cess");
					response.put("taxAmount", fourPercentCessOnTaxAmount(taxAmount));
				}

			}

			
			// old regime need to work
			else {
				// old regime need to work
//		Deducations Max Limit for Old Slabs:
//			-------------------
//			SEC 80C (LIC,EPF,PPF)       -  1,50,000
//			Standard Deduction          -    50,000
//			NPS Scheme                  -    50,000
//			SEC 80D(Health Insurance)   -    50,000
//			SEC 24B (Home Loan)         -  2,00,000
//			LTA(Leave Travel Allowance) -    50,000
				
				
				

				double eightyCF = 150000;
				double npsSchemeF = 50000;
				double eightyDF = 50000;
				double twentyFourBF = 200000;
				double ltaF = 50000;
				double standardDF = 50000;

				if (eightyC <= eightyCMaxLimit && eightyC >= 0) {
					eightyCF = eightyC;
				} else if (eightyC < 0) {
					eightyCF = 0;
				}
				if (npsScheme <= npsSchemeMaxLimit && npsScheme >= 0) {
					npsSchemeF = npsScheme;
				} else if (npsScheme < 0) {
					npsSchemeF = 0;
				}
				if (eightyD <= eightyDMaxLimit && eightyD >= 0) {
					eightyDF = eightyD;
				} else if (eightyD < 0) {
					eightyDF = 0;
				}

				if (twentyFourB <= twentyFourBMaxLimit && twentyFourB >= 0) {
					twentyFourBF = twentyFourB;
				} else if (twentyFourB < 0) {
					twentyFourBF = 0;
				}

				if (lta <= ltaMaxLimit && lta >= 0) {
					ltaF = lta;
				} else if (lta < 0) {
					ltaF = 0;
				}

				if (standardDeduction <= standardDeductionLimit && standardDeduction >= 0) {
					standardDF = standardDeduction;
				} else if (standardDeduction < 0) {
					standardDF = 0;
				}

				double taxableIncomeDeduction = (eightyCF + npsSchemeF + eightyDF + twentyFourBF + ltaF + standardDF);
				totalAmount -= taxableIncomeDeduction;

				if (totalAmount <= oldSlab2End) {
					response.put("success", true);
					response.put("message", "Income Tax Rate - Nill");
					response.put("taxAmount", 0);
				}
//					else if (totalAmount >= oldSlab2Start && totalAmount <= oldSlab2End) {
//					double calAmount = totalAmount - oldSlab1End;
//					taxAmount = fivePercent * calAmount;
//					response.put("success", true);
//					response.put("message", "5% above ₹ 2,50,000 + 4% cess");
//					response.put("taxAmount", fourPercentCessOnTaxAmount(taxAmount));
//					response.put("Tax Payable", "No");
//					
//				} 
				else if (totalAmount >= oldSlab3Start && totalAmount <= olSlab3End) {
					double calAmount = totalAmount - oldSlab2End;
					taxAmount = lessthan75 + twentyPercent * calAmount;
					response.put("success", true);
					response.put("message", "₹ 12,500 + 20% above ₹ 5,00,000 + 4% cess");
					response.put("taxAmount", (fourPercentCessOnTaxAmount(taxAmount)));
				} else {
					double calAmount = totalAmount - olSlab4End;
					taxAmount = greaterthan10l + thirtyPercent * calAmount;
					response.put("success", true);
					response.put("message", "₹ 1,12,500 + 30% above ₹ 10,00,000 + 4% cess");
					response.put("taxAmount", fourPercentCessOnTaxAmount(taxAmount));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	private int fourPercentCessOnTaxAmount(double taxAmount) {

		return (int) ((cessAmount * taxAmount) + taxAmount);

	}

}
