var slide = "register";


$(window).ready(function(){
	switchslide() 
	}) 


function switchslide(){
	
switch (slide){

case "register": document.getElementById("bookForm").style.display = "block";
				document.getElementById("showBook").style.display = "none";
				break;
				
case "show": document.getElementById("bookForm").style.display = "none";
			document.getElementById("showBook").style.display = "block";
			break;
}
}
