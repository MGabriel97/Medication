function myFunction(){
    var name1 = "";
    var address1 = "";
    var x = document.getElementById("frm2");
    
      for (i = 0; i < x.length ;i++) {
      
      if(i==0)
      	{
      		name1=x.elements[i].value;
      	}  
      }
   var data = {name:name1};

    var json = JSON.stringify(data);

    var xhr = new XMLHttpRequest();
    xhr.open("DELETE", "http://localhost:8080/caregiver/delete");
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send(json);
}; 