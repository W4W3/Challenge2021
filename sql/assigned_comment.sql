DROP TABLE IF EXISTS survey_site.assigned_comment;

CREATE TABLE IF NOT EXISTS survey_site.assigned_comment (
    title_short             VARCHAR(50),
    matricule_number        VARCHAR(7),
    comment                 VARCHAR(200) NOT NULL,
    PRIMARY KEY (title_short, matricule_number),
    CONSTRAINT delete_update_survey
        FOREIGN KEY (title_short)
            REFERENCES survey(title_short)
                ON UPDATE CASCADE
                ON DELETE CASCADE,
    CONSTRAINT delete_update_survey_user
        FOREIGN KEY (matricule_number)
            REFERENCES survey_user(matricule_number)
                ON UPDATE CASCADE
                ON DELETE CASCADE
);