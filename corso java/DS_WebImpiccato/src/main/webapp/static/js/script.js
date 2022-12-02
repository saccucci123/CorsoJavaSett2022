$( document ).ready(function() {
    
    $ ("#d1,#d2,#d3,#d4,#d5,#d6,#d7,#d8,#d9").hide();
    $ ("#box1,#box2,#box3,#box4,#box5,#box6").hide();
    $ ("#win,#loser").hide();
    
    $("#bottoneScelta").click(function(){
	var parola= $("#inputScelta").val();
	if(parola=="l"){
	$("#box1").show()
	}
	else if (parola=="i"){
		$("#box2").show()
	}
	else if (parola=="m"){
		$("#box3").show()
	}
	else if (parola=="o"){
		$("#box4").show()
	}
	
	else if (parola=="n"){
		$("#box5").show()
	}
	else if (parola=="e"){
		$("#box6").show()
	}
	
	
	
});
    
 });