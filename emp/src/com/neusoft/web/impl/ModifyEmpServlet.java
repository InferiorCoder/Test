package com.neusoft.web.impl;

import com.neusoft.services.impl.Ab01ServicesImpl;
import com.neusoft.web.support.ControllerSupport;

public class ModifyEmpServlet extends ControllerSupport {

	@Override
	public String execute() throws Exception {
		Ab01ServicesImpl services=new Ab01ServicesImpl(dto);
		if(services.modifyEmp())
		{
			this.saveAttribute("msg","修改成功");
		}
		else
		{
			this.saveAttribute("msg","修改失败");
		}
		return "addEmp";
	}

}
