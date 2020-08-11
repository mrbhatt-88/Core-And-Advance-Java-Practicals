package com;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "person_name") // this entity and table is ignored by hibernate,,,and follow super class rule.
@Data
public class PersonModel extends StudentModel {

	private int pNo;

	private String gender;

}
