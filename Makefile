.PHONY: prom clean

prom:
	mvn clean package -DskipTests
	bash build.sh

clean:
	mvn clean
	rm -rf target/*
	rm -rf cicd/release
