package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewBtn;

@FindBy(xpath="//div[@class='item createNewCustomer']")
private WebElement newCustOptions;

@FindBy(xpath="//input[@type='text' and @class='inputFieldWithPlaceholder newNameField inputNameField']")
private WebElement enterCustnameTbx;

@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Enter Customer Description']")
private WebElement enterCustDecsTbx;

@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
private WebElement selectCustDD;

@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
private WebElement ourCompany;

@FindBy(xpath="//div[text()='Create Customer' and @class='components_button_label']")
private WebElement createCustBtn;

@FindBy(xpath="//div[@class='topContainer']/div[@class='leftContainer']")
private WebElement actualCustomer;

public TaskListPage(WebDriver driver){ 
PageFactory.initElements(driver, this);
}


public WebElement getAddNewBtn() {
	return addNewBtn;
}

public WebElement getNewCustOptions() {
	return newCustOptions;
}

public WebElement getEnterCustnameTbx() {
	return enterCustnameTbx;
}

public WebElement getEnterCustDecsTbx() {
	return enterCustDecsTbx;
}

public WebElement getSelectCustDD() {
	return selectCustDD;
}

public WebElement getOurCompany() {
	return ourCompany;
}

public WebElement getCreateCustBtn() {
	return createCustBtn;
}
public WebElement getActualCustomer() {
	return actualCustomer;
}


}
