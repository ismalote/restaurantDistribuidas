<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Llama a método: public boolean crearNuevacomanda(CrearComandaDTO comanda) -->
<!-- Llama a pantalla: agregarItemComandaMozo.html -->
<!-- Llama a método: public boolean cerrarComanda(int idComanda) -->

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
	type="text/css">
<link rel="stylesheet"
	href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css"
	type="text/css">

<link rel="stylesheet" type="text/css"
	href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">


<script src="js/jquery-1.11.0.min.js"></script>
<script src="js/jquery.dataTables.js"></script>
<h1>Mesas</h1>
</head>
<body>
	<div class="py-5">
		<div class="container">
			<div class="row">
				<h2>Ocupadas</h2>
			</div>
			<div class="row">
				<table id="comandasTable" class="display nowrap">
					<thead>
						<tr>
							<th>Id</th>
							<th>Mesa</th>
							<th>Cantidad de Comensales</th>
							<th>Agregar</th>
							<th>Cerrar</th>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>
			</div>
			<div class="row">
				<h3>Disponibles</h3>
			</div>
			<div class="row">
				<div class="col-md-4">
					<select id="mesas" name="mesas">
						<c:forEach items="${mesas}" var="mesaActual">
						    <option value="${mesaActual.idMesa}">${mesaActual.numeroMesa}</option>
						</c:forEach>
					</select>
				</div>
				<div class="col-md-4">
					<input id="addMesa" type="button" value="Agregar Mesa"/>
				</div>
			</div>
			<div class="row">
				<h2>Crear Mesa</h2>
			</div>
			<div class="row">
				<div class="col-md-12">
					<form class="" method="post" action="<c:url value='/comandas?idMozo=${idMozo}'/>">
						<div class="form-group">
							<label>Crear Comanda</label>
						</div>
						<div class="form-group">
							<input id="num_mesa" type="text" name="num_mesa" class="form-control"
								placeholder="Numero de Mesa">
						</div>
						<div class="form-group">
							<input type="text" name="cant_comensales" class="form-control"
								placeholder="Cantidad de comensales">
						</div>
						<button type="submit" class="btn btn-primary">Aceptar</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
		var table = $("#comandasTable").DataTable({
			ajax: {
				url: "<c:url value='/comandas?action=listar&idMozo=${idMozo}'/>",
				dataSrc: ''
			},
		    columns: [
		    			  { data: "idComanda" },
		              { data: "mesa.idMesa" },
		              { data: "cantidadComensales" },
		              {
		                  "targets": -1,
		                  "data": null,
		                  "defaultContent": "<button id='add' onclick='addPlato(this)'>Agregar Plato</button>"
		              },
		              {
		                  "targets": -1,
		                  "data": null,
		                  "defaultContent": "<button id='close' onclick='closePlato(this)'>Cerrar</button>"
		              }
		          	]
		});
		$("#addMesa").click(function () {
			text = $("#num_mesa");
			if(text.val()){
			    text.val(text.val() + ";" + $("#mesas option:selected").text());
			} else {
				text.val($("#mesas option:selected").text());
			}
		});
		
		function addPlato(row){
			debugger;
			var data = table.row(row.parentNode.parentNode).data();
			
	        window.location.href = "<c:url value='/plato?idMozo=${idMozo}&num_comanda=" + data.idComanda + "'/>";
		}
		
		function closePlato(row){
			debugger;
			var data = table.row(row.parentNode.parentNode).data();
			window.location.href = "<c:url value='/comandas?idMozo=${idMozo}&action=cerrar&idComanda=" + data.idComanda + "'/>";
		}
		
		if("${error}") {
			alert("${error}");
		}
		
		
		// Crear una ul con las mesas disponibles.
		// Capturar el click de crear comanda y mandar un ajax abriendo la mesa, 
		// si la abre, submitear el form, sino mandar error de mesa.
		// Agregar botones dinamicos a la tabla para agregar items y cerrar comanda
	</script>
</body>
</html>