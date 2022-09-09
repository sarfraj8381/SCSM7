package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("CreateCustomer");
		FileLib f=new FileLib();
		String custName = f.getExcelData("CreateCustomer", 1, 2);
		String custDest = f.getExcelData("CreateCustomer", 1, 3);
		
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTaskTab();
		
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustOptions().click();
		t.getEnterCustnameTbx().sendKeys(custName);
		t.getEnterCustDecsTbx().sendKeys(custDest);
		t.getSelectCustDD().click();
		Thread.sleep(3000);
		t.getOurCompany().click();
		Thread.sleep(3000);
		t.getCreateCustBtn().click();
		Thread.sleep(3000);
		String text = t.getActualCustomer().getText();
		Assert.assertEquals(text, custName);
	}
}
