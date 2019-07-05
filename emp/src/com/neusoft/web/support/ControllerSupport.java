package com.neusoft.web.support;

import java.util.HashMap;
import java.util.Map;

public abstract class ControllerSupport implements BaseController
{
	/*****************************************
	 * 	        ����������
	 *****************************************/
	protected Map<String,Object> dto=null;
    @Override
    public final void setMapDto(Map<String, Object> dto) 
    {
        this.dto=dto;	
    }
      
	/*****************************************
	 * 	        ���������
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
