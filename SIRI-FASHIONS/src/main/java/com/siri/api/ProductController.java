package com.siri.api;

import com.siri.entity.Product;
import com.siri.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";  // JSP page
    }

    @GetMapping("/products/{id}")
    public String productDetails(@PathVariable Long id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "product_details";  // JSP page
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";  // JSP page
    }

    @PostMapping("/authenticate")
    public String authenticateUser(@RequestParam String username, @RequestParam String password) {
        // Authenticate the user and return a JWT token
        // Redirect based on success or failure
        return "redirect:/products";
    }
}
