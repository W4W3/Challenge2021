<?php

    $link = false;
    define("MYSQL_HOST", "127.0.0.1");
    define("MYSQL_USER", "root");
    define("MYSQL_PW", "");
    define("MYSQL_DB", "survey");

    function getDbConnection(){
        global $link;
        if( $link ) {
            return $link;
        }
        $link = mysqli_connect(MYSQL_HOST, MYSQL_USER, MYSQL_PW, MYSQL_DB) or die('Could not connect to server.' );
        return $link;
    }

    function cleanUpDb(){
        global $link;
        if( $link != false ) {
            mysqli_close($link);
        }
        $link = false;
    }

    function escapeSql($text){
        $text = mysqli_real_escape_string(getConnection(), $text);
        return "'".$text."'";
    }

?>
