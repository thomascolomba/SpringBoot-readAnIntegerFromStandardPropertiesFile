package readAnIntegerFromStandardPropertiesFile.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class MyConfigurationBean {
    private Integer myInteger;
	public Integer getMyInteger() {
		return myInteger;
	}
	public void setMyInteger(Integer myInteger) {
		this.myInteger = myInteger;
	}
}