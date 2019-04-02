/**
 * 
 */
package com.test.consul.ribbon.fiegn.pojo;

/**
 * @author MGupta
 *
 */
public class TaxiRide {

	private Boolean isNightSurcharge;
    private Long distanceInMile;
	/**
	 * @return the isNightSurcharge
	 */
	public Boolean getIsNightSurcharge() {
		return isNightSurcharge;
	}
	/**
	 * @param isNightSurcharge the isNightSurcharge to set
	 */
	public void setIsNightSurcharge(Boolean isNightSurcharge) {
		this.isNightSurcharge = isNightSurcharge;
	}
	/**
	 * @return the distanceInMile
	 */
	public Long getDistanceInMile() {
		return distanceInMile;
	}
	/**
	 * @param distanceInMile the distanceInMile to set
	 */
	public void setDistanceInMile(Long distanceInMile) {
		this.distanceInMile = distanceInMile;
	}
}
