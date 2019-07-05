package com.neusoft.web.support;

import java.util.HashMap;
import java.util.Map;

public abstract class ControllerSupport implements BaseController
{
	/*****************************************
	 * 	        数据输入流
	 *****************************************/
	protected Map<String,Object> dto=null;
    @Override
    public final void setMapDto(Map<String, Object> dto) 
    {
        this.dto=dto;	
    }
      
	/*****************************************
	 * 	        数据输出流
	 *****************************************/
    private Map<String,Object> attribute=new HashMap<>();
    protected final void  saveAttribute(String key,Object value)
    {
    	this.attribute.put(key, value);
    }
    
    @Override
    public final Map<String, Object> getAttribute() 
    {
    	return this.attribute;
    }
}
