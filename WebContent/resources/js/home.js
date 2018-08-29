$(document).ready(function(){
	
	$('#state-select').change(function(){
		var state = $(this).val();
		console.log(state);
		ajaxDropdown(state);
	})
	
	$( "#modal-update" ).dialog({
		autoOpen: false,
		show: {
			effect: "fade",
			duration: 200
		},
		hide: {
			effect: "fade",
			duration: 200
		}
	});
	
});



function deletePerson(personId){
	console.log(personId);
	$.post('/WebProject/HomeServlet',{
		btn : 'delete',
		id : personId
	}, function(response){
		location.reload();
	});
}

function updatePerson(personId){
	$('#id-input').val(personId);
	$('#modal-update').dialog("open");
}

function update(){
	var personId = $('#id-input').val();
	var name = $('#name').val();
	var lastName = $('#lastName').val();
	var email = $('#email').val();
	var age = $('#age').val();
	var state = $('#state-select').val();
	var city = $('#city-select').val();
	var password = $('#password').val();
	$.post('/WebProject/HomeServlet',{
		btn : 'update',
		id : personId,
		name : name,
		lastName : lastName,
		email : email,
		age : age,
		state : state,
		city : city,
		password : password
	}, function(response){
		location.reload();
	});
}

//$.method(servlet, {}, function(response){});
function ajaxDropdown(stateId){
	$.get('/WebProject/GetCitiesServlet',{
		stateId: stateId
	}, function(response){
		document.getElementById("city-select").options.length = 0;
		$.each(response, function(key, value){
			$('#city-select').append($("<option />", {
				value: key,
				text: value.name
			}));
		});
	});
}