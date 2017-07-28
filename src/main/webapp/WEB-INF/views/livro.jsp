<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	cadastro de livros

	<form action="cad_autor" method="post">

		Nome: <input type="text" name="nome" /><br /> CPF: <input
			type="text" name="cpf" /><br />
		<button type="submit">Cadastrar</button>
		<table border="1">

			<c:forEach var="autor" items="${list}" >
				<tr>
					<td>${autor.nome}</td>
					<td>${autor.cpf}</td>
				</tr>
			</c:forEach>
		</table>

	</form>


</body>
</html>