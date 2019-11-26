function myFunction(){
    var name1 = "";
    var address1 = "";
	var medicaldecord1 = "";
    var x = document.getElementById("frm2");
    
      for (i = 0; i < x.length ;i++) {
      
      if(i==0)
      	{
      		name1=x.elements[i].value;
      	}
      if(i==1)
      	{
      		address1=x.elements[i].value;
      	}
      
      
      }
   var data = {intakeinterval:name1,patient:address1};

    var json = JSON.stringify(data);

    var xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:8080/medicationplan/register");
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send(json);
}; 