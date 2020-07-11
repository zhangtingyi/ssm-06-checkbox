package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.entity.Choose;

@Controller
public class ChooseController {
	@RequestMapping(value="/checkbox",method=RequestMethod.GET)
	public String checkbox(Model model){
		Choose choose = new Choose ();
		//设置Boolean变量choose的值为true
		choose.setChoose(true);
		//为集合变量options添加"选项1"，"选项2"
		List<String> list = new ArrayList<String>();
		list.add("选项1");
		list.add("选项2");
		choose.setOptions(list);
		//向model中添加属性Choose，值是choose对象
		model.addAttribute("choose",choose);
		return "checkbox";
	}
}

