<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cita Dentista</title>
</head>
<body>

 <h1>Cita Dentista</h1>
    <br>
    <form action="citaDentista" method="post">
        <div>
            <label for="dia">Dia de la cita: </label>
            <input type="date" name="dia" id="dia">
        </div>
        <div>
            <label for="hora">Hora de la cita: </label>
            <input type="time" name="hora" id="hora">
        </div>
        <div>
            <label for="nombre">Nombre: </label>
            <input type="text" name="nombre" id="nombre">
        </div>
        <div>
            <label for="apellidos">Apellidos: </label>
            <input type="text" name="apellidos" id="apellidos">
        </div>
        <div>
            <label for="centro">Centro: </label>
            <select name="centro" id="centro">
                <option value="1">Centro dental Colon</option>
                <option value="2">Centro protesis dental Guerrita</option>
                <option value="3">Centro estomatologia Fidiana</option>
                <option value="4">Centro implantologia Sector Sur</option>
            </select>
        </div>
        <div>
            <label for="tipo">Tipo: </label>
            <input type="radio" name="tipo" id="nuevaCita" value="Nueva Cita">
            <label for="nuevaCita">Nueva Cita</label>
            <input type="radio" name="tipo" id="revision" value="Revision">
            <label for="revision">Revision</label>
        </div>
        <div>
            <button type="submit">Comfirmar</button>
        </div>
    </form>

</body>
</html>