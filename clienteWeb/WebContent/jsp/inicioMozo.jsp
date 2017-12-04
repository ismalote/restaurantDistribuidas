<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Llama A: asignarMesa = List<MesaDTO> mesasLibres(Integer numeroSector)  OJO, USA EL SECTOR DEL MOZO-->

<html>
	<head>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/jquery-form-validator/2.3.19/theme-default.min.css" type="text/css">
	  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
	  <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css">
	  <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
	  <link rel="stylesheet" href="css/style.css">
	  
	  <script src="js/jquery-1.11.0.min.js"></script>
	  <script src="js/jquery.dataTables.js"></script>
	</head>
  <body>
  <div class="py-5">
    <div class="container">
      <div class="row">
	      <div class="col-md-12"><ul class="nav nav-pills">
	            <li class="nav-item">
	              <a href="#mozo" class="active nav-link"> <i class="fa fa-male"></i>&nbsp;MOZO</a>
	            </li>
	            <li class="nav-item text-center">
	              <a class="nav-link" href="#mesas">Mesas</a>
	            </li>
	            <li class="nav-item">
	              <a href="<c:url value='/comandas?idMozo=${mozo.idMozo}'/>" class="nav-link">Comandas</a>
	            </li><li class="nav-item">
	              <a href="#">Cerrar Sesion</a>
	            </li>
	          </ul>
		</div>
	</div>
	<div class="row">
        <div class="col-md-12">
          	<div id="mozo" class="divs row" style="display: block;">
          		<ul>
					<li></li>
					<li>Nombre: ${mozo.nombre}&nbsp;${mozo.apellido}</li>
					<li>Antiguedad: ${mozo.antiguedad}&nbsp; a&ntilde;o/s</li>
				</ul>
          		asd
          		<span>&nbsp;</span>
          		<span>&nbsp;</span>
          	</div>
			<div id="mesas" class="divs row">
				alo mesas
			</div>
			<div id="comandas" class="divs col-md-12">
				<table id="comandasTable" class="display nowrap">
					<thead>
						<tr>
							<th>Mesa</th>
							<th>Cantidad de Comensales</th>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>
			</div>
			<div id="dialog" hidden="true">
			</div>
        </div>
      </div>
    </div>
  </div>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

	<script type="text/javascript">
	/*
		var table = $("#comandasTable").DataTable({
			ajax: {
				url: "<c:url value='/comandas?idMozo=${mozo.idMozo}'/>",
				dataSrc: ''
			},
		    columns: [
		              { data: "mesa.idMesa" },
		              { data: "cantidadComensales" },
		          	]
		});
		
		$('#comandasTable tbody').on('click', 'tr', function() {
			var data = table.row(this).data();
			if(data != undefined){
				mostrarMenu(data.codigo);
			}
		});
		
		function mostrarMenu(codigo){
			
		}
		
		$('a.nav-link').click(function (e){
		   e.preventDefault();
		   var div_id = $('a.nav-link').index($(this))
		   $('.divs').hide().eq(div_id).show();
		});
		
		$("#dialog").dialog({
			title: 'Agregar items',
			height: h,
			width: "auto",
			autoOpen: true,
			modal: true,
			buttons: {
				"Agregar": function() {
					$.ajax({
						url : '',
						success : function(data) {
						},
						error : function(data, status, er) {
							$('#dialog').dialog("option" , "title" , "Error inesperado!");
							$('#dialog').dialog({
								buttons: {
									Cerrar: function() {
										$(this).dialog('close');
									}
								}
							});
						}
					});
				},
				Cancelar: function() {
					$(this).dialog('close');
				}
			}
		});
		*/
	</script>

</body></html>