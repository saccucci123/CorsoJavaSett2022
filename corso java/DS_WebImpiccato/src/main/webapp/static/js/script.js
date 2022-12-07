$( document ).ready(function() {
    
    $ ("#d1,#d2,#d3,#d4,#d5,#d6,#d7,#d8,#d9").hide();
   
  

var parola="LIMONE";
var contaErrori=0;
var contaCorretti=0;

    $("#bottoneScelta").click(function(){
        
        var lettera= $("#inputScelta").val();
        
        if(parola.indexOf(lettera)==-1){
        
        contaErrori+=1;
        $("#d" +contaErrori).show();
         }
         
         else{
         if(lettera=="L") {
        $("#box1").val("L");
        contaCorretti++;
        }
        
        else if(lettera=="I") {
        $("#box2").val("I");
         contaCorretti++;
}
        
        else if(lettera=="M"){
        $("#box3").val("M");
        contaCorretti++;
         }
         else if(lettera=="O"){
         $("#box4").val("O")
         contaCorretti++;
}
          
        else if(lettera=="N"){
         $("#box5").val("N")
         contaCorretti++;
}
        else if(lettera=="E"){
        $("#box6").val("E")
         contaCorretti++;
}
}
      if(contaErrori==9) alert("Hai perso!!");
      else if(contaCorretti==6) alert("Hai vinto!!");
                    
        
       });
    
 });