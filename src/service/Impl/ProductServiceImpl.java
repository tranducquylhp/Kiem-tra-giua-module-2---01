package service.Impl;

import model.Product;
import repository.Impl.ProductRepositoryImpl;
import service.ProductService;

public class ProductServiceImpl implements ProductService {
    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    @Override
    public void show() {
        productRepository.show();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void edit(int index, Product product) {
        productRepository.edit(index, product);
    }

    @Override
    public void remove(int index) {
        productRepository.remove(index);
    }

    @Override
    public Product search(String name) {
        return productRepository.search(name);
    }

    @Override
    public void sortUpPrice() {
        productRepository.sortUpPrice();
    }

    @Override
    public void sortDownPrice() {
        productRepository.sortDownPrice();
    }

}
