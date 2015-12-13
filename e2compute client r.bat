SET CLASSPATH=workspace\E2 Compute Engine Client\bin;e2shared.jar
java "-Djava.rmi.server.codebase=http://localhost:21632/jars/e2client.jar" client.ComputePi %1 %2