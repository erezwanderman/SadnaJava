export 'CLASSPATH=workspace/E2.1 Compute Engine Server/bin:e2shared.jar'
java -Djava.rmi.server.useCodebaseOnly=false -Djava.security.policy=e2.1server.policy -Djava.rmi.server.hostname=******PUT_IP_HERE****** engine.ComputeEngine

#-Djava.rmi.server.logCalls=true -Djava.rmi.server.exceptionTrace=true 
