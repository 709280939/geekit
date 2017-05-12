<script type="text/javascript">
	function getData() {		 
			var url = "./sayhi",
		   $.post(url,null,callback); 
	} 
</script>


	<form action="${basePath}/sayhi" method="post">
		请输入您的名字： <input type="text" name="userName" /> <input type="submit"
			value="确定" />
	</form>


	<a type="button" id="btn" onClick="getData()"  href="./sayhi"><button>get
			data</button></a>
