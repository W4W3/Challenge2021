CREATE SCHEMA IF NOT EXISTS survey_schema DEFAULT CHARACTER SET utf8;
USE survey_schema;
DROP TABLE IF EXISTS survey_schema.survey_user_group;

CREATE TABLE survey_schema.survey_user_group(
    course_short    VARCHAR(8)  PRIMARY KEY,
    course          VARCHAR(50) NOT NULL,   
)
