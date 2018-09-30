
function checkFnameValidation() {
	var patientFname = $("#fname").val();
	var regex = /^[a-zA-Z ]{2,30}$/;
	if (regex.test(patientFname)) {
		$("#addPatientSuccess").prop("disabled", false);
		$("#fname").html("Passwords do not match!");
    }
    else {
    	$("#addPatientSuccess").prop("disabled", true);
    }
}



$(document).ready(function(){
	
	$("#fname").keyup(checkFnameValidation);
});