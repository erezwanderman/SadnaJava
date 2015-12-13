package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.time.Duration;
import java.time.Instant;
import java.math.BigDecimal;

import compute.Compute;

public class ComputePi {
    public static void main(String args[]) {
        try {
            String name = "Compute";
            Registry registry = LocateRegistry.getRegistry(args[0]);
            Compute comp = (Compute) registry.lookup(name);
            Pi task = new Pi(Integer.parseInt(args[1]));
            Instant start = Instant.now();
            BigDecimal pi = comp.executeTask(task);
            Duration elapsed = Duration.between(start, Instant.now());
            System.out.println(pi);
            System.out.println("This took " + elapsed.getSeconds() + "." + elapsed.getNano() + " seconds.");
        } catch (Exception e) {
            System.err.println("ComputePi exception:");
            e.printStackTrace();
        }
    }    
}
