var deleteUrl = "/video/delete.html";
var updateUrl = "/video/update.html";
var pageUrl = "/video/pages.html";

$(function(){
	queryFY();
});

/*****S 分页查询相关方法**********/

/**
 * 填充表格数据
 * @param pageInfo  ajax返回的参数信息
 */
function showTable(pageInfo){
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var objs = pageInfo.list;
    $("#listTbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_1 = objs.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr = "<tr>"
            +'<td>'+index+'</td>'
            +'<td>'+replaceNull(objs[i].creatorusername)+'</td>'
            +'<td>'+replaceNull(objs[i].oriname)+'</td>'
            +'<td><a title="点击查看视频" href=javascript:void(0) onclick="watchVideo(\''+objs[i].path+'\')">'+replaceNull(objs[i].path)+'</a></td>'
            +'<td>'+replaceNull(objs[i].createtime)+'</td>'
            +'<td>'+replaceNull(objs[i].bodylocation)+'</td>'
            +'<td>'+replaceNull(objs[i].healthRadix)+'</td>'
            +'<td>';
    	tr+='<a href=javascript:void(0) title="点击修改用户" onclick="update(\''+objs[i].id+'\')"><i class="layui-icon">&#xe642;</i></a>'
    		+'<a href=javascript:void(0) title="点击删除该用户" onclick="remove(\''+objs[i].id+'\')"><i class="layui-icon">&#xe640;</i></a>';
            
    	tr +='</td></tr>'
        $("#listTbody").append(tr);
    }

    //开启分页组件
    showPage(total,pageNum,pageSize);
}

function watchVideo(path){
	var url = '/video/watchVideo.html?path='+path;
	x_admin_show('视频浏览',url,600,400);	
}
/*****E 分页查询相关方法**********/
