var deleteUrl = "/dietStep/delete.html";
var updateUrl = "/dietStep/update.html";
var pageUrl = "/dietStep/pages.html";

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
            +'<td>'+replaceNull(objs[i].remark)+'</td>'
            +'<td>'+replaceNull(objs[i].diets)+'</td>'
            +'<td>'+replaceNull(objs[i].dietsheat)+'</td>'
            +'<td>'+replaceNull(objs[i].sports)+'</td>'
            +'<td>'+replaceNull(objs[i].sportsheat)+'</td>'
            +'<td>'+replaceNull(objs[i].stepnumber)+'</td>'
            +'<td><a title="点击查看视频" href=javascript:void(0) onclick="watchVideo(\''+objs[i].recommendvideo+'\')">'+replaceNull(objs[i].recommendvideo)+'</a></td>'
            +'<td>';
    	tr+='<a href=javascript:void(0) title="修改" onclick="update('+objs[i].id+')"><i class="layui-icon">&#xe642;</i></a>'
    		+'<a href=javascript:void(0) title="删除" onclick="remove('+objs[i].id+')"><i class="layui-icon">&#xe640;</i></a>';
            
    	tr +='</td></tr>'
        $("#listTbody").append(tr);
    }

    //开启分页组件
    showPage(total,pageNum,pageSize);
}
/*****E 分页查询相关方法**********/

function watchVideo(path){
	var url = '/video/watchVideo.html?path='+path;
	x_admin_show('视频浏览',url,600,400);	
}