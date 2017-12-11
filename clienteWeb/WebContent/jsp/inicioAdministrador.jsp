<%@page import="org.repositorio.bussinessDelegate.BussinessDelegate"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="true" import="java.util.*" %>
<!-- Llama A: reserva.html = reservarMesa(ReservaDTO dto) -->
<!-- Llama A: verPedidosStock.html = listarComprasPedidas() -->
<!-- Llama A: abrir Caja.html = abrirCaja( Integer idLocal, Float monto) -->
<!-- Llama A: cerrar caja.html = cerrarCaja( Integer idLocal, Float monto) -->
<!-- FALTAN VER LOS STOCKS-->

<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css">
  
  <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
  <link rel="stylesheet" href="css/style.css">
  
  <script src="js/jquery-1.11.0.min.js"></script>
  <script src="js/jquery.dataTables.js"></script>
  </head>

<body>
<%
	String action = request.getParameter("action");
	if(action != null && "abrirCaja".equals(action)) {
		Float montoAbrir = Float.valueOf(request.getParameter("monto"));
		BussinessDelegate.getInstancia().abrirCaja(montoAbrir);
	} else if(action != null && "cerrarCaja".equals(action)){
		Float montoCierre = Float.valueOf(request.getParameter("montoCierre"));
		BussinessDelegate.getInstancia().cerrarCaja(null, montoCierre);
		
	}
%>

  <div class="py-5">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <ul class="nav nav-tabs">
            <li class="nav-item">
              <a class="active nav-link" href="#"><i class="fa fa-home fa-home"></i>ADMINISTRADOR</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Caja</a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                <a class="dropdown-item" href="/clienteWeb/jsp/abrir caja.jsp">Abrir Caja</a>
                <a class="dropdown-item" href="/clienteWeb/jsp/cerrar caja.jsp">Cerrar Caja</a>
              </div>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Ver Pedidos de Compra</a>
            </li>
             <li class="nav-item">
              <a href="<c:url value='/nuevoplato?action=abm'/>" class="nav-link">Crear Nuevo Plato</a>
            </li>
            </li><li class="nav-item">
              <a href="<c:url value='/cerrar'/>" class="nav-link">Cerrar Sesion</a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</body>

</html>