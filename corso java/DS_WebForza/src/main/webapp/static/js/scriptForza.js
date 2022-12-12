$( document ).ready(function() {
	
 var colonne=[];
 var cerchioIns=[];

	
  for (var i=0; i<8; i++){
		var col=0;
		colonne.push(col);
	}
	
$(":button").click(function(){
	var colore;
	if ($(this).is("#g1")) colore="#d1140f";
	else if ($(this).is("#g2")) colore="#E6E6FA";
	var pulsValue=$(this).val();
	var riga=colonne[pulsValue];
	var cerchioCol=[colore, pulsValue, riga];
	cerchioIns.push(cerchioCol);
	colonne[pulsValue]++; 
	$("#"+pulsValue+"_"+riga).css("background-color", colore);
	controlloVincita();
	
	})
	function controllaVincita () {
		
		var win;
		
		for(var i=8; i>colonne; i--){
		for(j=1; j<=8; j++){
		var cell=$("#riga ("+i+")+_("+j+"))
			
		}
		
		
		
	}
	
	
	
	
	
	
	});







