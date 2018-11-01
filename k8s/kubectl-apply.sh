#!/bin/bash
# Files are ordered in proper order with needed wait for the dependent custom resource definitions to get initialized.
# Usage: bash kubectl-apply.sh

kubectl apply -f namespace.yml
kubectl apply -f config/
kubectl apply -f eureka/
kubectl apply -f gateway/
kubectl apply -f patient/
