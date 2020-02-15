<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<c:set var="data" value="${list}" scope="session"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Edit Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <form  action="/JdbcTemplate/editblog" method="post">
    <div class="form-group">
      <label for="title">Title:</label>
      <input type="text" class="form-control" id="email" placeholder="Enter title" name="title" value="${data.title }">
    </div>
    <div class="form-group">
      <label for="body">Body:</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter body" name="body" value="${data.body }">
    </div>
     <div class="form-group">
      <label for="comments">Comments:</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter comments" name="comments" value="${data.comments }">
    </div>
     <div class="form-group">
      <label for="comments">Rating:</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter comments" name="comments" value="${data.rating }">
    </div>
     <div class="form-group">
      <label for="comments">Gender:</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter comments" name="comments" value="${data.gender }">
    </div>
     <div class="form-group">
      <label for="comments">Likes:</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter comments" name="comments" value="${data.likes }">
    </div>
   
    <button type="submit" class="btn btn-primary">EDIT</button>
  </form>
</div>

</body>
</html>
