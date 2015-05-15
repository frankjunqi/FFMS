var idTmr ;
 
function method1(tableid) {//整个表格拷贝到EXCEL中
	var curTbl = document.getElementById(tableid); 
	var oXL; 
	try { 
	oXL = GetObject("", "Excel.Application"); 
	} 
	catch (E) { 
	try { 
	oXL = new ActiveXObject("Excel.Application"); 
	} 
	catch (E2) { 
	//alert("Please confirm:\n1.Microsoft Excel has been installed.\n2.Internet Options=>Security=>Setting \"Enable unsafe ActiveX\""); 
	alert("请确认:\n1.机器上Excel已经安装.\n2.Internet 选项=>安全=>Internet \"对没有标记为安全的ActiveX控件进行初始化和脚本运行，设定为启用\"");
	return; 
	} 
	}
	//创建AX对象excel 
	var oWB = oXL.Workbooks.Add(); 
	//获取workbook对象 
	var oSheet = oWB.ActiveSheet; 
	//激活当前sheet 
	var sel = document.body.createTextRange(); 
	sel.moveToElementText(curTbl); 
	//把表格中的内容移到TextRange中 
	sel.select(); 
	//全选TextRange中内容 
	sel.execCommand("Copy"); 
	//复制TextRange中内容 
	oSheet.Paste(); 
	//粘贴到活动的EXCEL中 
	oXL.Visible = true; 
	//设置excel可见属性 
	}

function Cleanup() {
    window.clearInterval(idTmr);
    CollectGarbage();
  }