package com.kms.katalon.keyword.codemirror

import org.openqa.selenium.Keys
import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.time.Duration
import java.time.LocalTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

import org.apache.commons.lang3.time.DateUtils
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory

import groovy.transform.CompileStatic

public class CodeMirrorKeywords {

	/**
	 * Set text to the CodeMirror editor
	 *
	 * @param value the value to set to the CodeMirror editor
	 */
	@CompileStatic
	@Keyword
	public static void setText(String value) {
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement codeMirror = driver.findElement(By.xpath("//div[contains(@class,'CodeMirror ')]"))
		JavascriptExecutor js = ((driver) as JavascriptExecutor)
		js.executeScript(('arguments[0].CodeMirror.setValue("' + value) + '");', codeMirror)
	}

	/**
	 * Get text of the CodeMirror editor
	 *
	 */
	@CompileStatic
	@Keyword
	public static String getText() {
		WebDriver driver = DriverFactory.getWebDriver()
		return driver.findElement(By.xpath("//*[contains(@class,'CodeMirror ')]")).getText()
	}

	/**
	 * Clear text to the CodeMirror editor
	 *
	 */
	@CompileStatic
	@Keyword
	public static String clearText() {
		setText("")
	}
}
