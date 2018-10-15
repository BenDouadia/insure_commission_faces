package insure.commission.salesChannel.control;

import insure.commission.salesChannel.entity.CommunicationModel;
import insure.commission.utility.BasePage;

public class CommunicationConfiguration {
	private static CommunicationModel communicationModel = new CommunicationModel();

	private static int suffix = BasePage.randomNumber();
	private static BasePage basePage = new BasePage();
	private static CommunicationConfiguration instance;

	public static CommunicationConfiguration getInstance() {
		if (instance == null) {
			instance = new CommunicationConfiguration();
		}

		return instance;
	}

	public static CommunicationModel buildCommunication() {
		communicationModel.setPhoneNumber("00 - 0000000000");
		communicationModel.setFax("00 - 0000000000");
		communicationModel.setEmail("email@mail.com");
		communicationModel.setWebsite("www.webseite.com");
		return communicationModel;
	}

	public static CommunicationModel editCommunication() {
		communicationModel.setPhoneNumber("11 - 111111111");
		communicationModel.setFax("011 - 111111111");
		communicationModel.setEmail("neu-email@mail.com");
		communicationModel.setWebsite("www.neu-webseite.com");
		return communicationModel;
	}

	public CommunicationModel getCommunication() {
		return communicationModel;
	}

	public void setCommunication(CommunicationModel communicationModel) {
		this.communicationModel = communicationModel;
	}
}
