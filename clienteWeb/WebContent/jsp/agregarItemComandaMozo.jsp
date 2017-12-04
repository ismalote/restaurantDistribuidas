<!-- Llama a método: public List<PlatoMenuDTO> platosDelMenu() -->
<!-- Llama a método: public AgregarItemsComandaDTO agregarItemsAComanda(AgregarItemsComandaDTO itemsComanda) -->


<html><head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css">
  
	<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
	
	<script src="js/jquery-1.11.0.min.js"></script>
	<script src="js/jquery.dataTables.js"></script>
  
  
  </head><body>
  <div class="py-5" style="">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <table id="items" class="table" style="">
            <thead>
              <tr>
                <th>ID</th>
                <th>Nombre</th>
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
  			<div class="col-md-6">
  				<a class="btn btn-primary" href="">Agregar</a>
  			</div>
  		</div>
  	</div>
  </div>
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

    <script type="text/javascript">
		var table = $("#items").DataTable({
			ajax: {
				url: "<c:url value='/producto?action=listar'/>",
				dataSrc: ''
			},
		    columns: [
		              { data: "idProd" },
		              { data: "nombreProd" }
		          	]
		});
	</script>
      
</body></html>