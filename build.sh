#!/usr/bin/env bash

export ROOT_FOLDER=~/Projects/SpringTest/

cd ${ROOT_FOLDER}/configserver
./mvnw clean verify -Pprod dockerfile:build

cd ${ROOT_FOLDER}/eurekaserver
./mvnw clean verify -Pprod dockerfile:build

cd ${ROOT_FOLDER}/gateway
./mvnw clean verify -Pprod dockerfile:build

cd ${ROOT_FOLDER}/patient
./mvnw clean verify -Pprod dockerfile:build

cd ${ROOT_FOLDER}/configserver
docker tag config vitorbertazoli/config
docker push vitorbertazoli/config

cd ${ROOT_FOLDER}/eurekaserver
docker tag eureka vitorbertazoli/eureka
docker push vitorbertazoli/eureka

cd ${ROOT_FOLDER}/gateway
docker tag gateway vitorbertazoli/gateway
docker push vitorbertazoli/gateway

cd ${ROOT_FOLDER}/patient
docker tag patient vitorbertazoli/patient
docker push vitorbertazoli/patient
