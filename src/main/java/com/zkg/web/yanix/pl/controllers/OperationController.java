package com.zkg.web.yanix.pl.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zkg.web.yanix.bl.models.Customer;
import com.zkg.web.yanix.bl.services.CustomerService;

@Controller
public class OperationController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/blog")
	public String returnHome() throws Exception {
		return "redirect:/home";
	}
	
	@RequestMapping("/calendar")
	public String getCalendar(HttpSession session) {
		return "calendar";
	}
	
	@RequestMapping("/datatables")
	public String getDataTables(HttpSession session) {
		return "datatables";
	}
	
	@RequestMapping("/jqgrid")
	public String getJQueryTables(Model model, HttpSession session) {
		model.addAttribute("customer",new Customer());
		try {
			model.addAttribute("customerList",customerService.getCustomers());
		}
		catch (Exception e) {
			model.addAttribute("errorMessage","Failed to acquire the customer list!");
		}
		return "jqgrid";
	}
	@RequestMapping(value = "/jqgrid/updateCustomer")
	public String updateCustomer(Model model, Customer customer) {
		try {
			customerService.updateCustomer(customer);
			model.addAttribute("successMessage","Customer updated successfully!");
		}
		catch (Exception e) {
			model.addAttribute("errorMessage","Failed to update customer");
		}
		return "redirect:/jqgrid";
	}
	
	@RequestMapping("/orders")
	public String getOrders(HttpSession session) {
		return "orders";
	}
	
	@RequestMapping("/products-view")
	public String getProductsView(HttpSession session) {
		return "products-view";
	}
	
	@RequestMapping("/products-detail")
	public String getProductsDetail(HttpSession session) {
		return "products-detail";
	}

}
