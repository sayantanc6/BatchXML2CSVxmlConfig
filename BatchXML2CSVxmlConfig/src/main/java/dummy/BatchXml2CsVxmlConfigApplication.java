package dummy;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableBatchProcessing
@ImportResource("batch-config.xml")
public class BatchXml2CsVxmlConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchXml2CsVxmlConfigApplication.class, args);
	}

}
