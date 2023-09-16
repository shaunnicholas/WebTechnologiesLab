function validateform()
{  
    var name=document.myform.name.value;  
    var password=document.myform.password.value;  
      
    if (name==null || name=="")
    {  
        alert("Username can't be blank");  
        return false;  
    }

    if(password.length<6)
    {  
        alert("Password must be at least 6 characters long.");  
        return false;  
    }  
}  