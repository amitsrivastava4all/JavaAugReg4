import java.util.HashMap;
import java.util.Map;

public class DomainInfo {
	private String ip;

	private String country_code;
	private String country_name;
	private String regionCode;
	private String regionName;
	private String city;
	private String zipCode;
	private String timeZone;
	private Double latitude;
	private Double longitude;
	private Integer metroCode;
	
	

	@Override
	public String toString() {
		return "DomainInfo [ip=" + ip + ", countryCode=" + country_code + ", countryName=" + country_name
				+ ", regionCode=" + regionCode + ", regionName=" + regionName + ", city=" + city + ", zipCode="
				+ zipCode + ", timeZone=" + timeZone + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", metroCode=" + metroCode + "]";
	}

	public String getIp() {
		return ip;
		}

		public void setIp(String ip) {
		this.ip = ip;
		}

	

	public String getCountry_code() {
			return country_code;
		}

		public void setCountry_code(String country_code) {
			this.country_code = country_code;
		}

	

	public String getCountry_name() {
			return country_name;
		}

		public void setCountry_name(String country_name) {
			this.country_name = country_name;
		}

	public String getRegionCode() {
	return regionCode;
	}

	public void setRegionCode(String regionCode) {
	this.regionCode = regionCode;
	}

	public String getRegionName() {
	return regionName;
	}

	public void setRegionName(String regionName) {
	this.regionName = regionName;
	}

	public String getCity() {
	return city;
	}

	public void setCity(String city) {
	this.city = city;
	}

	public String getZipCode() {
	return zipCode;
	}

	public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
	}

	public String getTimeZone() {
	return timeZone;
	}

	public void setTimeZone(String timeZone) {
	this.timeZone = timeZone;
	}

	public Double getLatitude() {
	return latitude;
	}

	public void setLatitude(Double latitude) {
	this.latitude = latitude;
	}

	public Double getLongitude() {
	return longitude;
	}

	public void setLongitude(Double longitude) {
	this.longitude = longitude;
	}

	public Integer getMetroCode() {
	return metroCode;
	}

	public void setMetroCode(Integer metroCode) {
	this.metroCode = metroCode;
	}

	


}
