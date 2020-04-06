<?php

    define("VIEWS_PATH", "views/");

    $nav_survey = false;
    $nav_user_mgm = false;
    $nav_results = false;

    function loadViews() {
        $view = "survey";
        if(!empty($_GET['view'])) {
            $view = $_GET['view'];
        }
        $view = preg_replace("/[^a-z0-9_]/", "", $view);
        $view = VIEWS_PATH."view_".$view.".inc.php";
        if(!file_exists($view)) {
            $view = VIEWS_PATH."view_404.inc.php";
        }
        return $view;
    }

?>