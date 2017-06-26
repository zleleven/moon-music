<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=no">
    <title>${music.title}</title>
    <link rel='stylesheet' href="/music/css/index.css" />
  </head>
  <body>
  <div class="right" id="box">
  	<header>
  		<h1>${music.title}</h1>
  		<ul class="type" id="type">
  			<li data-type="dot">Dot</li>
  			<li data-type="column" class="select">Column</li>
  		</ul>
  		<p>
  			Volume <input id="volume" type="range" min="0" max="100" value="60">
  		</p>
  	</header><!-- /header -->
    
    <div class="left">
    	<ul id="list">
    		<c:forEach var="name" items="${music.list }">
    			<li title="${name }">${name }</li>
    		</c:forEach>
    	</ul>
    </div>

    
    	
    </div>
	 <script src="/music/javascripts/MusicVisualizer.js" type="text/javascript" charset="utf-8"></script>
    <script src="/music/javascripts/index.js" type="text/javascript" charset="utf-8"></script>
  </body>
</html>
