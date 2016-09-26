package za.co.ebear.spring.io.authentication.demo.base;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class LogModel {

	@Column(columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Timestamp logTime;
	
	@Column(columnDefinition = "VARCHAR(255) NOT NULL")
	private String logUser;

	public LogModel() {}
	
	public LogModel(LogRecord log) {
		super();
		this.logUser = log.getLogUser();
	}

	public Timestamp getLogTime() {
		return logTime;
	}

	public void setLogTime(Timestamp logTime) {
		this.logTime = logTime;
	}

	public String getLogUser() {
		return logUser;
	}

	public void setLogUser(String logUser) {
		this.logUser = logUser;
	}

}
