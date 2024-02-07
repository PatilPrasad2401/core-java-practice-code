package com.prasad.practice.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        StreamDemo streamDemo = new StreamDemo();
        List<Product> products = streamDemo.generateListData();

        //-----------------------------------------------------------
        // without streams
        List<Float> productPriceList = new ArrayList<Float>();
        for (Product product : products) {
            if (product.price() > 30000) {
                productPriceList.add(product.price());//adding product price to the list
            }
        }
        System.out.println("without streams" + productPriceList);

        List<Float> productPriceList1 = products.stream()
                .parallel()
                .filter(product -> product.price() > 30000)
                .map(product -> product.price())
                .toList();
//               .collect(Collectors.toList());
        System.out.println("with streams" + productPriceList1);

        Map<Integer, Product> productMap = streamDemo.generateMapData();

        System.out.println("----------------------");
        System.out.println("Entry processing without streams");
        Iterator<Map.Entry<Integer, Product>> iterator = productMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Product> entry = iterator.next();
            System.out.println("Key :" + entry.getKey() + "Value :" + entry.getValue());
        }
        System.out.println("--------------");
        System.out.println("Entry processing with stream");
        productMap.entrySet().parallelStream().forEach(entry -> {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        });
        System.out.println("Map processed with streams" + productMap);

        System.out.println("--------------------------");
        Set<Product> newFilteredProductList = productMap.entrySet()
                .stream().filter(entry -> entry.getKey() < 5)
                .map(Map.Entry::getValue)
                .limit(3).
                collect(Collectors.toSet());
        System.out.println("Set with streams" + newFilteredProductList);
    }
    private List<Product> generateListData () {
    List<Product>products=new ArrayList<>();
        products.add(new Product(1, "HP Laptop", 25000f));
        products.add(new Product(2, "Dell Laptop", 30000f));
        products.add(new Product(3, "Lenevo Laptop", 28000f));
        products.add(new Product(4, "Sony Laptop", 28000f));
        products.add(new Product(5, "Apple Laptop", 90000f));
        return products;
    }
    private Map<Integer, Product> generateMapData() {
        return generateListData().stream().collect(Collectors.toMap(Product::id, Function.identity()));
    }
    }