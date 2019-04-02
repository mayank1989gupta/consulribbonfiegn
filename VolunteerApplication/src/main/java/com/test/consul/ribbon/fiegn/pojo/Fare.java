/**
 * 
 */
package com.test.consul.ribbon.fiegn.pojo;

/**
 * @author MGupta
 *
 */
public class Fare {

	private Long nightSurcharge;
    private Long rideFare;

    public Fare() {
        nightSurcharge = 0L;
        rideFare = 0L;
    }

	/**
	 * @return the nightSurcharge
	 */
	public Long getNightSurcharge() {
		return nightSurcharge;
	}

	/**
	 * @param nightSurcharge the nightSurcharge to set
	 */
	public void setNightSurcharge(Long nightSurcharge) {
		this.nightSurcharge = nightSurcharge;
	}

	/**
	 * @return the rideFare
	 */
	public Long getRideFare() {
		return rideFare;
	}

	/**
	 * @param rideFare the rideFare to set
	 */
	public void setRideFare(Long rideFare) {
		this.rideFare = rideFare;
	}
	
	public Long getTotalFare() {
        return nightSurcharge + rideFare;
    }
}
