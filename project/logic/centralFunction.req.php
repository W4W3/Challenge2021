<?php

    function isUserAssigned($matricule_number, $title_short) {
        $query = getDbConnection()->prepare(
            "SELECT * FROM survey_site.survey_user u, survey_site.survey_user_group g, survey_site.assigned a
            WHERE u.course_short = g.course_short
            AND g.course_short = a.course_short
            AND a.title_short = ?
            AND u.matricule_number = ?;"
        );
        $query->bind_param('ss', $title_short, $matricule_number);
        $query->execute();
        $rows = mysqli_num_rows($query->get_result());
        if($rows > 0) {
            return true;
        }
        return false;
    }

    function insertSurveyComment($matricule_number, $title_short, $comment) {
        $query = getDbConnection()->prepare(
            "INSERT INTO survey_site.assigned_comment (title_short, matricule_number, comment) 
            VALUES (?, ?, ?);"
        );
        $query->bind_param('sss', $title_short, $matricule_number, $comment);
        $query->execute();
    }

?>