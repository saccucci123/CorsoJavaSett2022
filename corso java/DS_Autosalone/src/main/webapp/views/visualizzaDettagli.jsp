<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

 

<style>
@charset "UTF-8";

 

#intestazione, #lista{
    background-color: #959595;
    border-style: solid;
}

 

h1{
    text-align: center;
    color: white;
}

 

#list1{
font-weight: bold;
}
</style>

 

<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.2.min.js"></script>
<link rel="stylesheet" href="css/style.css">
<title>Visualizza dettagli</title>
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
<li><a href="ListaAutomobili.jsp">Lista Automobili</a></li>
<li><a href="AggiungiAutomobile.jsp">Aggiungi Automobile</a></li>
<li><a href="RimuoviAutomobile.jsp">Rimuovi Automobile</a></li>
<li><a href="Cerca.jsp">Cerca</a></li>
<li id="list1">Visualizza dettaglio automobile</li>
</ul>
</div>
</div>
</div>
<div class="container text-center">
<div class="row">
<div class="col-sm-2"></div>
<div class="col-mid-8">
<h2>Visualizza dettagli</h2>
</div>
<div class="col-sm-2"></div>
</div>
</div>
</body>
</html>