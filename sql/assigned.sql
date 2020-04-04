CREATE SCHEMA IF NOT EXISTS survey_schema DEFAULT CHARACTER SET utf8;
USE survey_schema;
DROP TABLE IF EXISTS survey_schema.assigned;

CREATE TABLE survey_schema.assigned(
    title_short     VARCHAR(3),
    course_short    VARCHAR(8),
    FOREIGN KEY (title_short) REFERENCES survey(title_short),
    FOREIGN KEY (course_short) REFERENCES survey_user_group(course_short), 
)

/*  2 Schemata --> user, survey
    für survey_user FOREIGN KEY:  course_short    VARCHAR(8)
    von survey title_short VARCHAR(?) für assigned FOREIGN KEY
    FOREIGN KEY: ON DELETE ON UPDATE --> no action oder cascade --> bei cascade anpassen der FOREIGN KEYs */
