var idTmr ;
 
function method1(tableid) {//������񿽱���EXCEL��
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
	alert("��ȷ��:\n1.������Excel�Ѿ���װ.\n2.Internet ѡ��=>��ȫ=>Internet \"��û�б��Ϊ��ȫ��ActiveX�ؼ����г�ʼ���ͽű����У��趨Ϊ����\"");
	return; 
	} 
	}
	//����AX����excel 
	var oWB = oXL.Workbooks.Add(); 
	//��ȡworkbook���� 
	var oSheet = oWB.ActiveSheet; 
	//���ǰsheet 
	var sel = document.body.createTextRange(); 
	sel.moveToElementText(curTbl); 
	//�ѱ���е������Ƶ�TextRange�� 
	sel.select(); 
	//ȫѡTextRange������ 
	sel.execCommand("Copy"); 
	//����TextRange������ 
	oSheet.Paste(); 
	//ճ�������EXCEL�� 
	oXL.Visible = true; 
	//����excel�ɼ����� 
	}

function Cleanup() {
    window.clearInterval(idTmr);
    CollectGarbage();
  }