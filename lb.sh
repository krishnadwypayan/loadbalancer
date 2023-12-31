#!/bin/bash
docker run -p 80:8080 -p 9000:9000 krishnadwypayan/lb-service
docker run -p 8090:8090 -p 9001:9001 krishnadwypayan/backend-service