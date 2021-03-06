<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="https://v40.pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css"> </head>

<body>
  <div class="py-5">
    <div class="container">
      <div class="row">
        <div class="col-md-12"> </div>
      </div>
    </div>
  </div>
  <div class="py-5">
    <div class="container">
      <div class="row">
        <div class="col-md-12"> </div>
      </div>
      <div class="row">
        <div class="col-md-12">
          <form class="" method="post" action="<c:url value='/nuevoplato?action=crear'/>">
            <div class="form-group"> <label>CREAR PLATO</label>
              <input type="text" name="NombrePlato" class="form-control" placeholder="Nombre Plato"> </div>
            <div class="form-group">
              <input type="number" name="Precio" class="form-control" placeholder="Precio"> </div>
            <div class="form-group"> <label>INGREDIENTES :</label>
              <div>
                
              </div>
            <input type="number" name="p"/>,<input type="number" name="p"/>,<input type="number" name="p"/>,<input type="number" name="p"/>,<input type="number" name="p"/>
            <div class="form-group">
              <input type="number" name="comision" class="form-control" placeholder="Comision"> </div>
            <div class="form-group">
              <input type="number" name="area" class="form-control" placeholder="Area"> </div>
            <div class="form-group">
              <input type="textarea" name="receta" class="form-control" placeholder="Receta"> </div>
            <button type="submit" class="btn btn-primary">Crear Plato</button>
          </form>
        </div>
      </div>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</body>

</html>