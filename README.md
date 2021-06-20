# Shopping App
[![Build](https://github.com/anuruddhal/shopping-app/actions/workflows/docker_workflow.yaml/badge.svg)](https://github.com/anuruddhal/shopping-app/actions/workflows/docker_workflow.yaml)

## UML Diagram

![alt tag](./images/uml.png)

## Assumptions
1. Shipment Cost is a constant.
2. Tax is not included in the product price.
3. Vat is calculated using following formula:
```
vat = sum(product_tax*product_quantity);
```   
4. Shopping Cart Total is calculated using following formula:
```
total = (product_price*quantity)+vat+shipping_cost;
```


## How to Build and Run
1. This project uses jdk8 and maven.
1. Run following maven command to build the project in the shopping-app folder.
```bash
$ mvn clean install
```
3. Run the executable jar file to start the program.
```bash
$ java -jar ./target/shopping-app-1.0-SNAPSHOT.jar
Customer{ name='John Doe',shoppingCart=Optional[ShoppingCart{total=207.5, vat=7.5, shipmentCost=50.0, productList={Product{, title='Rice', name='Samba Rice', price=100.0, tax=5.0}=1.5}}]}
Customer{ name='Jane Doe',shoppingCart=Optional[ShoppingCart{total=376.0, vat=25.0, shipmentCost=50.0, productList={Product{, title='Dal', name='Red Dal', price=100.5, tax=10.0}=2.0, 
Product{, title='Rice', name='Samba Rice', price=100.0, tax=5.0}=1.0}}]}
```

## How Run with Docker
1. The application is available at [Dockerhub](https://hub.docker.com/r/anuruddhal/shopping-app).
1. The github workflow fill build and push a Docker image for each merge.    
1. Execute the following command to run the application in Docker.
```bash
docker run anuruddhal/helloworld2:v1
```