package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePage1 {
	public HomePage1() {
		PageFactory.initElements(FunctionalLibrary.driver, this);

	}
	
	@FindBy(xpath = "//span[text()='Round Trip']")
	private WebElement btnRoundTrip;
	@FindBy(id = "originCity")
	private WebElement btnOrigin;

	@FindBy(id = "destinationCity")
	private WebElement btnDest;

	@FindBy(id = "departureDate")
	private WebElement btndepartureDate;
	public WebElement getBtnRoundTrip() {
		return btnRoundTrip;
	}

	public void setBtnRoundTrip(WebElement btnRoundTrip) {
		this.btnRoundTrip = btnRoundTrip;
	}

	public WebElement getBtnOrigin() {
		return btnOrigin;
	}

	public void setBtnOrigin(WebElement btnOrigin) {
		this.btnOrigin = btnOrigin;
	}

	public WebElement getBtnDest() {
		return btnDest;
	}

	public void setBtnDest(WebElement btnDest) {
		this.btnDest = btnDest;
	}

	public WebElement getBtndepartureDate() {
		return btndepartureDate;
	}

	public void setBtndepartureDate(WebElement btndepartureDate) {
		this.btndepartureDate = btndepartureDate;
	}

	public WebElement getBtnreturnDate() {
		return btnreturnDate;
	}

	public void setBtnreturnDate(WebElement btnreturnDate) {
		this.btnreturnDate = btnreturnDate;
	}

	public WebElement getBtnExactDate() {
		return btnExactDate;
	}

	public void setBtnExactDate(WebElement btnExactDate) {
		this.btnExactDate = btnExactDate;
	}

	public WebElement getBtnFlexibleDays() {
		return btnFlexibleDays;
	}

	public void setBtnFlexibleDays(WebElement btnFlexibleDays) {
		this.btnFlexibleDays = btnFlexibleDays;
	}

	public WebElement getBtnMoney() {
		return btnMoney;
	}

	public void setBtnMoney(WebElement btnMoney) {
		this.btnMoney = btnMoney;
	}

	public WebElement getBtnMiles() {
		return btnMiles;
	}

	public void setBtnMiles(WebElement btnMiles) {
		this.btnMiles = btnMiles;
	}

	public WebElement getBtnPassengers() {
		return btnPassengers;
	}

	public void setBtnPassengers(WebElement btnPassengers) {
		this.btnPassengers = btnPassengers;
	}

	public WebElement getBtnFindFlight() {
		return btnFindFlight;
	}

	public void setBtnFindFlight(WebElement btnFindFlight) {
		this.btnFindFlight = btnFindFlight;
	}

	@FindBy(id = "returnDate")
	private WebElement btnreturnDate;

	@FindBy(xpath = "//span[text()='Exact Dates']")
	private WebElement btnExactDate;

	@FindBy(xpath = "//span[text()='Flexible Days']")
	private WebElement btnFlexibleDays;

	@FindBy(xpath = "//span[text()='Money']")
	private WebElement btnMoney;

	@FindBy(xpath = "//span[text()='Miles']")
	private WebElement btnMiles;

	@FindBy(xpath = "//span[@id='paxCount-button'])")
	private WebElement btnPassengers;

	@FindBy(id = "findFlightsSubmit")
	private WebElement btnFindFlight;






	
		

	}


