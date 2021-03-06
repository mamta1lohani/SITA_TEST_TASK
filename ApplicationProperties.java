package aero.sita.springIntegration.task.numberFileReaderService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NonNull;

@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties
@Data
public class ApplicationProperties {
	ApplicationProperties() { 
	}

	@SuppressWarnings("unused")
	@NonNull
	@Value("${data_dir}")
	private String data_dir;

	@SuppressWarnings("unused")
	@NonNull
	@Value("${input_dir}")
	private String input_dir;

	@SuppressWarnings("unused")
	@NonNull
	@Value("${output_dir}")
	private String output_dir;

	@SuppressWarnings("unused")
	@NonNull
	@Value("${error_dir}")
	private String error_dir;

	@SuppressWarnings("unused")
	@NonNull
	@Value("${processed_dir}")
	private String processed_dir;
}
