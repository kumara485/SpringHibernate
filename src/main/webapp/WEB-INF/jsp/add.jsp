<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Add Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
   <form:form  action="/JdbcTemplate/addblog" method="post" modelAttribute="blog">
    <div class="form-group">
      <label for="title">Title:</label>
   
     <form:input path="title"/>
     <form:errors path="title"/>
    </div>
    <div class="form-group">
      <label for="body">Body:</label>
   
    <form:input path="body"/>
     <form:errors path="body"/>
    </div>
     <div class="form-group">
      <label for="comments">Comments:</label>
   
    <form:input path="comments"/>
     <form:errors path="comments"/>
    </div>
      <div class="form-group">
      <label for="comments">Like:</label>
   
    Yes: <form:checkbox path="likes" value="yes"/>
    No: <form:checkbox path="likes" value="no"/>
    Ok: <form:checkbox path="likes" value="ok"/>
     <form:errors path="likes"/>
    </div>
      <div class="form-group">
      <label for="comments">Gender:</label>
   
   Male:  <form:radiobutton path="gender" value="male"></form:radiobutton>
   Female:  <form:radiobutton path="gender" value="female"></form:radiobutton>
     <form:errors path="gender"/>
    </div>
    
     <div class="form-group">
      <label for="comments">Rating:</label>
   
      <form:select path="rating">
      <form:option value="one">1</form:option>
      <form:option value="one">2</form:option>
      <form:option value="one">3</form:option>
      <form:option value="one">4</form:option>
      <form:option value="one">5</form:option>
      </form:select>
     <form:errors path="rating"/>
    </div>
   
    <button type="submit" class="btn btn-primary">Submit</button>
  </form:form>
  
 
</div>

</body>
</html>
