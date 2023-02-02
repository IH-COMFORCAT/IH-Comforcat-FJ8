package com.ironhack.lab406.Services;

import com.ironhack.lab406.DTO.ProductDTO;
import com.ironhack.lab406.Repositories.DepartmentRepository;
import com.ironhack.lab406.Repositories.ProductRepository;
import com.ironhack.lab406.models.Department;
import com.ironhack.lab406.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public Product createNewProduct(ProductDTO productDTO){
        Department department = departmentRepository.findById(productDTO.getDepartmentId())
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "The department does not exist"));

        return productRepository.save(new Product(department, productDTO.getName(), productDTO.getQuantity()));
    }

    public Product decreaseProductQuantity(Integer productId, Integer quantity){
        Product product = productRepository.findById(productId)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "The product does not exist"));
        if(product.getQuantity() < quantity) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Not enough stock");
        product.setQuantity(product.getQuantity() - quantity);
        return productRepository.save(product);

    }

    public List<Product> findProductByDepartment(String department){
        if(department == null || department.isEmpty() || !departmentRepository.findByDepartment(department).isPresent()){
            return productRepository.findAll();
        }
        return productRepository.findByDepartmentDepartment(department);
    }

    public Product findProductById(Integer id){
        return productRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "product deoes not exist"));
    }

    public void deleteProductById(Integer id){
        productRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "product does not exist"));
        productRepository.deleteById(id);
    }


}
