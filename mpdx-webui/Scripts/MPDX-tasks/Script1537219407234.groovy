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

WebUI.click(findTestObject('Page_MPDX  Dashboard/a_Tasks'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/a_Log Task (1)'))

WebUI.setText(findTestObject('Object Repository/Page_MPDX  Tasks/input_Search Task (1)'), 'katalon-task')

WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/span_Search Task Execute (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/a_Log Task (1)'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Tasks/input_Task Name_subject (1)'), 'Katalon test')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/input_Select an Option_chosen-'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/em_To Do (1)'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Tasks/input_Contacts_input ng-pristi'), 'A')

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Tasks/input_Contacts_input ng-untouc'), 'Automator')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/em_Automator'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/div_Add a tag (1)'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Tasks/input_Tags_input ng-pristine n'), 'katalon-task')

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Tasks/input_Tags_input ng-untouched'), 'katalon-task')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/em_katalon-task'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/b (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/li_Done (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/b_1'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/b_2'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/b_3'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Tasks/textarea_Comment_comment (1)'), 'final comment')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/button_Save (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/a_Add Task (1)'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Tasks/input_Task Name_subject (1)'), 'New Katalon task')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/span_Select an Action'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/li_Thank'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/div_Add a tag (1)'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Tasks/input_Tags_input ng-pristine n'), 'katalon-')

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Tasks/input_Tags_input ng-untouched'), 'katalon-task')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/em_katalon-task'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Tasks/textarea_Comment_comment (1)'), 'final comment')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/button_Save (1)'))

'complete task\n'
not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/i_Sep 10_far fa-circle'))

'complete task dialog'
not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Tasks/textarea_Add New Comment_comme'), 'closing comment')

'complete task save'
not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/button_Save (1)'))

WebUI.click(findTestObject('Page_MPDX  Tasks/div_Today_select-box icon-fixe'))

WebUI.waitForElementClickable(findTestObject('Page_MPDX  Tasks/a_Actions'), 5)

WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/a_Actions'))

WebUI.waitForElementClickable(findTestObject('Page_MPDX  Tasks/a_Edit Tasks'), 5)

WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/a_Edit Tasks'))

WebUI.waitForElementClickable(findTestObject('Page_MPDX  Tasks/textarea_Add New Comment_comme'), 5)

WebUI.setText(findTestObject('Object Repository/Page_MPDX  Tasks/textarea_Add New Comment_comme'), 'new comment')

WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/button_Save (1)'))

