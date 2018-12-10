<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>form</title>
</head>
<body>
Just information here
<form method="get" action="login">


<table>
    <tr>
        <td>
           email: 
            
        </td>
           <td>
          <input type="text" name="email" />
            
        </td>
    </tr>
        <tr>
        <td>
           pass: 
            
        </td>
           <td>
         <input type="text" name="password" />
            
        </td>
    </tr>
    
            <tr>
        <td>
        
            
        </td>
           <td>
       <input type="submit" name="submit" value="Go"/>
            
        </td>
    </tr>
</table>


</form>


<br><br><br>

Login Here
<form method="post" action="LoginServlet">


<table>
    <tr>
        <td>
           email: 
            
        </td>
           <td>
          <input type="text" name="email" />
            
        </td>
    </tr>
        <tr>
        <td>
           pass: 
            
        </td>
           <td>
         <input type="text" name="password" />
            
        </td>
    </tr>
    
            <tr>
        <td>
        
            
        </td>
           <td>
       <input type="submit" name="submit" value="Go"/>
            
        </td>
    </tr>
</table>


</form>

</body>
</html>