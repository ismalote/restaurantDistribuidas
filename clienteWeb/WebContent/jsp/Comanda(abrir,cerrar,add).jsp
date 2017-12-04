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

</head>
<body>
	<div class="py-5">
		<div class="container">
			<div class="row">
				<table id="comandasTable" class="display nowrap">
					<thead>
						<tr>
							<th>Id</th>
							<th>Mesa</th>
							<th>Cantidad de Comensales</th>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>
			</div>
			<div class="row">
				<div class="col-md-12">
					<form class="" method="post"
						action="<c:url value='/comandas?idMozo=${idMozo}'/>">
						<div class="form-group">
							<label>Crear Comanda</label>
						</div>
						<div class="form-group">
							<input type="text" name="num_mesa" class="form-control"
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
	<div class="py-5">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<form class="" method="get" action="<c:url value='/plato'/>">
						<div class="form-group">
							<label>Agregar Items a Comanda</label> 
							<input type="text" name="num_comanda" class="form-control" placeholder="Numero de Comanda">
							<input type="hidden" name="idMozo" value="${idMozo}">
						</div>
						<button type="submit" class="btn btn-primary">Aceptar</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="py-5">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<form class="" method="post" action="https://formspree.io/">
						<div class="form-group">
							<label>Cerrar Comanda</label> <input type="text"
								name="Numero de comanda" class="form-control"
								placeholder="Numero de comanda">
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
		          	]
		});
	</script>
</body>
</html>