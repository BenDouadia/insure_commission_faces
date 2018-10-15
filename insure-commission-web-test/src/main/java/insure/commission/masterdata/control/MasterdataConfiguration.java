package insure.commission.masterdata.control;

import insure.commission.enums.MasterdataGender;
import insure.commission.enums.MasterdataType;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;

public class MasterdataConfiguration {
	private static MasterdataModel masterdataModel = new MasterdataModel();
	static BasePage basePage = new BasePage();
	private static int suffix = basePage.randomNumber();
	private static MasterdataConfiguration instance;

	public static MasterdataConfiguration getInstance() {
		if (instance == null) {
			instance = new MasterdataConfiguration();
		}

		return instance;
	}

	public static MasterdataModel buildMasterdata() {
		masterdataModel.setType(MasterdataType.Person);
		masterdataModel.setName("Name_Test_" + suffix);
		masterdataModel.setFirstName("Vorname_Test_" + suffix );
		masterdataModel.setTitle("Dr.");
		masterdataModel.setGender(MasterdataGender.Male);
		masterdataModel.setAdditionalNameOne("Namenszusatz-1_Test_" );
		masterdataModel.setAdditionalNameTwo( "Namenszusatz-2_Test_" );
		masterdataModel.setNationality("Deutschland");
		masterdataModel.setLanguage("Deutsch");
		masterdataModel.setCommentOne("Bemerkung-1 1");
		masterdataModel.setCommentTwo("Bemerkung-2 1");
		masterdataModel.setPersonalSalutation("Persoenliche Anrede_Test_" );
		masterdataModel.setCategory("Kategorie 1");
		return masterdataModel;
	}

	public static MasterdataModel editMasterdata() {
		masterdataModel.setType(MasterdataType.Person);
		masterdataModel.setName("Neu_Name_Test_" + suffix);
		masterdataModel.setFirstName("Neu_Vorname_Test_" + suffix);
		masterdataModel.setTitle("Dr.");
		masterdataModel.setGender(MasterdataGender.Female);
		masterdataModel.setAdditionalNameOne("Neu_Namenszusatz-1_Test_" + suffix);
		masterdataModel.setAdditionalNameTwo( "Neu_Namenszusatz-2_Test_" + suffix);
		masterdataModel.setNationality("Marokko");
		masterdataModel.setLanguage("Englisch");
		masterdataModel.setCommentOne("Bemerkung-1 2");
		masterdataModel.setCommentTwo("Bemerkung-2 1");
		masterdataModel.setPersonalSalutation("Neu_Persoenliche Anrede_Test_" + suffix);
		masterdataModel.setCategory("Kategorie2");
		return masterdataModel;
	}

	public MasterdataModel getMasterdata() {
		return masterdataModel;
	}

	public void setMasterdata(MasterdataModel masterdataModel) {
		this.masterdataModel = masterdataModel;
	}
}
