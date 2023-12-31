import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.orangehrm.com/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/Orangehrm/Page_OrangeHRM HR Software  OrangeHRM/a_Solutions'))

WebUI.mouseOver(findTestObject('Orangehrm/Page_OrangeHRM HR Software  OrangeHRM/a_Solutions'))

WebUI.click(findTestObject('Object Repository/Orangehrm/Page_OrangeHRM HR Software  OrangeHRM/li_People Management                       _b93f54'))

WebUI.mouseOver(findTestObject('Orangehrm/Page_OrangeHRM HR Software  OrangeHRM/li_People Management                       _b93f54'))

WebUI.click(findTestObject('Object Repository/Orangehrm/Page_OrangeHRM HR Software  OrangeHRM/a_HR Administration'))

WebUI.click(findTestObject('Object Repository/Orangehrm/Page_HR Administration Software  OrangeHRM/button_Book a Free Demo'))

WebUI.closeBrowser()

