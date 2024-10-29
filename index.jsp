<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calcular Média</title>
</head>
<body>
    <h1>Calcular Média</h1>
    <form action="calcularMedia" method="post">
        <label for="nota1">Nota 1:</label>
        <input type="text" id="nota1" name="nota1" required>
        <br>
        <label for="nota2">Nota 2:</label>
        <input type="text" id="nota2" name="nota2" required>
        <br>
        <button type="submit">Calcular Média</button>
    </form>
</body>
</html>
    