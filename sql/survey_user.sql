CREATE SCHEMA IF NOT EXISTS survey_site DEFAULT CHARACTER SET utf8 ;
USE survey_site;
DROP TABLE IF EXISTS survey_site.survey_user;

CREATE TABLE IF NOT EXISTS survey_site.survey_user (
    matricule_number      VARCHAR(7) PRIMARY KEY,
    username              VARCHAR(100) NOT NULL,
    course_short          VARCHAR(6),
    CONSTRAINT delete_update_course
        FOREIGN KEY (course_short)
            REFERENCES survey_user_group(course_short)
                ON UPDATE CASCADE
                ON DELETE CASCADE
);