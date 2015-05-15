<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/chico-0.10.2.css">

	<style> 
		/* Carousel list size */
		.YOUR_SELECTOR_Carousel .ch-carousel-content li {
			width:220px;
			height: 220px;
		}
		
		/* Icons demo */
		.showroomIcons li{
			clear:left;
		}
		
		.showroomIcons .ico {
			float:left;
			margin:2px 10px 0 0;
		}
		
		.autoComplete {
			width: 250px;
		}
		
		.autoComplete2 {
			width: 350px;
		}
		
		.autoComplete3 {
			width: 450px;
		}
	</style>
  </head>
   
  <body >
<center>
  	
	<div class="container">
    <div class="box"> 
		<h2>Calendar</h2>
		<div class="YOUR_SELECTOR_calendar"></div>
	</div>
	</div>
	</center>
	
	
	<h1 ></h1>
	<script src="js/jquery.js"></script>
	<script src="js/chico-0.10.2.js"></script>
	<script> 

		// Automatic version
        var title = document.title + ' ' + ch.version;
        document.title = title; // Use old school because IE6 dosen't work fine with DOM API.
       // document.getElementsByTagName("h1")[0].innerHTML = title;

		// Components
		
		// AutoComplete
		var a = $(".autoComplete").autoComplete({url:"http://chico.com:8080/suggest?q=",message:"Please Write",jsonpCallback:"autoComplete"});
		var b = $(".autoComplete2").autoComplete({url:"http://chico.com:8080/suggest?q=",message:"Please Write",jsonpCallback:"her"});
		var c = $(".autoComplete3").autoComplete({suggestions:["Oops","Oso","Olor","ser","something","wrong","happened","B","AA","BBBB"],message:"Escribe y seras sugerido"});
		
		var autoComplete = function(data){
			a.suggest(data);
		}

		var her = function(data){
			data.push("Other callback");
			b.suggest(data);
		}
		
		// Blink
		$("#doHighlight").bind("mousedown",function(){$("#example").blink();});
		
		// Accordion
		var ch_acco = $(".YOUR_SELECTOR_Accordion").accordion({
			selected: "1#2"
		});
		
		// Menu
		var ch_menu = $(".YOUR_SELECTOR_Menu").menu();
		
		// Dropdown
		var ch_drop = $(".YOUR_SELECTOR_Dropdown").dropdown();
		var ch_drop = $(".myDropdown").dropdown();

		// Carousel
		var ch_caro = $(".YOUR_SELECTOR_Carousel").carousel({
			pagination:true
		});
					
		// Modal
		var ch_moda = $(".YOUR_SELECTOR_Modal").modal({
			width: "500px",
			height: "300px"
		});
		
		// Modal with invisible DOM Content		
		var ch_moda_invisible = $(".YOUR_SELECTOR_Modal_invisible").modal({ 
		  content:"#invisible-content"
		});
		
		// Transition
		var ch_tran = $(".YOUR_SELECTOR_Transition").transition();
		
		// Layer on click
		var ch_layeC = $(".YOUR_SELECTOR_LayerCloseButton").layer({
			event: "click",
			closeHandler: "button",
			content: "#invisible-content-for-layer"
		});
		
		// Layer on click
		var ch_laye = $(".YOUR_SELECTOR_LayerOnclick").layer({
			event: "click",
			content: "#invisible-content"
		});
		
		// Layer on mouseover
		var ch_layr = $(".YOUR_SELECTOR_LayerOnmouseover").layer("<p>foo</p>");

		// Tooltip
		var ch_tool = $(".YOUR_SELECTOR_Tooltip").tooltip();

		// Tab Navigator
		var ch_tabs = $(".YOUR_SELECTOR_TabNavigator").tabNavigator();

		// Expando
		var ch_expa = $(".YOUR_SELECTOR_Expando").expando();
		
		// Calendar
		var calendar = $(".YOUR_SELECTOR_calendar").calendar({
			"selected": [
				["2012/01/11", "2012/01/14"],
				["2012/01/23", "2012/01/27"],
				"2012/01/02"
			],
			"from": "2010/11/05",
			"to": "2012/11/25"
		});
		
		// Date Picker
		var datePicker = $(".myDatePicker").datePicker({
			"selected": "2011/11/15",
			"from": "2010/11/05",
			"to": "2012/11/25"
		});

		var ch_ico = $(".ch-form-ico").layer({content:"Help",event:"click", offset:"-12 15"});
			
		// Form
		var ch_form = $('.myForm').form();
		
		// Countdown
		var cd = $("#text_cd").countdown(140);

		// Watchers
		var ch_wprice = $("#price").price().and().required();
		var ch_wch1 = $("#email").required("requerid").and().email("Guachin emial").and().minLength(10);
		var ch_wch11 = $("#custom").custom(
			function(v){
				//console.log("Custom: " + v);
				var value1 = (v.toString().indexOf("1")>-1) ? true : false;
				var value2 = (v.toString().indexOf("2")>-1) ? true : false;

				if (value1 && value2) {
					return true;
				}

				if (!value1) {
					console.log(this);
					this.conditions.custom.message = "Mensjae largo para probar mensaje de varias lineas y ajustar el padding interno de la caja. 1";
					return false;
				}

				if (!value2) {
					this.conditions.custom.message = "Mensjae largo para probar mensaje de varias lineas y ajustar el padding interno de la caja. 2";
					return false;
				}

			}).and().required("Debes completar este campo");
		var ch_wch4 = $("#range").min(1).and().max(10);
		var ch_wch5 = $("#characters").maxLength(20).and().minLength(6);
		var ch_wch6 = $("#required_disabled, #select2, #select3, .check2, .check3, .radio2, .radio3, .radio4, #textarea2, #textarea3").required("Required");

	</script>
  </body>
</html>
