package insure.commission.salespartner.control;

import insure.commission.salespartner.entity.SalespartnerModel;
import insure.commission.utility.BasePage;

public class SalespartnerConfiguration {
	private static SalespartnerModel salespartnerModel = new SalespartnerModel();
	static BasePage basePage = new BasePage();
	private static int suffix = basePage.randomNumber();
	private static SalespartnerConfiguration instance;

	public static SalespartnerConfiguration getInstance() {
		if (instance == null) {
			instance = new SalespartnerConfiguration();
		}

		return instance;
	}

	public static SalespartnerModel buildSalespartner() {
		salespartnerModel.setParentNumber("0000000005");
		salespartnerModel.setParentName("Tester2");
		salespartnerModel.setParentFirstName("Tester2");
		salespartnerModel.setSalesChannel("V1");
		salespartnerModel.setOrganizationRole("R2");
		salespartnerModel.setMainAccountNumber("0000000005");
		salespartnerModel.setMainAccountName("Tester2");
		salespartnerModel.setMainAccountFirstName("Tester2");
		salespartnerModel.setDateOfEntrance(basePage.getDateOfNextDay());
		return salespartnerModel;
	}

	public static SalespartnerModel editSalespartner() {
		salespartnerModel.setParentNumber("0000000004");
		salespartnerModel.setParentName("Tester3");
		salespartnerModel.setParentFirstName("Tester3");
		salespartnerModel.setSalesChannel("V1");
		salespartnerModel.setOrganizationRole("R1");
		salespartnerModel.setMainAccountNumber("0000000004");
		salespartnerModel.setMainAccountName("Tester3");
		salespartnerModel.setMainAccountFirstName("Tester3");
		salespartnerModel.setDateOfEntrance(basePage.getDateOfNextDay());
		return salespartnerModel;
	}

	public SalespartnerModel getSalespartner() {
		return salespartnerModel;
	}

	public void setSalespartner(SalespartnerModel salespartnerModel) {
		this.salespartnerModel = salespartnerModel;
	}
}
