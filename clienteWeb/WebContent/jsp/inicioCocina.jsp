<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Llama A: verPedidosParaRealizar.html = public List<ItemComandaDTO> obtenerPlatosAProducir(Integer idArea,Integer idLocal ) -->
<!-- Llama A: listarProductosASolicitar.html = public List<ProductosAPedirDTO> listarProductosParaPedir() -->

<html><head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css"type="text/css"> </head><body>
  <div class="py-5">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <ul class="nav nav-pills">
            <li class="nav-item">
              <a href="#" class="active nav-link"> <i class="fa fa-apple"></i>&nbsp;COCINA</a>
            </li>
            <li class="nav-item text-center">

						<div class="form-group">
              				<a class="nav-link" href="<c:url value='/areaproduccion?action=cocina'/>">Ver Pedidos</a>
						</div>
						
            </li>
            <li class="nav-item">
              <a href="#" class="nav-link">Solicitar productos</a>
            </li>
            <li class="nav-item">
              <a href="<c:url value='/cerrar'/>" class="nav-link">Cerrar Sesion</a>
            </li>
          </ul>
        </div>
      </div>
      <div class="row">
        <div class="col-md-12"> </div>
      </div>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>


</body></html>