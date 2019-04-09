import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\thadd\\AppData\\Local\\Temp\\Katalon\\20190409_234910\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'http://localhost:3000/\')\n\nWebUI.click(findTestObject(\'Page_Conductor Support Ticket/button_Login\'))\n\nWebUI.verifyElementPresent(findTestObject(\'Page_Sign In with Auth0/input_or_password\'), 5)\n\nWebUI.delay(1)\n\nWebUI.setText(findTestObject(\'Page_Sign In with Auth0/input_or_email\'), \'client@conductor.com\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_Sign In with Auth0/input_or_password\'), \'zjPxhPuRQFuVYAs0Abtybw==\')\n\nWebUI.click(findTestObject(\'Page_Sign In with Auth0/span_Log In\'))\n\nWebUI.click(findTestObject(\'Page_Conductor Support Ticket/a_Create Ticket\'))\n\nWebUI.click(findTestObject(\'Page_Conductor Support Ticket/div_Select\'))\n\nWebUI.click(findTestObject(\'Page_Conductor Support Ticket/div_API DevOps\'))\n\nWebUI.setText(findTestObject(\'Page_Conductor Support Ticket/input_Title_title\'), \'testing title\')\n\nWebUI.setText(findTestObject(\'Page_Conductor Support Ticket/textarea_Your Message_description\'), \'testing description\')\n\nWebUI.click(findTestObject(\'Page_Conductor Support Ticket/button_Submit\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

