package insure.commission.relation.control;

import insure.commission.relation.entity.RelationModel;
import insure.commission.utility.BasePage;

public class RelationConfiguration {
	private	 static RelationModel relationModel = new RelationModel();
	static BasePage basePage = new BasePage();
	private static int suffix = basePage.randomNumber();
	private static RelationConfiguration instance;

	public static RelationConfiguration getInstance() {
		if (instance == null) {
			instance = new RelationConfiguration();
		}

		return instance;
	}

	public static RelationModel buildRelation() {
		relationModel.setSourceFunction("Konzern");
		relationModel.setSourceFunctionOne("Aus-Funktion-1-Test");
		relationModel.setSourceFunctionTwo("Aus-Funktion-2-Test");
		relationModel.setTargetRelation("Tester1");
		relationModel.setTargetFunction("Konzern");
		relationModel.setTargetFunctionOne("Ziel-Funktion-1-Test");
		relationModel.setTargetFunctionTwo("Ziel-Funktion-2-Test");
		return relationModel;
	}

	public static RelationModel editRelation() {
		relationModel.setSourceFunction("Oberkonzern");
		relationModel.setSourceFunctionOne("Neu-Aus-Funktion-1-Test");
		relationModel.setSourceFunctionTwo("Neu-Aus-Funktion-2-Test");
		relationModel.setTargetRelation("Tester2");
		relationModel.setTargetFunction("Oberkonzern");
		relationModel.setTargetFunctionOne("Neu-Ziel-Funktion-1-Test");
		relationModel.setTargetFunctionTwo("Neu-Ziel-Funktion-2-Test");
		return relationModel;
	}

	public RelationModel getRelation() {
		return relationModel;
	}

	public void setRelation(RelationModel relationModel) {
		this.relationModel = relationModel;
	}
}
