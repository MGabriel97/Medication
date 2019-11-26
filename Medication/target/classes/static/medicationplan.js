$(document).ready(function() {
	var asd="marius";
	var x = document.getElementById("frm1");
    var text = "";
    var user = "";
    var i;
  
    $.ajax({
		
        url: "http://localhost:8080/medicationplan/items"
    }).then(function(data) {
			 
			for(var i=0;i<data.length;i++)
           {
        		var event_data = '';
              event_data += '<tr>';
                event_data += '<td>'+data[i].patient+' '+'</td>';  
                event_data += '<td>'+data[i].name+' '+'</td>'; 
                 for(var j=0;j<data[i].items.length;j++)  
                 {
                 	 event_data += '<td>'+data[i].items[j].name+' '+'</td>';  
             	     event_data += '<td>'+data[i].items[j].sideeffects+' '+'</td>'; 
                 }
                event_data += '</tr>';
			$("#tbody").append(event_data);
           }
    });
});