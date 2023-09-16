function validateform1()
{  
    var name1=document.myform1.name.value;  
    var POB = document.myform1.POB.value;
    var DOB = document.myform1.DOB.value;

    if (name1==null || name1=="")
    {  
        alert("Name can't be blank");  
        return false;  
    }

    if (POB==null || POB=="")
    {  
        alert("Place is blank");  
        return false;  
    }

    if(DOB.length>10)
    {  
        alert("Invalid Date");  
        return false;  
    }
    else{
        return true;
    }
}        