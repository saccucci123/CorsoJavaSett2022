<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Template</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="static/js/plugins/fontawesome-free/css/all.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="static/css/adminlte.min.css">>
</head>
<body class="hold-transition sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">
  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="/" class="nav-link">Home</a>
      </li>
    </ul>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
    
    </ul>
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a  class="brand-link">
      <span class="brand-text font-weight-light">neotech</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user (optional) -->

      <!-- SidebarSearch Form -->

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-tachometer-alt"></i>
              <p>
                GetDatas
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="list" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>getList</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="count" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>getCount</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item">
            <a href="insertData" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>
                Insert data
                <span class="right badge badge-danger">New</span>
              </p>
            </a>
          </li>
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Blank Page</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Blank Page</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">

      <!-- Default box -->
      <div class="card">
        <div class="card-header">
          <h3 class="card-title">Title</h3>

          <div class="card-tools">
            <button type="button" class="btn btn-tool" data-card-widget="collapse" title="Collapse">
              <i class="fas fa-minus"></i>
            </button>
            <button type="button" class="btn btn-tool" data-card-widget="remove" title="Remove">
              <i class="fas fa-times"></i>
            </button>
          </div>
        </div>
        <div class="card-body">
        <div id="messaggio" class="toast-body" style="display:none">
         Lettura avvenuta correttamente!
      </div>
        
        <button type="button" class="btn btn-success" id="btnRecount" name="btnRecount">reCount</button>
        </div>
        <div class="row">
        <div class="col-lg-3 col-6">
			<div class="small-box bg-warning">
				<div class="inner">
					<h3 id="countValue" name="countValue">0</h3>
					<p>Elements</p>
				</div>
			<div class="icon">
				<i class="fas fa-user-plus"></i>
			</div>
			</div>
		</div>
        
    <div class="card-body">
        <button type="button" class="btn btn-info" id="btnCallApi" name="btnCallApi">chiamata al MS</button>
        </div>
    <input type="text" id="response" disabled/>
    <div>
    
    </div>     
        </div>
        <!-- /.card-body -->
        <div class="card-footer">
          Footer
        </div>
        <!-- /.card-footer-->
      </div>
      <!-- /.card -->

    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <footer class="main-footer">
    <div class="float-right d-none d-sm-block"><a href="www.neotech.srl">www.neotech.srl</a></div>
    <strong>template</strong>
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="static/js/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="static/js/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="static/js/adminlte.min.js"></script>
<!-- Demo Template -->
<script src="static/js/fireAjax.js"></script>
<script src="static/js/demoTemplate.js"></script>
<script>
$("#btnCallApi").click(function(){
	var result;
	
	result=fire_ajax_get("http://localhost:8080/MSTemplate-01/getElemento/1");
	$("#response").val(JSON.stringify(result));
	if(result.code=="OK")  $("#messaggio").show();
	

	var request={
			"descrizione": "test",
			"id": 37
			};
	
	

	result=fire_ajax_post("http://localhost:8080/MSTemplate-01/addElemento",request);
	$("#response").val(JSON.stringify(result));
	if(result.code=="OK") $("#messaggio").show();
	
	
	
	result=fire_ajax_get("http://localhost:8080/MSTemplate-01/getListaElementi");
	console.log(result.code);
	result.elementi.forEach(function(elemento) {
	    console.log(elemento.id+".."+elemento.descrizione);
	});
	
	
});



</script>
</body>
</html>
