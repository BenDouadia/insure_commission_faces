package insure.commission.costCenter.control;

import insure.commission.costCenter.entity.CostCenterModel;
import insure.commission.utility.BasePage;

public class CostCenterConfiguration {
	private static BasePage basePage = new BasePage();
	private static CostCenterConfiguration instance;
	private static CostCenterModel costCenterModel = new CostCenterModel();

	public static CostCenterConfiguration getInstance() {
		if (instance == null) {
			instance = new CostCenterConfiguration();
		}
		return instance;
	}

	public static CostCenterModel buildCostCenter() {
		costCenterModel.setNumber("Test" + basePage.randomNumber());
		costCenterModel.setName("Name-Test_");
		costCenterModel.setShortName("Kurzename-Test_");
		return costCenterModel;
	}

	public static CostCenterModel editCostCenter() {
		costCenterModel.setName("Neu-Name-Test_");
		costCenterModel.setShortName("Neu-Kurzename-Test_");
		return costCenterModel;
	}


	public CostCenterModel getCostCenter() {
		return costCenterModel;
	}

	public void setCostCenter(CostCenterModel costCenterModel) {
		CostCenterConfiguration.costCenterModel = costCenterModel;
	}
}
