<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}



th, td {
  padding: 50px;
}
</style>
<meta charset="UTF-8">
<title>Gioco Impiccato</title>
<!-- JQuery -->
<script src="https://code.jquery.com/jquery-3.6.1.min.js" type="text/javascript"></script>
<!-- Boostrap -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
<script src="static/js/script.js"></script>
</head>
<body>
<div class="clearfix">
<div class="row">
<div class="col-md-3"></div>
<div class="col-md-6">
<input type="text" id="box1" value="l" size=2>
<input type="text" id="box2" value="i" size=2>
<input type="text" id="box3" value="m" size=2>
<input type="text" id="box4" value="o" size=2>
<input type="text" id="box5" value="n" size=2>
<input type="text" id="box6" value="e" size=2>
</div>
<div class="col-md-3"></div>

<div class="row">
<div class="col-md-3">
<input type="text"  size=2 id="inputScelta">
<button type="Button" id="bottoneScelta">Scelta</button>
</div>
<div class="col-md-9"></div>
</div>


<div class="row">
<div class="col-md-3"></div>
<div class="col-md-6">
<table border=2px>
<tr>
    <th id="d1" bgcolor="#FF0101"></th>
    <th id="d2" bgcolor="#000000"></th>
    <th id="d3" bgcolor="#FF0101"></th>
  </tr>
  <tr>
     <th id="d4" bgcolor="#000000"></th>
     <th id="d5" bgcolor="#000000"></th>
     <th id="d6" bgcolor="#000000"></th>
  </tr>
  <tr>
     <th id="d7" bgcolor="#000000"></th>
     <th id="d8" bgcolor="#000000"></th>
     <th id="d9" bgcolor="#000000"></th>
  </tr>
</table>





</table>


</div>



<div class="col-md-3"></div>
</div>



<div class="row">
<div class="col-md-6">
</div>
<h3 id="win" Hai vinto!! </h3> <i class="fa-solid fa-thumbs-up" style="font-size:48px"></i>
<h3 id="loser" Hai perso</h3>
<i class="fa-solid fa-face-nauseated"></i>
<div class="col-md-6"></div>
</div>

</div>

</div>







</body>
</html>