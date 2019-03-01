package com.tricon.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.vo.Products;

@RestController

public class ProductServiceRestController {
	@RequestMapping(value="/products")
	public List<Products> getProducts(){
		List<Products> myProducts = new ArrayList<Products>(5);
		Products p1 = new Products();
		p1.setName("Maruti");
		myProducts.add(p1);
		Products p2 = new Products();
		p2.setName("Honda");
		myProducts.add(p2);
		return myProducts;		
	}
}
