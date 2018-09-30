/**
 * 
 */

$(document).ready(function() {
	$('.delete-patient').on('click', function (){
		/*<![CDATA[*/
	    var path = /*[[@{/}]]*/'remove';
	    /*]]>*/
		
		var id=$(this).attr('id');
		
		bootbox.confirm({
			message: "Are you sure to remove this patient record? It can't be undone.",
			buttons: {
				cancel: {
					label:'<i class="fa fa-times"></i> Cancel'
				},
				confirm: {
					label:'<i class="fa fa-check"></i> Confirm'
				}
			},
			callback: function(confirmed) {
				if(confirmed) {
					$.post(path, {'id':id}, function(res) {
						location.reload();
					});
				}
			}
		});
	});
	
	$('#deleteSelected').click(function() {
		var idList= $('.checkboxPatient');
		var patientIdList=[];
		for (var i = 0; i < idList.length; i++) {
			if(idList[i].checked==true) {
				patientIdList.push(idList[i]['id'])
			}
		}
		
		console.log(patientIdList);
		
		/*<![CDATA[*/
	    var path = /*[[@{/}]]*/'removeList';
	    /*]]>*/
	    
	    bootbox.confirm({
			message: "Are you sure to remove all selected patient records? It can't be undone.",
			buttons: {
				cancel: {
					label:'<i class="fa fa-times"></i> Cancel'
				},
				confirm: {
					label:'<i class="fa fa-check"></i> Confirm'
				}
			},
			callback: function(confirmed) {
				if(confirmed) {
					$.ajax({
						type: 'POST',
						url: path,
						data: JSON.stringify(patientIdList),
						contentType: "application/json",
						success: function(res) {
							console.log(res); 
							location.reload()
							},
						error: function(res){
							console.log(res); 
							location.reload();
							}
					});
				}
			}
		});
	});
	
	$("#selectAllPatients").click(function() {
		if($(this).prop("checked")==true) {
			$(".checkboxPatient").prop("checked",true);
		} else if ($(this).prop("checked")==false) {
			$(".checkboxPatient").prop("checked",false);
		}
	})
});