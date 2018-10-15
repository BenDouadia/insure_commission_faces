package insure.commission.salesChannel.control;

import insure.commission.salesChannel.entity.SalesChannelModel;
import insure.commission.utility.BasePage;

public class SalesChannelConfiguration {

	private static SalesChannelModel salesChannelModel = new SalesChannelModel();

	private static int suffix = BasePage.randomNumber();
	private static BasePage basePage = new BasePage();
	private static SalesChannelConfiguration instance;

	public static SalesChannelConfiguration getInstance() {
		if (instance == null) {
			instance = new SalesChannelConfiguration();
		}

		return instance;
	}

	public static SalesChannelModel buildSalesChannel() {
		salesChannelModel.setNumber("Nr" + suffix);
		salesChannelModel.setShortName("ShortName");
		salesChannelModel.setName("Name" + suffix);
		salesChannelModel.setCompanyName("CompanyName");
		salesChannelModel.setExecutiveName("ExecutiveName");
		salesChannelModel.setTradeRegister("TradeRegister");
		salesChannelModel.setCreditorId("CreditorId");
		salesChannelModel.setCountry("Deutschland");
		salesChannelModel.setZipcode("00000");
		salesChannelModel.setCity("City");
		salesChannelModel.setStreet("Street");
		salesChannelModel.setHouseNumber("00");
		salesChannelModel.setLanguage("Deutsch");
		salesChannelModel.setCurrency("Euro");
		salesChannelModel.setContractStatus(basePage.getDateOfNextDay());
		salesChannelModel.setContractForm("ContractForm");
		salesChannelModel.setProbationTime("5");
		return salesChannelModel;
	}

	public static SalesChannelModel editSalesChannel() {
		salesChannelModel.setNumber("New-Nr" + suffix);
		salesChannelModel.setShortName("NewShortN");
//		salesChannelModel.setName("New-Name" + suffix);
		salesChannelModel.setCompanyName("New-CompanyName");
		salesChannelModel.setExecutiveName("New-ExecutiveName");
		salesChannelModel.setTradeRegister("New-TradeRegister");
		salesChannelModel.setCreditorId("New-CreditorId");
		salesChannelModel.setCountry("Marokko");
		salesChannelModel.setZipcode("11111");
		salesChannelModel.setCity("New-City");
		salesChannelModel.setStreet("New-Street");
		salesChannelModel.setHouseNumber("11");
		salesChannelModel.setLanguage("Englisch");
		salesChannelModel.setCurrency("Platin");
		salesChannelModel.setContractStatus(basePage.getDateOfNextDay());
		salesChannelModel.setContractForm("New-ContractForm");
		salesChannelModel.setProbationTime("10");
		return salesChannelModel;
	}

	public SalesChannelModel getSalesChannel() {
		return salesChannelModel;
	}

	public void setSalesChannel(SalesChannelModel salesChannelModel) {
		this.salesChannelModel = salesChannelModel;
	}
}
