function myFunction(){
    var name1 = "";
     var id1 = "";
    var address1 = "";
    var gender1 = "";
    var x = document.getElementById("frm2");
    
      for (i = 0; i < x.length ;i++) {
      
      if(i==0)
      	{
      		id1=x.elements[i].value;
      	}  
      	 if(i==1)
      	{
      		name1=x.elements[i].value;
      	}  
      	 if(i==2)
      	{
      		address1=x.elements[i].value;
      	}  
      	 if(i==3)
      	{
      		gender1=x.elements[i].value;
      	}  
      }
  var data = {id:id1,name:name1,address:address1,gender:gender1};

    var json = JSON.stringify(data);

    var xhr = new XMLHttpRequest();
    xhr.open("PUT", "http://localhost:8080/caregiver/update");
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send(json);
}; 