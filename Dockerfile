FROM airhacks/glassfish
COPY ./target/car_management.war ${DEPLOYMENT_DIR}
