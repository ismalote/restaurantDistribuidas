<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- ESTA PANTALLA SE VA A LLAMAR DESDE TODAS LAS AREAS, PORQUE ES LA MISMA -->

<!DOCTYPE html>
<html>


<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css"> 
  <link rel="stylesheet" type="text/css"
	href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
  <script src="js/jquery-1.11.0.min.js"></script>
  <script src="js/jquery.dataTables.js"></script>
  <h1>${titulo}</h1>
  
   </head>

<body>
  <div class="py-5">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <table id="pedidosSector" class="table">
            <thead>
              <tr>
                <th class="text-center">Producto</th>
              </tr>
            </thead>
            <tbody>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </div>
  <div class="py-5">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
    
        </div>
      </div>
    </div>
  </div>
  

	<script type="text/javascript">
		var table = $("#pedidosSector").DataTable({
			ajax: {
				url: "<c:url value='/pedidos?area=${area}'/>",
				dataSrc: ''
			},
		    columns: [
		    			  { data: "nombrePlato" }
		          	]
		});
		
		$('#pedidosSector tbody').on('click', 'tr', function() {
			var data = table.row(this).data();
			if(data != undefined){
				terminarPedido(data);
			}
		});
		function terminarPedido(data){
			var datos = {
					
					"idPedido": data.idItemComanda
						
				}
				
				var url = "<c:url value='/pedidos?'/>";
				$.ajax({
					method: 'post',
					url : url,
					data: datos
				});
			window.location.href = "<c:url value='/areaproduccion?action=${area}'/>";
			
		}
	</script>
</body>

</html>