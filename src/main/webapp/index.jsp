<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="br.com.escola.model.entidade.Aluno" %>
<%@page import="java.util.ArrayList" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página Inicial</title>
</head>
<body>
<%
    String nome = "";
    if (request.getAttribute("nomeBusca") != null){
        nome = (String) request.getAttribute("nomeBusca");
    }
        System.out.println(request.getAttribute("nomeBusca"));

%>
<a href="novo.jsp">Cadastrar Novo</a>
<form method="post"  action="BuscaAlunoServlet">
Nome: <input type="text" name="txtNomeBusca" value="<%= nome %>"/>
<input type="submit" value="buscar" id="btnOk">

</form>
<%
    if(request.getAttribute("alunos")!= null){
%>
<table>
    <thead>
        <tr>
        	<th>Id</th>
	        <th>Nome</th>
	        <th>Nota 1</th>
	        <th>Nota 2</th>
	        <th>Nota 3</th>
        </tr>        
    </thead>
    <tbody>
        <%
            ArrayList<Aluno> lista = (ArrayList<Aluno>) request.getAttribute("alunos");

                for (Aluno a: lista){
        %>
        <tr>
            <td><%= a.getId()%></td>
            <td><%= a.getNome() %></td>
            <td><%= a.getNota1() %></td>
            <td><%= a.getNota2() %></td>
            <td><%= a.getNota3() %></td>
        </tr>
        <% }%>
    </tbody>
</table>
<% }%>
</body>
</html>