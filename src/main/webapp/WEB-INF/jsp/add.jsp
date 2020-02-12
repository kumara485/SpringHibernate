
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
  <form  action="/JdbcTemplate/addblog" method="post">
    <div class="form-group">
      <label for="title">Title:</label>
      <input type="text" class="form-control" id="email" placeholder="Enter title" name="title">
    </div>
    <div class="form-group">
      <label for="body">Body:</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter body" name="body">
    </div>
     <div class="form-group">
      <label for="comments">Comments:</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter comments" name="comments">
    </div>
   
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>
</html>
