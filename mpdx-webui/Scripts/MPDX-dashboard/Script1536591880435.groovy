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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://localhost:8080/')

WebUI.click(findTestObject('Page_MPDX  Dashboard/a_Dashboard'))

WebUI.click(findTestObject('Page_MPDX  Dashboard/a_Contacts'))

WebUI.click(findTestObject('Object Repository/Page_MPDX  Contacts/a_Tasks'))

WebUI.click(findTestObject('Object Repository/Page_MPDX  Tasks/a_Reports'))

WebUI.click(findTestObject('Object Repository/Page_MPDX  Reports - Donations/a_Tools'))

WebUI.click(findTestObject('Object Repository/Page_MPDX  Tools/a_Coaching'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/a_Add'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/a_Add Contact'))

not_run: WebUI.switchToWindowTitle('Great Debate 2 [VIE] - AMS')

not_run: WebUI.click(findTestObject('Object Repository/Page_Great Debate 2 VIE - AMS/div_Quality_AxiomMediaFullCont'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Great Debate 2 VIE - AMS/div_Quality_AxiomMediaFullCont'))

not_run: WebUI.switchToWindowTitle('MPDX | Coaching Accounts')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/button_Cancel'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/a_Add'))

not_run: WebUI.click(findTestObject('Page_MPDX  Tasks/button_Cancel'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/a_Multiple Contacts'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/a_Add'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/a_Add Donation'))

not_run: WebUI.click(findTestObject('Page_MPDX  Tasks/button_Cancel'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/a_Add'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/a_Add Task'))

not_run: WebUI.click(findTestObject('Page_MPDX  Tasks/button_Cancel'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/a_Add'))

not_run: WebUI.click(findTestObject('Page_MPDX  Coaching Accounts/a_Log Task'))

not_run: WebUI.click(findTestObject('Page_MPDX  Tasks/button_Cancel'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/input_Task Name_subject'), '')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/span_Select an Option'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/b'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/b'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/input_Select an Option_chosen-'), 
    'News')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/span_Newsletter - Physical'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/input_Task Name_subject'), '`')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/span_Due Date  Time_input-grou'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/span_Due Date  Time_input-grou'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/i_Due Date  Time_far fa-calend'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/div_Add a contact'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/div_Add a tag'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/input_Notify me_notification_t'), 
    '1')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/a_Add'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/a_Log Task'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/input_Task Name_subject'), '')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/span_Select an Option'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/input_Select an Option_chosen-'), 
    '')

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/input_Completed On_dp_4514'), '11/06/2018')

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/input_Completed On_tp_4514'), '12:05 PM')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/div_Add a contact'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/i_Completed On_far fa-clock'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/span_Completed On_input-group-'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/span_Completed On_input-group-'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/span_Completed On_input-group-'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/div_Add a tag'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/span_Attempted - Left Message'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/li_Attempted - Left Message'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/span_Select an Option'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/li_Text Message'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/textarea_Comment_comment'), '`')

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/button_Cancel'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/a_Jeff DePree'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/div_5.0 Complete'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/div_Primary Appeal Progress_pr'))

not_run: WebUI.click(findTestObject('Object Repository/Page_MPDX  Coaching Accounts/a_See Details'))

not_run: WebUI.switchToWindowTitle('1 Hour Reminder - bob.buford@cru.org - Cru Mail')

not_run: WebUI.click(findTestObject('Object Repository/Page_1 Hour Reminder - bob.bufordcr/div_Move to'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_1 Hour Reminder - bob.bufordcr/input_ListsCru-WorkAppsqTest_b'), 
    'q')

not_run: WebUI.setText(findTestObject('Object Repository/Page_1 Hour Reminder - bob.bufordcr/input_ListsCru-WorkProjectsAdo'), 
    'qa')

not_run: WebUI.setText(findTestObject('Object Repository/Page_1 Hour Reminder - bob.bufordcr/input_ListsCru-WorkProjectsQAQ'), 
    'qaw')

not_run: WebUI.click(findTestObject('Object Repository/Page_1 Hour Reminder - bob.bufordcr/div_Email not displaying corre'))

