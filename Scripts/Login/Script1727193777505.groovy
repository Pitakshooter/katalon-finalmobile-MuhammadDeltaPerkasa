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

Mobile.startApplication('apk/Advdemo.apk', false)

Mobile.verifyElementExist(findTestObject('View Menu'), 0)

Mobile.tap(findTestObject('View Menu'), 0)

Mobile.tap(findTestObject('Go to Login Page'), 0)

Mobile.verifyElementExist(findTestObject('Login/Username'), 0)

Mobile.setText(findTestObject('Login/Username'), username, 0)

Mobile.setText(findTestObject('Login/Password'), password, 0)

Mobile.tap(findTestObject('Login/Login Button'), 0)

if (testype == 'N') {
    Mobile.verifyElementExist(findTestObject('Login/Notif gagal login'), 0)
} else {
    Mobile.verifyElementExist(findTestObject('Login/Pesan Notif'), 0)
}

Mobile.closeApplication()

