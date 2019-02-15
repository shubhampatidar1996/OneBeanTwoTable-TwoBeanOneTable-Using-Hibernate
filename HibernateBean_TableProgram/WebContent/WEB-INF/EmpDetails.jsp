<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Emp Details Page</title>
</head>
<body>
 <center>
<h1 ><font color="red">Welcome At Emp Details Page</font></h1>
 </center>
   

	<div class="container">
	<div class="col-sm-3">
    <form action="insertEmpDetails" method="post" >
     <h2>${msg}</h2>
    <div class="form-group">
    <label for="ename">Emp Name:</label>
     <input type="text" class="form-control" name="ename" id="Ename">
   </div> 
  
  <div class="form-group">
    <label for="salary">Salary:</label>
    <input type="text" class="form-control" name="salary" id="Salary">
  </div>
 
  
   <div class="form-group">
    <label for="city">City:</label>
  <!-- - For one bean two tables<input type="text" class="form-control" id="City" name="city" /> -->
   
    <!-- - For two bean onetable --><input type="text" class="form-control" id="City" name="address.city" />
  </div>
  
   
   <div class="form-group">
   
    <label for="state">State:</label>
   <!-- - For one bean two tables  <input type="text" class="form-control" id="City" name="state" /> -->
 
    
   <!-- - For two bean onetable --> <input type="text" class="form-control" id="State" name="address.state" />
   </div>
  
  
 <div class="form-group">
    <label for="country">Country:</label>
      <!-- - For one bean two tables<input type="text" class="form-control" id="City" name="country" />-->
    
   <!-- - For two bean onetable --> <input type="text" class="form-control" id="Country" name="address.country" />
  </div>
  
 
     <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</div>
	

</body>
</html>