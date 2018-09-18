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

WebUI.waitForAngularLoad(5)

'Open Contacts list'
WebUI.click(findTestObject('Page_MPDX  Dashboard/a_Contacts'))

WebUI.waitForAngularLoad(5)

'Open Tasks List'
WebUI.click(findTestObject('Page_MPDX  Dashboard/a_Tasks'))

WebUI.waitForAngularLoad(5)

'Open Reports display'
WebUI.click(findTestObject('Page_MPDX  Dashboard/a_Reports'))

WebUI.waitForAngularLoad(5)

'Open Tools menu'
WebUI.click(findTestObject('Page_MPDX  Dashboard/a_Tools'))

WebUI.waitForAngularLoad(5)

'Open Coaching display'
WebUI.click(findTestObject('Page_MPDX  Dashboard/a_Coaching'))

WebUI.waitForAngularLoad(5)

'Open Help menu'
WebUI.click(findTestObject('Page_MPDX  Dashboard/a_Help'))

WebUI.waitForAngularLoad(5)

'Close Help menu'
WebUI.click(findTestObject('Page_MPDX  Dashboard/button_CloseHelp'))

