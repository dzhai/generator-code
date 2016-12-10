// ajax setings
$.ajaxSetup({
	contentType: "application/x-www-form-urlencoded; charset=utf-8",
	//fixed ajax request body content(json) issue
	headers: {"ajax":"true"}
});
$(function(){
	$('ul.submenu li a[menuclick=true]').bind('click',function(){
		var href=$(this).attr('href');
		href=href.substring(1);
		refreshBreadcrumbByUrl($(this).attr('href'));
		ajaxRightLoad(href);		
	});
	var currentPathHash=location.hash;
	if( typeof(currentPathHash)!='undefined' && location.hash!=''){
		$('ul.submenu li a[href="'+currentPathHash+'"]').parent().addClass('open').parent().show();
		$('ul.submenu li a[href="'+currentPathHash+'"]').click();
	}else{
		$('#sidebar').find('ul li:eq(1) a:eq(0)').click();
		refreshBreadcrumbByUrl();
	}
});

function refreshBreadcrumbByUrl(currentPathHash){
	if(typeof(currentPathHash)=='undefined' || currentPathHash==''){
		var currentPathHash=location.hash;
	}
	if(typeof(currentPathHash)!='undefined' && currentPathHash!=''){
		var breadcrumbList=new Array();
		var currentActive=$('ul.submenu li a[href="'+currentPathHash+'"]');
		var ul=currentActive.parents('ul.submenu');
		if(ul.length==2){
			refreshBreadcrumb(ul.eq(1).prev().prev().text(),ul.eq(0).prev().prev().text(),currentActive.text());	
		}else{
			refreshBreadcrumb(ul.eq(0).prev().prev().text(),currentActive.text());	
		}
	}else{
		refreshBreadcrumb('首页');
	}	
}

function refreshBreadcrumb(){
	var html='';
	for(var i=0;i<arguments.length;i++){
		if(i==0){
			html='<li><i class="ace-icon fa fa-home home-icon"></i><a href="javascript:void(0)" id="breadcrumb_meun">'+arguments[i]+'</a></li>';
		}else if(i+1==arguments.length){
			html+='<li class="active">'+arguments[i]+'</li>';
		}else{
			html+='<li><a href="javascript:void(0)">'+arguments[i]+'</a></li>';
		}
	}	
	$('#breadcrumbs ul').html(html);
}

function ajaxRightLoad(url){
	$.ajax({
		url :  url,
		type : "POST",
		data:  '',
		cache : false,
		success : function(html) {
			$('#page-content').html(html);			
		}
	});		
}

function ajaxRequestJsonData(url,params,callBack,extraData){
	$.ajax({
		url : url,
		type : "POST",
		async : false,
		data :  JSON.stringify(params),
		cache:false,
		contentType : 'application/json;charset=utf-8',
		success : function(data) {
			callBack(data,params,extraData);	
		}
	});
}

function ajaxRequestFormData(url,params,callBack,extraData){
	$.ajax({
		url : url,
		type : "POST",
		async : false,
		data :  params,
		cache:false,
		success : function(data) {
			callBack(data,params,extraData);	
		}
	});
}
