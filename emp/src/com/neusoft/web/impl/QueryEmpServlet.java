package com.neusoft.web.impl;

import java.util.List;
import java.util.Map;

import com.neusoft.services.impl.Ab01ServicesImpl;
import com.neusoft.web.support.ControllerSupport;

public class QueryEmpServlet extends ControllerSupport 
{
	@Override
	public String execute() throws Exception 
	{
		Ab01ServicesImpl services=new Ab01ServicesImpl(this.dto);
		List<Map<String,String>> rows=services.query();
		if(rows.size()>0)
		{
			this.saveAttribute("rows", rows);
		}
		else
		{
			this.saveAttribute("msg", "û�з�������������");
		}	
		return "queryEmp";
	}

}
