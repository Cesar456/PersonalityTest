$(document).ready(function(){
	//旋转角度
	var angles;
	//可抽奖次数
	var clickNum = 1;
	//旋转次数
	var rotNum = 0;
	//中奖公告
	var notice = "";
	//转盘初始化
	var color = ["#626262","#787878","rgba(0,0,0,0.5)","#DCC722","white","#FF4350"];
	var info = ["一等奖","二等奖","三等奖","二等奖","三等奖","三等奖","二等奖","三等奖"];
	canvasRun();
	$('#tupBtn').bind('click',function(){
		if (clickNum >= 1) {
			//可抽奖次数减一
			clickNum = clickNum-1;
			//转盘旋转
			runCup();
			//转盘旋转过程“开始抽奖”按钮无法点击
			$('#tupBtn').attr("disabled", true);
			//旋转次数加一
			rotNum = rotNum + 1;
			//“开始抽奖”按钮无法点击恢复点击
			setTimeout(function(){
				alert(notice);
				$('#tupBtn').removeAttr("disabled", true);
			},6000);
		}
		else{
			alert("您已经抽过奖了！");
		}
	});

	//转盘旋转
	function runCup(){
		probability();
		var degValue = 'rotate('+angles+'deg'+')';
		$('#myCanvas').css('-o-transform',degValue);           //Opera
		$('#myCanvas').css('-ms-transform',degValue);          //IE浏览器
		$('#myCanvas').css('-moz-transform',degValue);         //Firefox
		$('#myCanvas').css('-webkit-transform',degValue);      //Chrome和Safari
		$('#myCanvas').css('transform',degValue);
	}

	//各奖项对应的旋转角度及中奖公告内容
	function probability(){
		
		var name = eval(document.getElementById('userName')).value;
		
		//获取随机数
		var num = parseInt(Math.random()*(7 - 0 + 0) + 0);
		var prize = 0.0;
		
		//概率
		if ( num == 0 ) {
			angles = 2160 * rotNum + 1800;
//			一等奖判定
			if(Math.random()>0.5){
				prize = 4.5;
			}else {
				prize = 5.0;
			}
			notice = info[0];
		}
		//概率
		else if ( num == 1 ) {
			angles = 2160 * rotNum + 1845;
//			三等奖判定
			var x = Math.random(); 
			if(x<0.3){
				prize =  1.5;
			}else if (x<0.6) {
				prize = 2;
			} else {
				prize = 2.5;
			}
			
			notice = info[7];
		}
		//概率
		else if ( num == 2 ) {
			angles = 2160 * rotNum + 1890;
//			二等奖判定
			var x = Math.random(); 
			if(x<0.3){
				prize =  3;
			}else if (x<0.6) {
				prize = 3.5;
			} else {
				prize = 4;
			}
			notice = info[6];
		}
		//概率
		else if ( num == 3 ) {
			angles = 2160 * rotNum + 1935;
			var x = Math.random(); 
			if(x<0.3){
				prize =  1.5;
			}else if (x<0.6) {
				prize = 2;
			} else {
				prize = 2.5;
			}
			notice = info[5];
		}
		//概率
		else if ( num == 4 ) {
			angles = 2160 * rotNum + 1980;
			var x = Math.random(); 
			if(x<0.3){
				prize =  1.5;
			}else if (x<0.6) {
				prize = 2;
			} else {
				prize = 2.5;
			}
			
			notice = info[4];
		}
		//概率
		else if ( num == 5 ) {
			angles = 2160 * rotNum + 2025;
			var x = Math.random(); 
			if(x<0.3){
				prize =  3;
			}else if (x<0.6) {
				prize = 3.5;
			} else {
				prize = 4;
			}
			notice = info[3];
		}
		//概率
		else if ( num == 6 ) {
			angles = 2160 * rotNum + 2070;
			var x = Math.random(); 
			if(x<0.3){
				prize =  1.5;
			}else if (x<0.6) {
				prize = 2;
			} else {
				prize = 2.5;
			}
			notice = info[2];
		}
		//概率
		else if ( num == 7 ) {
			angles = 2160 * rotNum + 2115;
			var x = Math.random(); 
			if(x<0.3){
				prize =  3;
			}else if (x<0.6) {
				prize = 3.5;
			} else {
				prize = 4;
			}
			notice = info[1];
		}
		
//		document.getElementById('userName').value= num+" " + prize;
		
		notice = "恭喜您获得"+notice+prize+"元，奖金稍后发放至微博";
		
		$.post("fourth.jsp",
				  {
				    name:name,
				    prize:prize
				  });
	}

	//绘制转盘
	function canvasRun(){
		var canvas=document.getElementById('myCanvas');
		var canvas01=document.getElementById('myCanvas01');
		var canvas03=document.getElementById('myCanvas03');
		var canvas02=document.getElementById('myCanvas02');
		var ctx=canvas.getContext('2d');
		var ctx1=canvas01.getContext('2d');
		var ctx3=canvas03.getContext('2d');
		var ctx2=canvas02.getContext('2d');
		createCircle();
		createCirText();
		initPoint();
	
		//外圆
		function createCircle(){
	        var startAngle = 0;//扇形的开始弧度
	        var endAngle = 0;//扇形的终止弧度
	        //画一个8等份扇形组成的圆形
	        for (var i = 0; i< 8; i++){
	            startAngle = Math.PI*(i/4-1/8);
	            endAngle = startAngle+Math.PI*(1/4);
	            ctx.save();
	            ctx.beginPath(); 
	            ctx.arc(150,150,100, startAngle, endAngle, false);
	            ctx.lineWidth = 120;
	            if (i%2 == 0) {
	            	ctx.strokeStyle =  color[0];
	            }else{
	            	ctx.strokeStyle =  color[1];
	            }
	            ctx.stroke();
	            ctx.restore();
	        } 
	    }

	    //各奖项
	    function createCirText(){	 
		    ctx.textAlign='start';
		    ctx.textBaseline='middle';
		    ctx.fillStyle = color[3];
		    var step = 2*Math.PI/8;
		    for ( var i = 0; i < 8; i++) {
		    	ctx.save();
		    	ctx.beginPath();
		        ctx.translate(150,150);
		        ctx.rotate(i*step);
		        ctx.font = " 20px Microsoft YaHei";
		        ctx.fillStyle = color[3];
		        ctx.fillText(info[i],-30,-115,60);
		        ctx.font = " 14px Microsoft YaHei";
		        ctx.fillText('',-30,-95,60);
		        ctx.closePath();
		        ctx.restore();
		    }
		}

		function initPoint(){ 
	        //箭头指针
	        ctx1.beginPath();
	        ctx1.moveTo(100,24);
	        ctx1.lineTo(90,62);
	        ctx1.lineTo(110,62);
	        ctx1.lineTo(100,24);
	        ctx1.fillStyle = color[5];
	        ctx1.fill();
	        ctx1.closePath();
	        //中间小圆
	        ctx3.beginPath();
	        ctx3.arc(100,100,40,0,Math.PI*2,false);
	        ctx3.fillStyle = color[5];
	        ctx3.fill();
	        ctx3.closePath();
	        //小圆文字
	        ctx3.font = "Bold 20px Microsoft YaHei"; 
		    ctx3.textAlign='start';
		    ctx3.textBaseline='middle';
		    ctx3.fillStyle = color[4];
	        ctx3.beginPath();
	        ctx3.fillText('开始',80,90,40);
	        ctx3.fillText('抽奖',80,110,40);
	        ctx3.fill();
	        ctx3.closePath();
	        //中间圆圈
	        ctx2.beginPath();
	        ctx2.arc(75,75,75,0,Math.PI*2,false);
	        ctx2.fillStyle = color[2];
	        ctx2.fill();
	        ctx2.closePath();
		}
	}
});