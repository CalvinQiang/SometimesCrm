package com.sometimes.crm.web.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sometimes.crm.domain.BaseDict;
import com.sometimes.crm.service.BaseDictService;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

public class BaseDictAction extends ActionSupport implements ModelDriven<BaseDict>{
	private BaseDict baseDict = new BaseDict();
	private BaseDictService baseDictService; 

	@Override
	public BaseDict getModel() {
		// TODO Auto-generated method stub
		return baseDict;
	}

	public void setBaseDictService(BaseDictService baseDictService) {
		this.baseDictService = baseDictService;
	}


	public String findByTypeCode() {
		List<BaseDict> list = baseDictService.findByTypeCode(baseDict.getDict_type_code());
		
		//去除掉不想要的信息
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes(new String[] {"dict_sort","dict_enable"});
		
		JSONArray jsonArray = JSONArray.fromObject(list,jsonConfig);
		//System.out.println(jsonArray.toString());
		
		//将json输出至页面
		ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");
		try {
			ServletActionContext.getResponse().getWriter().println(jsonArray.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return NONE;
	}
	
}
