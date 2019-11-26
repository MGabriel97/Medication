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
      if(i==2)
      	{
      		medicaldecord1=x.elements[i].value;
      	}
      
      }
   var data = {name:name1,dosage:address1,sideeffects:medicaldecord1};

    var json = JSON.stringify(data);

    var xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:8080/medication/register");
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send(json);
}; 