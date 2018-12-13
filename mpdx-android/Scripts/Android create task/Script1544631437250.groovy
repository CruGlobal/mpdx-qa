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

Mobile.tap(findTestObject('android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton0 (1)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - enter a task subject'), 'Test task subject', 0)

Mobile.tap(findTestObject('android.widget.TextView4 - activity type'), 0)

Mobile.tap(findTestObject('android.widget.TextView12 - Text Message'), 0)

not_run: Mobile.tap(findTestObject('android.widget.TextView8 - date'), 0)

not_run: Mobile.tap(findTestObject('android.view.View18 - 18'), 0)

not_run: Mobile.tap(findTestObject('android.widget.Button1 - OK'), 0)

not_run: Mobile.tap(findTestObject('android.widget.EditText1 - add comment'), 0)

not_run: Mobile.setText(findTestObject('android.widget.EditText0 - add comment'), 'So what do you think of this task add test?', 
    0)

not_run: Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.TextView1 - ADD'), 0)

Mobile.switchToPortrait()

