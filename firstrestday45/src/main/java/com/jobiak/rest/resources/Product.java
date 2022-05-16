package com.jobiak.rest.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class Product {
@GetMapping
public String showCatalog() {
	return new String("Samsung E2FH,Dual camera,32GB,4999,i got you");
}
@GetMapping("/intro")
public String introduction() {
	return new String("Hi this is #1 model in Asia");
}
@GetMapping("/search/{modelId}")
public String searchModel(@PathVariable(value="modelId") String modelId) {
	return new String(modelId+"is available in blue and black colors");
}
@GetMapping("/search/{modelId}/{name}")
public String searchName(@PathVariable String modelId ,@PathVariable String name) {
	return modelId+"is the model "+name+" is available " ;
}

}
