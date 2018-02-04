# SpringCloudStream
Send and Receive messages with Spring Cloud Stream

This repository demonstrates Sending and Receiving messages using Spring  Cloud Platform. 


1. Download Apache Zookeeper from https://www.apache.org/dyn/closer.cgi/zookeeper/ 
2. Setup Zookeeper by following instructions mentioned here https://www.tutorialspoint.com/apache_kafka/apache_kafka_installation_steps.htm
3. Download Apache Kafka from https://kafka.apache.org/downloads
4. Extract Kafka and setup with the following steps
       `$ tar -xzf kafka_2.11-1.0.0.tgz
        $ cd kafka_2.11-1.0.0
        $ bin/kafka-server-start.sh config/server.properties
       `
5. if `bin/kafka-server-start.sh config/server.properties` throws error like this `Classpath is empty. Please build the project first e.g. by running './gradlew jar -Pscala_version=2.11.11'`, 
   follow below steps to fix
   
   a. `$ gradle`
   
   b. `$./gradlew jar -Pscala_version=2.11.11`
6. Now run `bin/kafka-server-start.sh config/server.properties`.
7. Open source code in eclipse and run app as spring boot app
   
