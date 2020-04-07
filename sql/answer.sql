DROP TABLE IF EXISTS survey_site.answer;

CREATE TABLE IF NOT EXISTS survey_site.answer (
	id					VARCHAR(50),
	matricule_number	VARCHAR(7),
	value				VARCHAR(200) NOT NULL,
	PRIMARY KEY (id, matricule_number),
	CONSTRAINT delete_update_question
		FOREIGN KEY (id)
			REFERENCES question(id)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
	CONSTRAINT delete_update_survey_user
		FOREIGN KEY (matricule_number)
			REFERENCES survey_user(matricule_number)
				ON UPDATE CASCADE
				ON DELETE CASCADE
);