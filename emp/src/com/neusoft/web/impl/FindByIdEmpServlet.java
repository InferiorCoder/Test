package com.neusoft.web.impl;

import java.util.Map;

import com.neusoft.services.impl.Ab01ServicesImpl;
import com.neusoft.web.support.ControllerSupport;

public class FindByIdEmpServlet extends ControllerSupport {

	@Override
	public String execute() throws Exception {
		Ab01ServicesImpl services=new Ab01ServicesImpl(dto);
		Map<String,String> ins=services.findById();
		if(ins.size()>0)
		{
			this.saveAttribute("ins", ins);
		}
		else
		{
			this.saveAttribute("msg", "û�з�������������");
		}
		//sSystem.out.println("findById"+rows);
		return "addEmp";
	}

}
