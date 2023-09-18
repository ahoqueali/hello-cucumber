mvn clean package

java -classpath "target/test-classes:target/libs/*:."  io.cucumber.core.cli.Main "target/test-classes/" --glue hellocucumber
