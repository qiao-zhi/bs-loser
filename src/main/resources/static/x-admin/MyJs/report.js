function initPlanFinishDetailPie(){
	$.post("/report/planDetailData.html",function (response){
		 var option = createOption(response);
		 var myChart = echarts.init(document.getElementById('main'));
		// 使用刚指定的配置项和数据显示图表。
	    myChart.setOption(option);
	});
}

function createOption(dataSrc){
	// 指定图表的配置项和数据
	option = {
		    title : {
		        text: '个人减肥计划完成情况',
		        subtext: '',
		        x:'center'
		    },
		    tooltip : {
		        trigger: 'item',
		        formatter: "{a} <br/>{b} : {c} ({d}%)"
		    },
		    legend: {
		        orient: 'vertical',
		        left: 'left',
		    },
		    series : [
		        {
		            name: '完成情况',
		            data : [{name:"无计划",value:1}],
		            type: 'pie',
		            radius : '55%',
		            center: ['50%', '60%'],
		            itemStyle: {
		                emphasis: {
		                    shadowBlur: 10,
		                    shadowOffsetX: 0,
		                    shadowColor: 'rgba(0, 0, 0, 0.5)'
		                }
		            }
		        }
		    ]
	};

	if(dataSrc && dataSrc.length>0){
		option.series[0].data = dataSrc;
	}
	return option;
}

function initHotReport(){
	$.post("/report/hotReportData.html",function (response){
		 var option = createHotReportOption(response);
		 var myChart = echarts.init(document.getElementById('main'));
		// 使用刚指定的配置项和数据显示图表。
	    myChart.setOption(option);
	});
}

function createHotReportOption(response){
	option = {
		    title: {
		        text: '热量对比图'
		    },
		    tooltip: {
		        trigger: 'axis'
		    },
		    legend: {
		        data:['摄入热量','消耗热量','剩余热量']
		    },
		    grid: {
		        left: '3%',
		        right: '4%',
		        bottom: '3%',
		        containLabel: true
		    },
		    toolbox: {
		        feature: {
		            saveAsImage: {}
		        }
		    },
		    xAxis: {
		        type: 'category',
		        boundaryGap: false,
		        data: ["no"]
		    },
		    yAxis: {
		        type: 'value'
		    },
		    series: [
		        {
		            name:'摄入热量',
		            type:'line',
		            data:[0]
		        },
		        {
		            name:'消耗热量',
		            type:'line',
		            data:[0]
		        },
		        {
		            name:'剩余热量',
		            type:'line',
		            data:[0]
		        }
		    ]
		};
	
	if(response && response.XAxis){
		option.xAxis.data = response.XAxis;
	}
	if(response && response.inputHot){
		option.series[0].data = response.inputHot;
	}
	if(response && response.outputHot){
		option.series[1].data = response.outputHot;
	}
	if(response && response.remainHot){
		option.series[2].data = response.remainHot;
	}
	debugger
	return option;
}

