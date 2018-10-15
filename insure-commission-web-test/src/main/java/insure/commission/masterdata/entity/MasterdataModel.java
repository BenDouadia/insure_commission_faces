package insure.commission.masterdata.entity;

import insure.commission.enums.MasterdataType;
import insure.commission.enums.MasterdataGender;;

public class MasterdataModel {

	String id;
	String name;
	String firstName;
	String title;
	String additionalNameOne;
	String additionalNameTwo;
	String commentOne;
	String commentTwo;
	String personalSalutation;
	String category;
	String language;
	String nationality;
	MasterdataType type;
	MasterdataGender gender;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getTitle() {
		return title;
	}

	public String getAdditionalNameOne() {
		return additionalNameOne;
	}

	public String getAdditionalNameTwo() {
		return additionalNameTwo;
	}

	public String getCommentOne() {
		return commentOne;
	}

	public String getCommentTwo() {
		return commentTwo;
	}

	public String getPersonalSalutation() {
		return personalSalutation;
	}

	public String getCategory() {
		return category;
	}

	public String getLanguage() {
		return language;
	}

	public String getNationality() {
		return nationality;
	}

	public MasterdataType getType() {
		return type;
	}

	public MasterdataGender getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAdditionalNameOne(String additionalNameOne) {
		this.additionalNameOne = additionalNameOne;
	}

	public void setAdditionalNameTwo(String additionalNameTwo) {
		this.additionalNameTwo = additionalNameTwo;
	}

	public void setCommentOne(String commentOne) {
		this.commentOne = commentOne;
	}

	public void setCommentTwo(String commentTwo) {
		this.commentTwo = commentTwo;
	}

	public void setPersonalSalutation(String personalSalutation) {
		this.personalSalutation = personalSalutation;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setType(MasterdataType type) {
		this.type = type;
	}

	public void setGender(MasterdataGender gender) {
		this.gender = gender;
	}
}
