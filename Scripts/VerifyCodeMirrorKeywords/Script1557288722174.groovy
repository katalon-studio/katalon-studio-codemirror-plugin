import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://codemirror.net/')

//set text to the CodeMirror
CustomKeywords.'com.kms.katalon.keyword.codemirror.CodeMirrorKeywords.setText'('Code Mirror text')

//get text of the CodeMirror editor
KeywordUtil.logInfo(CustomKeywords.'com.kms.katalon.keyword.codemirror.CodeMirrorKeywords.getText'())

//clear text of the CodeMirror editor
KeywordUtil.logInfo(CustomKeywords.'com.kms.katalon.keyword.codemirror.CodeMirrorKeywords.clearText'())





