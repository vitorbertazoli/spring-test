# Example
Spring Cloud Config + Eureka + Gateway + micro-service

## building the images

    ./mvnw clean verify -Pprod dockerfile:build

## tagging the image

    docker tag config vitorbertazoli/config

## pushing the image

    docker push vitorbertazoli/config

## exposing the gateway URL

    minikube service gateway --url
    
## exposing the eureka page

    kubectl expose deployment eureka --type=LoadBalancer --name=my-eureka
    minikube service my-eureka --url