package com.neusoft.web.impl;

import java.util.List;
import java.util.Map;

import com.neusoft.services.impl.Ab01ServicesImpl;
import com.neusoft.web.support.ControllerSupport;

public class AddEmpServlet extends ControllerSupport 
{
	@Override
	public String execute() throws Exception {
		Ab01ServicesImpl services=new Ab01ServicesImpl(this.dto);
		if(services.addEmp())
		{
			this.saveAttribute("msg", "������ݳɹ�");
		}
		else
		{
			this.saveAttribute("msg", "�������ʧ��");
		}	
		
		List<Map<String,String>> rows=services.query();
		if(rows.size()>0)
		{
			this.saveAttribute("rows", rows);
		}
		
		return "queryEmp";
	}

}
