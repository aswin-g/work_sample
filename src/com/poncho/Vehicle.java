package com.poncho;

/**
 * @author Aswin Golla
 * This Class covers all the Vehicle details including Rego, State and Address
 *
 */
public class Vehicle extends Policy {
	
	String vehicleRegistration,
		   vehicleRegoState,
	       vehicleAddress1,
	       vehicleSuburb,
	       vehicleState,
	       vehiclePostcode,
	
	       vehicleDistanceTravelled,
		   vehicleDriversPerWeek,
		   vehicleDrivenEachYear,
		   vehicleUsagePurpose,
	
	       anyPerformanceModifications,
		   anyAccessoriesFittedByManufacturer,
		   anyAccessoriesNotFittedByManufacture,
		   anyUnrepairedAccident,
		   anyFinance;

	public String getVehicleRegistration() {
		return vehicleRegistration;
	}

	public void setVehicleRegistration(String vehicleRegistration) {
		this.vehicleRegistration = vehicleRegistration;
	}

	public String getVehicleRegoState() {
		return vehicleRegoState;
	}

	public void setVehicleRegoState(String vehicleRegoState) {
		this.vehicleRegoState = vehicleRegoState;
	}

	public String getVehicleAddress1() {
		return vehicleAddress1;
	}

	public void setVehicleAddress1(String vehicleAddress1) {
		this.vehicleAddress1 = vehicleAddress1;
	}

	public String getVehicleSuburb() {
		return vehicleSuburb;
	}

	public void setVehicleSuburb(String vehicleSuburb) {
		this.vehicleSuburb = vehicleSuburb;
	}

	public String getVehicleState() {
		return vehicleState;
	}

	public void setVehicleState(String vehicleState) {
		this.vehicleState = vehicleState;
	}

	public String getVehiclePostcode() {
		return vehiclePostcode;
	}

	public void setVehiclePostcode(String vehiclePostcode) {
		this.vehiclePostcode = vehiclePostcode;
	}

	public String getVehicleDistanceTravelled() {
		return vehicleDistanceTravelled;
	}

	public void setVehicleDistanceTravelled(String vehicleDistanceTravelled) {
		this.vehicleDistanceTravelled = vehicleDistanceTravelled;
	}

	public String getVehicleDriversPerWeek() {
		return vehicleDriversPerWeek;
	}

	public void setVehicleDriversPerWeek(String vehicleDriversPerWeek) {
		this.vehicleDriversPerWeek = vehicleDriversPerWeek;
	}

	public String getVehicleDrivenEachYear() {
		return vehicleDrivenEachYear;
	}

	public void setVehicleDrivenEachYear(String vehicleDrivenEachYear) {
		this.vehicleDrivenEachYear = vehicleDrivenEachYear;
	}

	public String getVehicleUsagePurpose() {
		return vehicleUsagePurpose;
	}

	public void setVehicleUsagePurpose(String vehicleUsagePurpose) {
		this.vehicleUsagePurpose = vehicleUsagePurpose;
	}

	public String getAnyPerformanceModifications() {
		return anyPerformanceModifications;
	}

	public void setAnyPerformanceModifications(String anyPerformanceModifications) {
		this.anyPerformanceModifications = anyPerformanceModifications;
	}

	public String getAnyAccessoriesFittedByManufacturer() {
		return anyAccessoriesFittedByManufacturer;
	}

	public void setAnyAccessoriesFittedByManufacturer(String anyAccessoriesFittedByManufacturer) {
		this.anyAccessoriesFittedByManufacturer = anyAccessoriesFittedByManufacturer;
	}

	public String getAnyAccessoriesNotFittedByManufacture() {
		return anyAccessoriesNotFittedByManufacture;
	}

	public void setAnyAccessoriesNotFittedByManufacture(String anyAccessoriesNotFittedByManufacture) {
		this.anyAccessoriesNotFittedByManufacture = anyAccessoriesNotFittedByManufacture;
	}

	public String getAnyUnrepairedAccident() {
		return anyUnrepairedAccident;
	}

	public void setAnyUnrepairedAccident(String anyUnrepairedAccident) {
		this.anyUnrepairedAccident = anyUnrepairedAccident;
	}

	public String getAnyFinance() {
		return anyFinance;
	}

	public void setAnyFinance(String anyFinance) {
		this.anyFinance = anyFinance;
	}
	
	
}