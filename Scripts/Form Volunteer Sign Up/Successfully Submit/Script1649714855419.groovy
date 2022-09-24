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

WebUI.openBrowser(null)

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(5)

WebUI.setText(findTestObject('Volunter Sign Up/input_First Name'), FirstName)

WebUI.setText(findTestObject('Volunter Sign Up/input_Last Name'), LastName)

WebUI.setText(findTestObject('Volunter Sign Up/input_Phone'), Phone)

WebUI.setText(findTestObject('Volunter Sign Up/input_Country'), Country)

WebUI.setText(findTestObject('Volunter Sign Up/input_City'), City)

WebUI.setText(findTestObject('Volunter Sign Up/input_Email Address'), EmailAddress)

WebUI.click(findTestObject('Volunter Sign Up/Gender/select_Male'))

WebUI.check(findTestObject('Volunter Sign Up/Days/checkbox_Monday'))

WebUI.check(findTestObject('Volunter Sign Up/Days/checkbox_Wednesday'))

WebUI.check(findTestObject('Volunter Sign Up/Days/checkbox_Saturday'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Volunter Sign Up/select_Best Time'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Volunter Sign Up/upload_Files'), 'C:\\Users\\pbs-maulana\\Documents\\Bahan gambar produk seller')

WebUI.delay(5)

WebUI.click(findTestObject('Volunter Sign Up/btn_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.closeBrowser()

