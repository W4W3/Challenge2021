<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=2, user-scalable=no"/>
    <meta name="description" content="Semantic-UI-Forest, collection of design, themes and templates for Semantic-UI."/>
    <meta name="keywords" content="Semantic-UI, Theme, Design, Template" />
    <meta name="author" content="PPType" />
    <meta name="theme-color" content="#ffffff" />
    <title>DHBW - Survey Site</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css" type="text/css"/>
    <link rel="stylesheet" href="css/base.css" type="text/css"/>
  </head>

  <body id="root">
    <div class="ui tablet computer only padded grid">
      <div class="ui borderless fluid huge inverted menu">
        <div class="ui container">
          <a class="header item" href="#root">DHBW - Survey Site</a>
          <a class="active item" href="#root">Surveys</a>
          <a class="item" href="#root">Results</a>
          <a class="item" href="#root">Survey User Management</a>
        </div>
      </div>
    </div>
    <div class="ui mobile only padded grid">
      <div class="ui borderless fluid huge inverted menu">
        <a class="header item" href="#root">DHBW - Survey Site</a>
        <div class="right menu">
          <div class="item">
            <button class="ui icon toggle basic inverted button">
              <i class="content icon"></i>
            </button>
          </div>
        </div>
        <div class="ui vertical borderless fluid inverted menu">
          <a class="active item" href="#root">Surveys</a>
          <a class="item" href="#root">Results</a>
          <a class="item" href="#root">Survey User Management</a>
        </div>
      </div>
    </div>
    <div class="ui center aligned text container">
      <h1 class="ui huge header">Semantic-UI starter template</h1>
      <p class="lead">
        Use this document as a way to quickly start any new project.
      </p>
      <p class="lead">
        All you get is this text and a mostly barebones HTML document.
      </p>
    </div>


    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script>
      $(document).ready(function() {
        $(".ui.toggle.button").click(function() {
          $(".mobile.only.grid .ui.vertical.menu").toggle(100);
        });
      });
    </script>
  </body>
</html>
