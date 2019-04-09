import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Page_Conductor Support Ticket/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Sign In with Auth0/input_or_password'), 5)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_Sign In with Auth0/input_or_email'), 'admin@conductor.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In with Auth0/input_or_password'), 'o6CDTymj93o=')

WebUI.click(findTestObject('Object Repository/Page_Sign In with Auth0/span_Log In'))

WebUI.verifyElementPresent(findTestObject('Page_Sign In with Auth0/span_Wrong email or password'), 5)

WebUI.closeBrowser()

