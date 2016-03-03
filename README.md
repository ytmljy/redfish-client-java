# redfish-client-java
Redfish 1.0 Java client code.

## Generating code
```
sudo apt-get install -y maven
git clone https://github.com/RackHD/on-http.git
git clone https://github.com/swagger-api/swagger-codegen.git
pushd ./swagger-codegen && mvn package && popd
java -jar ./swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar \
  generate -i on-http/static/redfish.yaml -o redfish-client-java -l java
```
NOTE: For redfish.yaml see https://github.com/RackHD/on-http/blob/master/static/redfish.yaml
