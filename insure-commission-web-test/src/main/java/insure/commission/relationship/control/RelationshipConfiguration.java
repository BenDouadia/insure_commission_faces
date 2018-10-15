package insure.commission.relationship.control;

import insure.commission.relationship.entity.RelationshipModel;
import insure.commission.utility.BasePage;

public class RelationshipConfiguration {

	private static RelationshipModel relationshipModel = new RelationshipModel();

	static BasePage basePage = new BasePage();
	private static int suffix = basePage.randomNumber();
	private static RelationshipConfiguration instance;

	public static RelationshipConfiguration getInstance() {
		if (instance == null) {
			instance = new RelationshipConfiguration();
		}

		return instance;
	}

	public static RelationshipModel buildRelationship() {
		relationshipModel.setGroup("Gruppe1");
		relationshipModel.setTag("Kennzeichen1");
		return relationshipModel;
	}

	public static RelationshipModel editRelationship() {
		relationshipModel.setGroup("Gruppe2");
		relationshipModel.setTag("Test123");
		return relationshipModel;
	}

	public RelationshipModel getRelationship() {
		return relationshipModel;
	}

	public void setRelationship(RelationshipModel relationship) {
		this.relationshipModel =  relationship;
	}
}
