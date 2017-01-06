package tao.tech.study.spring.springinaction.org.test.spittr.model;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Spittle{  
    private final Long id=System.currentTimeMillis();  
    private final String message;  
    private final Date time;  
    private Double latitude;  
    private Double longitude;  
  
    public Spittle(String message, Date time) {  
        this(message, time, null, null);  
    }  
  
    public Spittle(String message,Date time, Double latitude, Double longitude) {  
        //this.id = null;  
        this.time = time;  
        this.latitude = latitude;  
        this.longitude = longitude;  
        this.message = message;  
    }  
  
    public Spittle(Long id, String message, Date time, Double latitude,Double longitude) {
		super();
		//this.id = id;
		this.message = message;
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Long getId() {  
        return id;  
    }  
  
    public String getMessage() {  
        return message;  
    }  
  
    public Date getTime() {  
        return time;  
    }  
  
    public Double getLongitude() {  
        return longitude;  
    }  
  
    public Double getLatitude() {  
        return latitude;  
    }  
  
    /*
   	使用Apache Common Lang包来实现equals()和hashCode()方法。
   	这些方法除了常规的作用以外，当我们为控制器的处理器方法编写测试时，它们也是有用的。
     */
    @Override  
    public boolean equals(Object obj) {  
        return EqualsBuilder.reflectionEquals(this, obj,  
                new String[]{"message","latitude", "longitude"});  
    }  
  
    @Override  
    public int hashCode() {  
        return HashCodeBuilder.reflectionHashCode(this,  
                new String[]{"message", "latitude", "longitude"});  
    }  
}  
