package insure.commission.communication.control;

import insure.commission.communication.entity.CommunicationModel;
import insure.commission.utility.BasePage;

public class CommunicationConfiguration {
	private static CommunicationModel communicationModel = new CommunicationModel();
	static BasePage basePage = new BasePage();
	private static int suffix = basePage.randomNumber();
	private static CommunicationConfiguration instance;

	public static CommunicationConfiguration getInstance() {
		if (instance == null) {
			instance = new CommunicationConfiguration();
		}

		return instance;
	}

	public static CommunicationModel buildCommunicationPhone() {
		communicationModel.setChannel("Telefon");
		communicationModel.setType("Gesch�ftlich");
		communicationModel.setPhoneType("Mobil");
		communicationModel.setCountry("Deutschland");
		communicationModel.setAreaCode("00");
		communicationModel.setNumber("00000");
		communicationModel.setAdvertisement("checked");
		communicationModel.setAdvertisingFrom("12:00");
		communicationModel.setAdvertisingTo("20:00");
		communicationModel.setNote("Notiz-Test-" + suffix);
		return communicationModel;
	}

	public static CommunicationModel editCommunicationPhone() {
		communicationModel.setChannel("Telefon");
		communicationModel.setType("Privat");
		communicationModel.setPhoneType("Mobil");
		communicationModel.setCountry("Marokko");
		communicationModel.setAreaCode("00212");
		communicationModel.setNumber("1111111");
		communicationModel.setAdvertisement("checked");
		communicationModel.setAdvertisingFrom("07:00");
		communicationModel.setAdvertisingTo("17:00");
		communicationModel.setNote("Neu-Notiz-Test-" + suffix);
		return communicationModel;
	}

	public static CommunicationModel buildCommunicationEmail() {
		communicationModel.setChannel("E-Mail");
		communicationModel.setType("Gesch�ftlich");
		communicationModel.seteMail("email-test@mail.com");
		communicationModel.setNote("Notiz-Test-" + suffix);
		return communicationModel;
	}

	public static CommunicationModel editCommunicationEmail() {
		communicationModel.setChannel("E-Mail");
		communicationModel.setType("Gesch�ftlich");
		communicationModel.seteMail("Neu-email-test@mail.com");
		communicationModel.setNote("Neu-Notiz-Test-" + suffix);
		return communicationModel;
	}

	public static CommunicationModel buildCommunicationSocialNetwork() {
		communicationModel.setChannel("Soziale Netzwerke");
		communicationModel.setPlatform("Twitter");
		communicationModel.setAccount("Twitter-Konto");
		communicationModel.setNote("Notiz-Test-" + suffix);
		return communicationModel;
	}

	public static CommunicationModel editCommunicationSocialNetwork() {
		communicationModel.setChannel("Soziale Netzwerke");
		communicationModel.setPlatform("Facebook");
		communicationModel.setAccount("Facebook-Konto");
		communicationModel.setNote("Neu-Notiz-Test-" + suffix);
		return communicationModel;
	}

	public static CommunicationModel buildCommunicationWebsite() {
		communicationModel.setChannel("Webseite");
		communicationModel.setUrl("www.webseite-test.de");
		communicationModel.setNote("Notiz-Test-" + suffix);
		return communicationModel;
	}

	public static CommunicationModel editCommunicationWebsite() {
		communicationModel.setChannel("Webseite");
		communicationModel.setUrl("www.neu-webseite-test.de");
		communicationModel.setNote("Neu-Notiz-Test-" + suffix);
		return communicationModel;
	}

	public CommunicationModel getCommunication() {
		return communicationModel;
	}

	public void setCommunication(CommunicationModel communicationModel) {
		this.communicationModel = communicationModel;
	}
}
