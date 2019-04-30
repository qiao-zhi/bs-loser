var pageUrl = "/recommand/getVideos.html";

$(function(){
	queryVideos();
});

function queryVideos(){
    $.ajax({
       url:pageUrl,
       data:{"body":$("#body").val()},
       dataType:'json',
        type:'post',
        async:true,
        success:showTable
    });
}

function showTable(response){
	if(!response){
		return;
	}
	
	var objs = response;
	$("#listTbody").html("");
    for(var i=0,length_1 = objs.length;i<length_1;i++){
        var tr = "<tr>"
            +'<td>'+(i+1)+'</td>'
            +'<td>'+replaceNull(objs[i].creatorusername)+'</td>'
            +'<td>'+replaceNull(objs[i].oriname)+'</td>'
            +'<td><a title="点击查看视频" href=javascript:void(0) onclick="watchVideo(\''+objs[i].path+'\')">'+replaceNull(objs[i].path)+'</a></td>'
            +'<td>'+replaceNull(objs[i].createtime)+'</td>'
            +'<td>'+replaceNull(objs[i].bodylocation)+'</td>'
            +'<td>'+replaceNull(objs[i].healthRadix)+'</td>';
    	tr +='</tr>'
        $("#listTbody").append(tr);
    }
}

function watchVideo(path){
	var url = '/video/watchVideo.html?path='+path;
	x_admin_show('视频浏览',url,600,400);	
}
/*****E 分页查询相关方法**********/
