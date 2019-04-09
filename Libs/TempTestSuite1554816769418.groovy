import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Login')

suiteProperties.put('name', 'Login')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\thadd\\Documents\\GitHub\\conductor-selenium\\Reports\\Login\\20190409_213249\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Login', suiteProperties, [new TestCaseBinding('Test Cases/Authentication/AdminLoginPass', 'Test Cases/Authentication/AdminLoginPass',  null), new TestCaseBinding('Test Cases/Authentication/AdminWrongPasswordFail', 'Test Cases/Authentication/AdminWrongPasswordFail',  null), new TestCaseBinding('Test Cases/Authentication/BaLoginPass', 'Test Cases/Authentication/BaLoginPass',  null), new TestCaseBinding('Test Cases/Authentication/BaWrongPasswordFail', 'Test Cases/Authentication/BaWrongPasswordFail',  null), new TestCaseBinding('Test Cases/Authentication/Client2LoginPass', 'Test Cases/Authentication/Client2LoginPass',  null), new TestCaseBinding('Test Cases/Authentication/Client2WrongPasswordFail', 'Test Cases/Authentication/Client2WrongPasswordFail',  null), new TestCaseBinding('Test Cases/Authentication/ClientLoginPass', 'Test Cases/Authentication/ClientLoginPass',  null), new TestCaseBinding('Test Cases/Authentication/ClientWrongPasswordFail', 'Test Cases/Authentication/ClientWrongPasswordFail',  null), new TestCaseBinding('Test Cases/Authentication/DevLoginPass', 'Test Cases/Authentication/DevLoginPass',  null), new TestCaseBinding('Test Cases/Authentication/DevWrongPasswordFail', 'Test Cases/Authentication/DevWrongPasswordFail',  null), new TestCaseBinding('Test Cases/Authentication/TesterLoginPass', 'Test Cases/Authentication/TesterLoginPass',  null), new TestCaseBinding('Test Cases/Authentication/TesterWrongPasswordFail', 'Test Cases/Authentication/TesterWrongPasswordFail',  null)])
