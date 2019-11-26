$(document).ready(function() {
	var asd="marius";
	var x = document.getElementById("frm1");
    var text = "";
    var user = "";
    var i;
  
    $.ajax({
		
        url: "http://localhost:8080/caregiver/all"
    }).then(function(data) {
			 
			for(var i=0;i<data.length;i++)
           {
        		var event_data = '';
              event_data += '<tr>';
                event_data += '<td>'+data[i].name+' '+'</td>';  
                event_data += '</tr>';
			$("#tbody").append(event_data);
           }
    });
});