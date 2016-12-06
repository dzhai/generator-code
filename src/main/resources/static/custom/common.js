$(function(){
	$('ul.submenu li a[menuclick=true]').bind('click',function(){
		var href=$(this).attr('href');
		href=href.substring(1);
		var breadcrumb_meun=$(this).parent().parent().parent().find('a').eq(0).text();
		var breadcrumb_meun_sub=$(this).text();
		$('#breadcrumb_meun').text(breadcrumb_meun);
		$('#breadcrumb_meun_sub').text(breadcrumb_meun_sub);
		$.ajax({
			url :  href,
			type : "post",
			cache : false,
			dataType : "html",
			success : function(html) {
				$('#page-content').html(html);
			}
		});	
	});
});