package com.xworkz.runner;

import com.xworkz.internal.*;

public class Runner {
	public static void main(String[] args) {
		BankRule bankRule=new Bank();
		bankRule.antiMoneyLaunderingCompliance();
		bankRule.atmUsageLimit();
		bankRule.chequeClearanceTime();
		bankRule.confidentiality();
		bankRule.customerServiceStandards();
		bankRule.depositInsurance();
		bankRule.loanEligibilityCriteria();
		bankRule.minimumBalance();
		bankRule.noOverdrafts();
		bankRule.openingHours();
		bankRule.secureOnlineBanking();
		bankRule.silence();
		bankRule.timelyLoanRepayments();
		bankRule.transactionFee();
		bankRule.validIDRequired();
		
		
		
				HospitalRule hospitalRule=new Hospital();
				hospitalRule.mask();
				hospitalRule.noSmoking();
				hospitalRule.silence();
				
				System.out.println("========================");
				
				TrafficRule trafficRule=new Traffic();
				
				trafficRule.checkBlindSpots();
				trafficRule.dl();
				trafficRule.drinkAndDrive();
				trafficRule.insurance();
				trafficRule.noMobilePhoneUse();
				trafficRule.numberPlate();
				trafficRule.obeyLaneMarkings();
				trafficRule.obeyTrafficSignals();
				trafficRule.overSpeeding();
				trafficRule.respectNoParkingZones();
				trafficRule.useIndicator();
				trafficRule.wareHelmet();
				trafficRule.wareSeatBelt();
				trafficRule.yieldToEmergencyVehicles();
				
				System.out.println("========================");
				
				TempleRules rule=new Temple();
				rule.appropriateAttire();
				rule.followInstructions();
				rule.maintainCleanliness();
				rule.maintainSilence();
				rule.noPets();
				rule.noPhotography();
				rule.noSmoking();
				rule.removeShoes();
				rule.respectServiceTimes();
				rule.respectWorshippers();
				

				
				
			}

		}

		
	
