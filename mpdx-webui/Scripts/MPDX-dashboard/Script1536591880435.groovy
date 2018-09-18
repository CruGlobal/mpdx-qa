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

WebUI.click(findTestObject('Page_MPDX  Dashboard/a_Dashboard'))

not_run: WebUI.waitForElementClickable(findTestObject('Page_MPDX  Dashboard/commitment 1st gift not recvd'), 0)

'Connect - Add a new task button'
not_run: WebUI.click(findTestObject('Page_MPDX  Dashboard/a_Add a New Task'))

'Close the new task dialog'
not_run: WebUI.click(findTestObject('Page_MPDX  Dashboard/button_Cancel'))

not_run: WebUI.waitForAngularLoad(15)

'Show contacts whose first commitment gifts were not received'
not_run: WebUI.click(findTestObject('Page_MPDX  Dashboard/commitment 1st gift not recvd'))

not_run: WebUI.waitForAngularLoad(10)

not_run: WebUI.back()

not_run: WebUI.waitForElementClickable(findTestObject('Page_MPDX  Dashboard/commitment 30 days late'), 0)

'Show contacts whose commitments are over 30 days late'
not_run: WebUI.click(findTestObject('Page_MPDX  Dashboard/commitment 30 days late'))

not_run: WebUI.waitForAngularLoad(10)

not_run: WebUI.back()

not_run: WebUI.waitForElementClickable(findTestObject('Page_MPDX  Dashboard/commitment 60 days late'), 0)

'Show contacts whose commitments are over 60 days late'
not_run: WebUI.click(findTestObject('Page_MPDX  Dashboard/commitment 60 days late'))

not_run: WebUI.waitForAngularLoad(10)

not_run: WebUI.back()

not_run: WebUI.waitForElementClickable(findTestObject('Page_MPDX  Dashboard/commitment 90 days late'), 0)

'Show contacts whose commitments are over 90 days late'
not_run: WebUI.click(findTestObject('Page_MPDX  Dashboard/commitment 90 days late'))

not_run: WebUI.waitForAngularLoad(10)

not_run: WebUI.back()

WebUI.waitForElementClickable(findTestObject('Page_MPDX  Dashboard/button_Care Actions'), 0)

'Log newsletter'
WebUI.click(findTestObject('Page_MPDX  Dashboard/a_Care-Actions Log Newsletter'))

WebUI.waitForPageLoad(5)

not_run: WebUI.sendKeys(findTestObject('Page_MPDX  Dashboard/button_Care Actions'), 'KEY_CANCEL')

WebUI.back()

WebUI.waitForElementClickable(findTestObject(null), 0)

WebUI.click(findTestObject('Page_MPDX  Dashboard/button_Care Actions'))

'Export Physical newsletter addressees'
WebUI.click(findTestObject('Page_MPDX  Dashboard/a_Care Actions Export Physical'))

WebUI.waitForAngularLoad(10)

WebUI.back()

