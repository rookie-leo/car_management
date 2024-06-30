# Build
mvn clean package && docker build -t org.learning_java_ee/car_management .

# RUN

docker rm -f car_management || true && docker run -d -p 8080:8080 -p 4848:4848 --name car_management org.learning_java_ee/car_management 