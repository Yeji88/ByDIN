package com.Bydin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bydin.Ajax.AjaxService;
import com.Bydin.Service.ItemService;
import com.Bydin.item.TotalGoodsDTO;
import com.Bydin.member.MemberDTO;

@RestController
public class AjaxController {
	@Autowired private AjaxService as;
	@Autowired private ItemService is;
	
	@GetMapping("checkuserid")
	public int checkuserid(String userid) {
		MemberDTO dto = as.selectuserid(userid);
		return dto != null ? 1 : 0;
	}
	
	@GetMapping("item/dto1")
	public List<TotalGoodsDTO> dto1(){
		List<TotalGoodsDTO> list = is.getStudyroomItem();
		return list;
	}
	
}
