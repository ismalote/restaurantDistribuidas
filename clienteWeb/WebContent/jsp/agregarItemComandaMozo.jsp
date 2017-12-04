<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Llama a método: public List<PlatoMenuDTO> platosDelMenu() -->
<!-- Llama a método: public AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO itemsComanda) -->


<html><head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css">
  
	<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
	<link rel="stylesheet" href="css/style.css">
	
	<script src="js/jquery-1.11.0.min.js"></script>
	<script src="js/jquery.dataTables.js"></script>
  
  <h1>Agregar Item a Comanda</h1>
  </head><body>
  <div class="py-5" style="">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <table id="items" class="table">
            <thead>
              <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Precio</th>
              </tr>
            </thead>
            <tbody>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </div>
  <!-- 
  <div class="py-5">
  	<div class="container">
  		<div class="row">
  			<div class="col-md-6">
  				<a class="btn btn-primary" href="">Agregar</a>
  			</div>
  		</div>
  	</div>
  </div>

   -->
    <script type="text/javascript">
		var table = $("#items").DataTable({
			ajax: {
				url: "<c:url value='/plato?action=listar&idMozo=${idMozo}'/>",
				dataSrc: ''
			},
		    columns: [
		              { data: "idPlato" },
		              { data: "nombrePlato" },
		              { data: "precio" }
		          	]
		});
		
		$('#items tbody').on('click', 'tr', function() {
			var data = table.row(this).data();
			if(data != undefined){
				agregarItem(data);
			}
		});
		
		function agregarItem(plato) {
			debugger;
			var datos = {
				"idComanda": ${idComanda},
				"idMozo": ${idMozo},
				"idPlato": plato.idPlato	
			}
			
			$('html').load("<c:url value='/plato'/>", datos);
		}
	</script>
      
</body></html>