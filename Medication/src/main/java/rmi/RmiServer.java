package rmi;

import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiServiceExporter;
import com.example.springdemo.repositories.MedicationPlanRepository;

public class RmiServer {
	
    
	/*private final MedicationPlanService medicationPlanService;
	 
	 @Autowired
	    public RmiServer(MedicationPlanService medicationPlanService) {
	        this.medicationPlanService = medicationPlanService;
	    }*/
    
	@Bean 
    RmiServiceExporter exporter(MedicationPlanRepository implementation) {

        // Expose a service via RMI. Remote obect URL is:
        // rmi://<HOST>:<PORT>/<SERVICE_NAME>
        // 1099 is the default port

        Class<MedicationPlanRepository> serviceInterface = MedicationPlanRepository.class;
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceInterface(serviceInterface);
        exporter.setService(implementation);
        exporter.setServiceName("hei");
        exporter.setRegistryPort(1099);
        return exporter;
    }
}