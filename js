
<script type="text/javascript" src="js/jquery-3.3.1.js"></script><script type="text/javascript" src="js/jquery-3.1.1.min.js"></script><script type="text/javascript" src="js/json2.js"></script>
<script type="text/javascript">
	function getData() {		 
			var url = "./sayhi",
		   $.post(url,null,callback); 
	} 
</script>

function login() {    
$.ajax({    //几个参数需要注意一下     
type: "GET",//方法类型     
dataType: "json",//预期服务器返回的数据类型     
url: "http://localhost:8080/rm/list" ,      
<!--data: $('#form1').serialize(),-->      
success: function (result) {          
console.log(result);//打印服务端返回的数据(调试用)      
$("#content").text(JSON.stringify(result));              
if (result.resultCode == 200) {           
alert("SUCCESS");       
};     
},      
error : function() {       
alert("异常！");   
}    });}


	<form action="${basePath}/sayhi" method="post">
		请输入您的名字： <input type="text" name="userName" /> <input type="submit"
			value="确定" />
	</form>


	<a type="button" id="btn" onClick="getData()"  href="./sayhi"><button>get
			data</button></a>
