<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>


<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
 
  <table class="table table-dark table-striped">
    <thead>
      <tr>
        <th>Title</th>
        <th>Body</th>
        <th>Comments</th>
         <th>Rating</th>
        <th>Gender</th>
        <th>Likes</th>
         <th>Edit</th>
        <th>Delete</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="l" items="${list}">
      <tr>
        <td>${l.title}</td>
        <td>${l.body}</td>
        <td>${l.comments}</td>
         <td>${l.rating}</td>
        <td>${l.gender}</td>
        <td>${l.likes}</td>
         <td><button class="btn btn-sm btn-dark"><a href="/JdbcTemplate/edit/${l.id}">Edit</a></button></td>
         <td><button class="btn btn-sm btn-dark"><a href="/JdbcTemplate/delete/${l.id}">Delete</a></button></td>
      </tr>
     </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>
