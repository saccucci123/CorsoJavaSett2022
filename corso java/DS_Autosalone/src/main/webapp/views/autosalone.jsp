<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
#intestazione, #lista{
    background-color: #959595;
    border-style: solid;
}
h1{
    text-align: center;
    color: white;
}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.2.min.js"></script>
<link rel="stylesheet" href="static/css/style.css">
<title>Gestione Salone</title>
</head>
<body>
<div class="clearfix" id="intestazione">
<div class="row" >
<div class="col-mid-4"></div>
<div class="col-mid-4" >
<h1> Gestione Autosalone</h1>
</div>
<div class="col-mid-4"></div>
</div>
</div>
<div class="clearfix">
<div class="row" >
<div class="col-mid-5"></div>
<div class="col-mid-5"></div>
<div class="col-sm-2" id="lista">
<ul>
<li><a href="views/ListaAutomobili.jsp">Lista Automobili</a></li>
<li><a href="views/AggiungiAutomobile.jsp">Aggiungi Automobile</a></li>
<li><a href="views/RimuoviAutomobile.jsp">Rimuovi Automobile</a></li>
<li><a href="views/Cerca.jsp">Cerca</a></li>
<li><a href="views/visualizzaDettagli.jsp">Visualizza dettaglio automobile</a></li>
</ul>
</div>
</div>
</div>
<div class="container text-center">
<div class="row">
<div class="col-sm-2"></div>
<div class="col-mid-8">
<h2>Home</h2>
</div>
<div class="col-sm-2"></div>
</div>
</div>
</body>
</html>