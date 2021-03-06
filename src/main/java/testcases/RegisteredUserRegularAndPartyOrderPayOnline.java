package testcases;

import pages.HomePage;
//import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//This testcase is to check whether a Registered user is able to place a Regular and Party order with in $500
//using pay online option. Also check for the confirmation mail from the Restaurant.

public class RegisteredUserRegularAndPartyOrderPayOnline extends PeiweiWrappers{
	@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd,String num,String num1,String quantity,String date,String time,String cname,String cnum,String exdate,String cvv,String month,String Emailaddr, String Password,String txt) throws InterruptedException {

	new HomePage()
	.clickLogin()
	.enterEmailaddresslogin(emailadd)
	.enterPassword(pwd)
	.clickSubmit()
	.verifyMailId(emailadd)              //Verify EmailId
	.clickMenuAndOrder()
	.clickRiceAndNoodle()
	.clickJapeneseSteak()
	.enterQuantity(num)
	//.clickSize1()
	//.clickIngredient()
	//.clickServedWith2()
	.clickAddToOrder()
	.clickKeepLooking()
	.clickPartyMenu()
	.clickRiceAndNoodle()
	.clickPartyMangolian()
	.enterQuantity(num1)
	.clickIngredient()
	.clickAddToOrder()
	.clickCheckOut()
	.enterLettuce(quantity)
	.clickLettuceAddToOrder()
	.verifyMenuQuantity(num)           //Verify Menu Quantity
	.verifyPartyMenuQuantity(num1)     //Verify PartyMenu Quantity
	.verifyExtrasQuantity(quantity)    //Verify Extras Quantity	
    .clickCheckOut()
    .clickCalendar(date)
 // .clickNext()
 // .clickDate()
  .selectTime(time)
  .clickPayOnline()
  .clickPlaceOrder2()
  .enterName(cname)
  .enterCardNumber(cnum)
  .enterExpDate(exdate)
  .enterCvv(cvv)
  .clickPayWithCard()
  .verifydate(month)              //Verify Month
  .verifytime(time)               //Verify Time
  .InvokeGmail1()
  .enterEmailaddress(Emailaddr)
  .enterNext()
  .enterPassword(Password)
  .clickSignIn()
  .clickUnreadMail()
  .verifyText1(txt)              //Verify ConfirmationMail
;	}
@BeforeClass
public void beforeClass() {
dataSheetName="RegisteredUserRegularAndPartyOrderPayOnline";
browserName="chrome";
testCaseName="RegisteredUserRegularAndPartyOrderPayOnline";
testDescription="Check whether a Registered user is able to place a Regular and Party order and Pay Online";
}
}
