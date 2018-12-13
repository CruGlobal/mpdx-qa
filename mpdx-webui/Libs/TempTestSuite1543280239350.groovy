import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/MPDX In-n-out')

suiteProperties.put('name', 'MPDX In-n-out')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/bob.buford/Data/mpdx/mpdx-qa/mpdx-webui/Reports/MPDX In-n-out/20181126_165719/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/MPDX In-n-out', suiteProperties, [new TestCaseBinding('Test Cases/MPDX-login-localhost', 'Test Cases/MPDX-login-localhost',  null), new TestCaseBinding('Test Cases/MPDX-dashboard', 'Test Cases/MPDX-dashboard',  null), new TestCaseBinding('Test Cases/MPDX-logout', 'Test Cases/MPDX-logout',  null)])
