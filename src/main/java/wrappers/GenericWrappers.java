package wrappers;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {

public static RemoteWebDriver driver;

public static Properties prop;


public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					driver = new ChromeDriver(); 
			} else if (browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println("The browser "+browser+" is launched with the given url "+url+" successfully.");
			reportStep("The browser " +browser+ " is launched with the given url " +url+ " successfully.", "PASS");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to session not created error. ");
			reportStep("The browser " +browser+ " is not launched due to session not created error. ", "FAIL");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched as the url does not contain http/https. ");
			reportStep("The browser " +browser+ " is not launched as the url does not contain http/https. ", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to unknown error. ");
			reportStep("The browser " +browser+ " is not launched due to unknown error.", "FAIL");
		}finally {
			
			takeSnap();
		}
         
		} 
		
			
	@Override
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		 
		try {
			
			driver.findElementById(idValue).sendKeys(data);
		//	System.out.println("The element with id "+idValue+" is entered with data "+data+" successfully. ");
			reportStep("The element with id " +idValue+ " is entered with data  " +data+ " successfully. ", "PASS");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the DOM "+data);
			reportStep("The element with id " +idValue+ " is not found in the DOM " +data, "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id " +idValue+" is not visible in the application. ");
			reportStep("The element with id " +idValue+ " is not visible in the application. ", "FAIL");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not intractable in the application. ");
			reportStep("The element with id " +idValue+ " is not intractable in the application. ", "FAIL");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the application. ");
			reportStep("The element with id " +idValue+ " is not stable in the application. ", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unknown error.");
			reportStep("The element with id " +idValue+ " is not entered with data " +data+ " due to unknown error.", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data "+data+" successfully.");
            reportStep("The element with name "+nameValue+" is entered with data "+data+" successfully.","PASS");

		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
          //  System.err.println("The element with name "+nameValue+" is not found in the DOM "+data);
			reportStep("The element with name "+nameValue+" is not found in the DOM .", "FAIL");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with name "+nameValue+" is not visible in the application.");
			reportStep("The element with name "+nameValue+" is not visible in the application", "FAIL");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not intractable in the application.");
			reportStep("The element with name "+nameValue+" is not intractable in the application", "FAIL");
		}catch (StaleElementReferenceException e) {
			//System.err.println("the element with name "+nameValue+" is not stable in the application ");
			reportStep("The element with name "+nameValue+" is not stable in the application ", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error.");
			reportStep("The element with name "+nameValue+" is not entered with data  "+data+" due to unknown error", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+" is entered with data "+data+" successfully. " );
			reportStep("The element with xpath "+xpathValue+" is entered with data "+data+" successfully. ", "PASS");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("the element with xpath "+xpathValue+" is not found in the DOM ");
			reportStep("The element with xpath "+xpathValue+" is not found in the DOM ", "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("the element with xpath "+xpathValue+" is not visible in the application ");
			reportStep("The element with xpath "+xpathValue+" is not visible in the application ", "FAIL");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application. ");
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application. ", "FAIL");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("the element with xpath "+xpathValue+" is not stable in the application ");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application ", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error.");
			reportStep("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error.", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualtitle = driver.getTitle();
			if (actualtitle.equals(title)) {
				//System.out.println("The title of the page "+actualtitle+" is matched with excepted title "+title+" successfully. ");
				reportStep("The title of the page "+actualtitle+" is matched with excepted title "+title+" successfully. ", "PASS");
			} else {
				//System.err.println("The title of the page "+actualtitle+" is not matched with exceptes title "+title);
				reportStep("The title of the page "+actualtitle+" is not matched with exceptes title "+title, "FAIL");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the browser "+title+" is not verified due to unknown error. ");
			reportStep("The title of the browser "+title+" is not verified due to unknown error. ", "FAIL");
		}finally {
			takeSnap();
		}
		
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext = driver.findElementById(id).getText();
			if (actualtext.equals(text)) {
				//System.out.println("The element with id "+id+" is holding the text "+actualtext+" is matched with excepted text "+text+" successfully. ");
				reportStep("The element with id "+id+" is holding the text "+actualtext+" is matched with excepted text "+text+" successfully. ", "PASS");
			} else {
			    //System.err.println("The element with id "+id+" is holding the text "+actualtext+" is not matched with excepted text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualtext+" is not matched with excepted text "+text, "FAIL");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM "+text);
			reportStep("The element with id "+id+" is not found in the DOM "+text, "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application. ");
			reportStep("The element with id "+id+" is not visible in the application. ", "FAIL");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application. ");
			reportStep("The element with id "+id+" is not interactable in the application. ", "FAIL");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application. ");
			reportStep("The element with id "+id+" is not stable in the application. ", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not verified text "+text+" due to unknown error. ");
			reportStep("The element with id "+id+" is not verified text "+text+" due to unknown error. ", "FAIL");
		}
		finally {
			takeSnap();
		}
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualxpath = driver.findElementByXPath(xpath).getText();
			if (actualxpath.equals((text))) {
				//System.out.println("the element with xpath "+xpath+" is holding the text "+actualxpath+" is matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualxpath+" is matched with expected text "+text, "PASS");
			}else {
				//System.err.println("the element with xpath "+xpath+" is holding the text "+actualxpath+" is not matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualxpath+" is not matched with expected text "+text, "FAIL");
			}
			
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("the element with xpath "+xpath+" is holding the text "+text+" is not verified as there is no such element in DOM. ");
			reportStep("The element with xpath "+xpath+" is holding the text "+text+" is not verified as there is no such element in DOM. ", "FAIL");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
				//System.err.println("the element with xpath "+xpath+" is holding the text "+text+" is not verified as the element is not visible in application. ");
				reportStep("The element with xpath "+xpath+" is holding the text "+text+" is not verified as the element is not visible in application. ", "FAIL");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("the element with xpath "+xpath+" is holding the text "+text+" is not verified as the element is not interactable in the application. ");
			reportStep("The element with xpath "+xpath+" is holding the text "+text+" is not verified as the element is not interactable in the application. ", "FAIL");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("the element with xpath "+xpath+" is holding the text "+text+" is not verified as the element is not stable in the application. ");
			reportStep("The element with xpath "+xpath+" is holding the text "+text+" is not verified as the element is not stable in the application. ", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified text "+text+" due to unknown error. ");
			reportStep("The element with xpath "+xpath+" is not verified text "+text+" due to unknown error. ", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualxpath1 = driver.findElementByXPath(xpath).getText();
			if (actualxpath1.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualxpath1+" contains expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text  "+actualxpath1+" contains expected text "+text, "PASS");
			}else {
				//System.err.println("The element with xpath "+xpath+" is holding the text "+actualxpath1+" does not contain expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualxpath1+" does not contain expected text "+text, "INFO");
				
			}
		}catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with xpath "+xpath+" is holding the text "+text+" is not verified as there is no such element in DOM. ");
				reportStep("The element with xpath "+xpath+" is holding the text "+text+" is not verified as there is no such element in DOM. ", "FAIL");
			} catch (ElementNotVisibleException e) {
				// TODO: handle exception
					//System.err.println("The element with xpath "+xpath+" is holding the text "+text+" is not verified as the element is not visible in application. ");
				reportStep("The element with xpath "+xpath+" is holding the text "+text+" is not verified as the element is not visible in application. ", "FAIL");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is holding the text "+text+" is not verified as the element is not interactable in the application. ");
				reportStep("The element with xpath "+xpath+" is holding the text "+text+" is not verified as the element is not interactable in the application. ", "FAIL");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is holding the text "+text+" is not verified as the element is not stable in the application. ");
				reportStep("The element with xpath "+xpath+" is holding the text "+text+" is not verified as the element is not stable in the application. ", "FAIL");
		    }catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified text "+text+" due to unknown error. ");
		    reportStep("The element with xpath "+xpath+" is not verified text "+text+" due to unknown error. ", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is successfully clicked. ");
			reportStep("The element with id "+id+" is successfully clicked. ", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM. ");
			reportStep("The element with id "+id+" is not found in the DOM. ", "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application. ");
			reportStep("The element with id "+id+" is not visible in the application. ", "FAIL");
			
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is unable to perform click because elements are disabled. ");
			reportStep("The element with id "+id+" is unable to perform click because elements are disabled. ", "FAIL");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application. ");
			reportStep("The element with id "+id+" is not stable in the application. ", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element wit id "+id+" is unable to click due to an unknown error. ");
			reportStep("The element with id "+id+" is unable to click due to an unknown error. ", "FAIL");

		}finally { 
			takeSnap();
		}
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with classname "+classVal+" is clicked successfully. ");
			reportStep("The element with classname "+classVal+" is clicked successfully. ", "PASS");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
         //   System.err.println("The element with classname "+classVal+" is not found in the DOM. ");
			reportStep("The element with classname "+classVal+" is not found in the DOM. ", "FAIL");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not visible in the application. ");
			reportStep("The element with classname "+classVal+" is not visible in the application. ", "FAIL");

		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is unable to perform click because elements are disabled. ");
			reportStep("The element with classname "+classVal+" is unable to perform click because elements are disabled. ", "FAIL");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not interactable in the application");
			reportStep("The element with classname "+classVal+" is not interactable in the application", "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("the element with classname "+classVal+" is unable to click as the element is not stable in the application. ");
			reportStep("The element with classname "+classVal+" is unable to click as the element is not stable in the application. ", "FAIL");

		}		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is unable to click due to an unknown error. ");
			reportStep("The element with classname "+classVal+" is unable to click due to an unknown error. ", "FAIL");

		}finally {
			takeSnap();
		}
		
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+name+" is successfully clicked. ");
			reportStep("The element with name "+name+" is successfully clicked", "PASS");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the DOM. ");
			reportStep("The element with name "+name+" is not found in the DOM. ", "FAIL");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible in the application. ");
			reportStep("The element with name "+name+" is not visible in the application. ", "FAIL");

		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is unable to perform click because elements are disabled. ");
			reportStep("The element with name "+name+" is unable to perform click because elements are disabled. ", "FAIL");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable in the application");
			reportStep("The element with name "+name+" is not interactable in the application", "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is unable to click as the element is not stable in the application. ");
			reportStep("The element with name "+name+" is unable to click as the element is not stable in the application. ", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
		}finally {
			takeSnap();
		}
	}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with linktext "+name+" is clicked successfully. ");
			reportStep("The element with linktext "+name+" is clicked successfully. ", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
           // System.err.println("The element with linktext "+name+" is not found in the DOM. ");
			reportStep("The element with linktext "+name+" is not found in the DOM. ", "FAIL");

        }catch (ElementNotVisibleException e) {
			// TODO: handle exception
        	//System.err.println("The element with linktext "+name+" is not visible in the application. ");
			reportStep("The element with linktext "+name+" is not visible in the application. ", "FAIL");

		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is unable to perform click because elements are disabled. ");
			reportStep("The element with linktext "+name+" is unable to perform click because elements are disabled. ", "FAIL");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not interactable in the application");
			reportStep("The element with linktext "+name+" is not interactable in the application", "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("the element with linktext "+name+" is unable to click as the element is not stable in the application. ");
			reportStep("The element with linktext "+name+" is unable to click as the element is not stable in the application. ", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is unable to click due to an unknown error. ");
			reportStep("The element with linktext "+name+" is unable to click due to an unknown error. ", "FAIL");

		}finally {
			takeSnap();
		}
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with linktext "+name+" is clicked successfully. ");
			reportStep("The element with linktext "+name+" is clicked successfully. ", "PASS");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
            //System.err.println("The element with linktext "+name+" is not found in the DOM. ");
			reportStep("The element with linktext "+name+" is not found in the DOM. ", "FAIL");

        }catch (ElementNotVisibleException e) {
			// TODO: handle exception
        	//System.err.println("The element with linktext "+name+" is not visible in the application. ");
			reportStep("The element with linktext "+name+" is not visible in the application. ", "FAIL");

		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is unable to perform click because elements are disabled. ");
			reportStep("The element with linktext "+name+" is unable to perform click because elements are disabled. ", "FAIL");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not interactable in the application");
			reportStep("The element with linktext "+name+" is not interactable in the application", "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("the element with linktext "+name+" is unable to click as the element is not stable in the application. ");
			reportStep("The element with linktext "+name+" is unable to click as the element is not stable in the application. ", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is unable to click due to an unknown error. ");
			reportStep("The element with linktext "+name+" is unable to click due to an unknown error. ", "FAIL");

			
		}
	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {

			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully. ");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully. ", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("the element with xpath "+xpathVal+" is unable to click as there is no such element in DOM. ");
			reportStep("The element with xpath "+xpathVal+" is unable to click as there is no such element in DOM. ", "FAIL");

		} catch (ElementNotVisibleException e) {
			//System.err.println("the element with xpath "+xpathVal+" is unable to click as the element is not visible in application ");
			reportStep("The element with xpath "+xpathVal+" is unable to click as the element is not visible in application ", "FAIL");

		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is unable to perform click because elements are disabled. ");
			reportStep("The element with xpath "+xpathVal+" is unable to perform click because elements are disabled. ", "FAIL");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The click with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "FAIL");

		} catch (StaleElementReferenceException e) {
			//System.err.println("the element with xpath "+xpathVal+" is unable to click as the element is not stable in application. ");
			reportStep("The element with xpath "+xpathVal+" is unable to click as the element is not stable in application. ", "FAIL");

		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is unable to click due to an unknown error. ");
			reportStep("The element with xpath "+xpathVal+" is unable to click due to an unknown error. ", "FAIL");

		}finally {
			takeSnap();
		}
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully. ");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully. ", "PASS",false);

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("the element with xpath "+xpathVal+" is unable to click as there is no such element in DOM. ");
			reportStep("The element with xpath "+xpathVal+" is unable to click as there is no such element in DOM. ", "FAIL",false);

		} catch (ElementNotVisibleException e) {
			//System.err.println("the element with xpath "+xpathVal+" is unable to click as the element is not visible in application. ");
			reportStep("The element with xpath "+xpathVal+" is unable to click as the element is not visible in application. ", "FAIL",false);

		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is unable to perform click because elements are disabled. ");
			reportStep("The element with xpath "+xpathVal+" is unable to perform click because elements are disabled. ", "FAIL",false);

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The click with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "FAIL");

		} catch (StaleElementReferenceException e) {
			//System.err.println("the element with xpath "+xpathVal+" is unable to click as the element is not stable in application. ");
			reportStep("The element with xpath "+xpathVal+" is unable to click as the element is not stable in application. ", "FAIL",false);

		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is unable to click due to an unknown error. ");
			reportStep("The element with xpath "+xpathVal+" is unable to click due to an unknown error. ", "FAIL",false);

		}
	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
	  
		String gettext = null;
	try {
		 gettext = driver.findElementById(idVal).getText();
		//System.out.println("The element with id "+gettext+" is successfully printed on the console. ");
		reportStep("The element with id "+gettext+" is successfully printed on the console. ", "PASS");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with id "+gettext+" is not found in the DOM. ");
		reportStep("The element with id "+gettext+" is not found in the DOM. ", "FAIL");

	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The element wiyh id "+gettext+" is not visible in the application. ");
		reportStep("The element with id "+gettext+" is not visible in the application. ", "FAIL");

	}catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The text with id "+gettext+" is not interactable in the application. ");
		reportStep("The element with id "+gettext+" is not interactable in the application. ", "FAIL");

	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element with id "+gettext+" is not stable in the application. ");
		reportStep("The element with id "+gettext+" is not stable in the application. ", "FAIL");

	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element with id "+gettext+" is unable to get the text due to an unknown error. ");
		reportStep("The element with id "+gettext+" is unable to get the text due to an unknown error. ", "FAIL");

	}finally {
		takeSnap();
	}
		return gettext;
		
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String gettext = null;
		try {
			 gettext = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with xpath "+gettext+" is successfully printed on the console. ");
			reportStep("The element with xpath "+gettext+" is successfully printed on the console. ", "PASS");

		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("the element with xpath "+gettext+" is not found in the DOM. ");
			reportStep("The element with xpath "+gettext+" is not found in the DOM. ", "FAIL");

		} catch (ElementNotVisibleException e) {
			//System.err.println("the element with xpath "+gettext+" is not visible in the application. ");
			reportStep("The element with xpath "+gettext+" is not visible in the application. ", "FAIL");

		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The text with xpath "+gettext+" is not interactable in the application. ");
			reportStep("The element with xpath "+gettext+" is not interactable in the application. ", "FAIL");

		}catch (StaleElementReferenceException e) {
			//System.err.println("the element with xpath "+gettext+" is not stable in application. ");
			reportStep("The element with xpath "+gettext+" is not stable in application. ", "FAIL");

		}  catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+gettext+" is unable to get the text due to an unknown error.");
			reportStep("The element with xpath "+gettext+" is unable to get the text due to an unknown error.", "FAIL");

		}finally {
			takeSnap();
		}
		return gettext;
	}
	
	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement d = driver.findElementById(id);
			 Select ID = new Select(d);	
			 ID.selectByVisibleText(value);
			 //System.out.println("The element with id "+id+" is selected "+ID+" with excepted value "+value+" successfully. ");
			 reportStep("The element with id "+id+" is selected "+ID+" with excepted value "+value+" successfully. ", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM. ");
			reportStep("The element with id "+id+" is not found in the DOM. ", "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element wiyh id "+id+" is not visible in the application. ");
			reportStep("The element with id "+id+" is not visible in the application. ", "FAIL");

		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected because elements are disabled. ");
			reportStep("The element with id "+id+" is not selected because elements are disabled. ", "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application. ");
			reportStep("The element with id "+id+" is not stable in the application. ", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected due to an unknown error. ");
			reportStep("The element with id "+id+" is not selected due to an unknown error. ", "FAIL");

		}finally {
			takeSnap();
		}
	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement I = driver.findElementById(id);
			 Select Index = new Select(I);	
			 Index.selectByIndex(value);
			 //System.out.println("The element with id "+id+" is selected "+Index+" with excepted value "+value+" successfully. ");
			 reportStep("The element with id "+id+" is selected "+Index+" with excepted value "+value+" successfully. ", "PASS");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM. ");
			reportStep("The element with id "+id+" is not found in the DOM. ", "FAIL");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element wiyh id "+id+" is not visible in the application. ");
			reportStep("The element with id "+id+" is not visible in the application. ", "FAIL");

		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected because elements are disabled. ");
			reportStep("The element with id "+id+" is not selected because elements are disabled. ", "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application. ");
			reportStep("The element with id "+id+" is not stable in the application. ", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected due to an unknown error. ");
			reportStep("The element with id "+id+" is not selected due to an unknown error. ", "FAIL");

		}finally {
			takeSnap();
		}
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allwinidsafterclick = driver.getWindowHandles();
			
			for(String eachid : allwinidsafterclick) {
				    	
				driver.switchTo().window(eachid);
				break;
			}
			//System.out.println("The window is switched to the parent window successfully.");
			reportStep("The window is switched to the parent window successfully.", "PASS");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The window is unable to switch because windows are not found on the web page.");
			reportStep("The window is unable to switch because windows are not found on the web page.", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The window is unable to switch due to an unknown error.");
			reportStep("The window is unable to switch due to an unknown error.", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allwinidsafterclick = driver.getWindowHandles();
			
			for(String eachid : allwinidsafterclick) {
				    	
				driver.switchTo().window(eachid);
				}
			//System.out.println("The window is switched to the last window successfully.");
			reportStep("The window is switched to the last window successfully.", "PASS");

		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The window is unable to switch because last windows are not found on the web page.");
			reportStep("The window is unable to switch because last windows are not found on the web page.", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The window is unable to switch due to an unknown error.");
			reportStep("The window is unable to switch due to an unknown error.", "FAIL");

		}finally {
			takeSnap();
		}
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.alertIsPresent());

			driver.switchTo().alert().accept();
			//System.out.println("The alert is opened and the element accepted successfully. ");
			reportStep("The alert is opened and the element accepted successfully. ", "PASS");

		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element got opened due to an unexpected alert.");
			reportStep("The element got opened due to an unexpected alert.", "FAIL");

		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element is unable to accept because the alert box is not loaded on the website.");
			reportStep("The element is unable to accept because the alert box is not loaded on the website.", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element is unable to accept an alert due to an unknown error.");
			reportStep("The element is unable to accept an alert due to an unknown error.", "FAIL");

		}finally {
			takeSnap();
		}
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert box is opened and the element dismissed successfully.");
			reportStep("The alert box is opened and the element dismissed successfully. ", "PASS");

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element got opened due to an unexpected alert.");
			reportStep("The element got opened due to an unexpected alert.", "FAIL");

		} 
		catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element is unable to dismiss because the alert box is not loaded on the website.");
			reportStep("The element is unable to dismiss because the alert box is not loaded on the website.", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element is unable to dismiss an alert due to an unknown error.");
			reportStep("The element is unable to dismiss an alert due to an unknown error.", "FAIL");

		}finally {
			takeSnap();
		}
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String alerttext = null;

		try {

			//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.alertIsPresent());

             alerttext = driver.switchTo().alert().getText();
			//System.out.println("The element "+alerttext+"  is printed on the console successfully.");
			reportStep("The element "+alerttext+"  is printed on the console successfully.", "PASS",false);
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element got opened due to an unexpected alert.");
			reportStep("The element got opened due to an unexpected alert.", "FAIL",false);

		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element "+alerttext+"  is not printed on the console because the alert box is unable to load on the website.");
			reportStep("The element "+alerttext+"  is not printed on the console because the alert box is unable to load on the website", "FAIL",false);

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element is unable to print on the console due to an unknown error.");
			reportStep("The element is unable to print on the console due to an unknown error.", "FAIL",false);

		}

		return alerttext;
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
	
		long number=0;
  		
		try {			
			number= (long) (Math.floor(Math.random()*100000000)+100000);
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Results/screenshots/" +number+ ".png");
			FileUtils.copyFile(tmp, dest);
			//System.out.println("The snap is taken succesfully.");
			
		}catch (IOException e) {
			// TODO: handle exception
			//System.err.println("The snap is not taken due to IOException");
			
			} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element is unable to take the screenshot due to an unknown error.");

		}
		return number;

	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The active or current browser is closed successfully.");
			reportStep("The active or current browser is closed successfully.", "PASS",false);

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The active or current browser is unable to close due to an unknown error.");
			reportStep("The active or current browser is unable to close due to an unknown error.", "FAIL",false);

		}
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
		//System.out.println("All the browsers are closed successfully .");	
		reportStep("All the browsers are closed successfully .", "PASS",false);

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
		//System.err.println("All the browsers are unable to close due to an unknown error.");	
		reportStep("All the browsers are unable to close due to an unknown error.", "FAIL",false);

		}
	}


	@Override
	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
			//System.out.println("It causes the currently executing thread to sleep for the specified  milliseconds has taken successfully.");
			reportStep("It causes the currently executing thread to sleep for the specified  milliseconds has taken successfully.", "PASS");

			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				//System.err.println("The current thread has been interrupted either before or during the activity.");
				reportStep("The current thread has been interrupted either before or during the activity.", "FAIL");

		    }catch (IllegalArgumentException e) {
				// TODO: handle exception
		    	//System.err.println("If the value of millis is negative, it is an illegal argument exception.");
				reportStep("If the value of millis is negative, it is an illegal argument exception.", "FAIL");

			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("Unable the currently executing thread to sleep due to unknown error.");
				reportStep("Unable the currently executing thread to sleep due to unknown error.", "FAIL");

			}
	}


	@Override
	public void selectIndexTextByXpath(String xpath, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement X = driver.findElementByXPath(xpath);
			 Select Index1 = new Select(X);	
			 Index1.selectByIndex(value);
			 //System.out.println("The element with xpath "+xpath+" is selected "+Index1+" with excepted value "+value+" successfully. ");
				reportStep("The element with xpath "+xpath+" is selected "+Index1+" with excepted value "+value+" successfully. ", "PASS");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM. ");
			reportStep("The element with xpath "+xpath+" is not found in the DOM. ", "FAIL");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element wiyh xpath "+xpath+" is not visible in the application. ");
			reportStep("The element wiyh xpath "+xpath+" is not visible in the application. ", "FAIL");

		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selected because elements are disabled. ");
			reportStep("The element with xpath "+xpath+" is not selected because elements are disabled. ", "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application. ");
			reportStep("The element with xpath "+xpath+" is not stable in the application. ", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selected due to an unknown error. ");
			reportStep("The element with xpath "+xpath+" is not selected due to an unknown error. ", "FAIL");

		}finally {
			takeSnap();
		}

	}


	@Override
	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement path = driver.findElementByXPath(xpath);
			 Select ID1 = new Select(path);	
			 ID1.selectByVisibleText(value);
			 //System.out.println("The element with xpath "+xpath+" is selected "+ID1+" with excepted value "+value+" successfully. ");
				reportStep("The element with xpath "+xpath+" is selected  with excepted value "+value+" successfully. ", "PASS");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM. ");
			reportStep("The element with xpath "+xpath+" is not found in the DOM. ", "FAIL");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element wiyh xpath "+xpath+" is not visible in the application. ");
			reportStep("The element with xpath "+xpath+" is not visible in the application. ", "FAIL");

		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selected because elements are disabled. ");
			reportStep("The element with xpath "+xpath+" is not selected because elements are disabled. ", "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application. ");
			reportStep("The element with xpath "+xpath+" is not stable in the application. ", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selected due to an unknown error. ");
			reportStep("The element with xpath "+xpath+" is not selected due to an unknown error. ", "FAIL");

		}finally {
			takeSnap();
		}

	}


	@Override
	public void WebPageDown()
 {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			 //System.out.println("The element with xpath is scrolled down successfully.");
				reportStep("The element with xpath is scrolled down successfully.", "PASS");


		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The webpage is unable to scroll down because the xpath is not found in the DOM.");
			reportStep("The webpage is unable to scroll down because the xpath is not found in the DOM.", "FAIL");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The webpage is unable to scroll down because the xpath is not visible in the application ");
			reportStep("The webpage is unable to scroll down because the xpath is not visible in the application ", "FAIL");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The webpage is unable to scroll down because the xpath is not interactable in the application. ");
			reportStep("The webpage is unable to scroll down because the xpath is not interactable in the application. ", "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The webpage is unable to scroll down because the xpath is not stable in the application ");
			reportStep("The webpage is unable to scroll down because the xpath is not stable in the application ", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath is unable to scroll down due to an unknown error.");
			reportStep("The element with xpath is unable to scroll down due to an unknown error.", "FAIL");

		}
		
	}
       

	@Override
	public void WebPageup() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_UP);
			 //System.out.println("The element with xpath is scrolled up successfully.");
				reportStep("The element with xpath is scrolled up successfully.", "PASS");


		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The webpage is unable to scroll up because the xpath is not found in the DOM.");
			reportStep("The webpage is unable to scroll up because the xpath is not found in the DOM.", "FAIL");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The webpage is unable to scroll up because the xpath is not visible in the application ");
			reportStep("The webpage is unable to scroll up because the xpath is not visible in the application ", "FAIL");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The webpage is unable to scroll up because the xpath is not interactable in the application. ");
			reportStep("The webpage is unable to scroll up because the xpath is not interactable in the application. ", "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The webpage is unable to scroll up because the xpath is not stable in the application ");
			reportStep("The webpage is unable to scroll up because the xpath is not stable in the application ", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath is unable to scroll up due to an unknown error.");
			reportStep("The element with xpath is unable to scroll up due to an unknown error.", "FAIL");

		}

	}


	@Override
	public void selectVisibileTextByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement path = driver.findElementByName(name);
			 Select ID2 = new Select(path);	
			 ID2.selectByVisibleText(value);
			// System.out.println("The element with name "+name+" is selected with excepted value "+value+" successfully. ");
			 reportStep("The element with name "+name+" is selected with excepted value "+value+" successfully. ", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the DOM. ");
			reportStep("The element with name "+name+" is not found in the DOM. ", "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element wiyh name "+name+" is not visible in the application. ");
			reportStep("The element with name "+name+" is not visible in the application. ", "FAIL");

		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selected because elements are disabled. ");
			reportStep("The element with name "+name+" is not selected because elements are disabled. ", "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in the application. ");
			reportStep("The element with name "+name+" is not stable in the application. ", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selected due to an unknown error. ");
			reportStep("The element with name "+name+" is not selected due to an unknown error. ", "FAIL");

		}finally {
			takeSnap();
		}

	
	}


	@Override
	public void selectIndexTextByName(String name, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement X = driver.findElementByName(name);
			 Select Index2 = new Select(X);	
			 Index2.selectByIndex(value);
			 //System.out.println("The element with name "+name+" is selected with excepted value "+value+" successfully. ");
			 reportStep("The element with name "+name+" is selected with excepted value "+value+" successfully. ", "PASS");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the DOM. ");
			reportStep("The element with name "+name+" is not found in the DOM. ", "FAIL");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element wiyh name "+name+" is not visible in the application. ");
			reportStep("The element with name "+name+" is not visible in the application. ", "FAIL");

		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selected because elements are disabled. ");
			reportStep("The element with name "+name+" is not selected because elements are disabled. ", "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in the application. ");
			reportStep("The element with name "+name+" is not stable in the application. ", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selected due to an unknown error. ");
			reportStep("The element with name "+name+" is not selected due to an unknown error. ", "FAIL");

		}finally {
			takeSnap();
		}

	}


	@Override
	public void switchtoframename(String name) {
		// TODO Auto-generated method stub
		
		try {
		
			driver.switchTo().frame(name);
			//System.out.println("The element with name "+name+" is switched to the next frame successfully." );
			reportStep("The element with name "+name+" is switched to the next frame successfully.", "PASS");

			
		} catch (NoSuchFrameException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not found in the frame");
			reportStep("The element with name "+name+" is not found in the frame", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
           // System.err.println("The frame is unable to switch due to an unknown error.");	
			reportStep("The frame is unable to switch due to an unknown error.", "FAIL");

		}
	}


	@Override
	public void switchoutofframe() {
		// TODO Auto-generated method stub
		
		
		try {
	        driver.switchTo().defaultContent();
	        //System.out.println("The frame has been successfully switched to firstframe on the page." );
	        reportStep("The frame has been successfully switched to firstframe on the page.", "PASS");
		} catch (NoSuchFrameException e) {
			// TODO: handle exception
			//System.err.println("The element is not found in the frame ");
	        reportStep("The element is not found in the frame ", "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
            //System.err.println("The frame is unable to switch to firstframe due to an unknown error.");	
	        reportStep("The frame is unable to switch to firstframe due to an unknown error.", "FAIL");


		}
	}


	@Override
	public void alertsendkey(String name) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().sendKeys(name);
			//System.out.println("The element with name "+name+" is entered with data  successfully.");
			reportStep("The element with name "+name+" is entered with data  successfully.", "PASS",false);

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable in the application.");
			reportStep("The element with name "+name+" is not interactable in the application.", "FAIL",false);

		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element got opened due to an unexpected alert.");
			reportStep("The element got opened due to an unexpected alert.", "FAIL",false);

		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element is unable to accept because the alert box is not loaded on the website.");
			reportStep("The element is unable to accept because the alert box is not loaded on the website.", "FAIL",false);

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not entered with data  due to unknown error.");
			reportStep("The element with name "+name+" is not entered with data  due to unknown error.", "FAIL",false);

		}			
		
	}


	@Override
	public void refreshpage() {
		// TODO Auto-generated method stub
		try {
			 driver.navigate().refresh();
             //System.out.println("It has successfully refresh the current page. ");	
             reportStep("It has successfully refresh the current page. ", "PASS");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Not able to refresh the current page due to unknown error.");
            reportStep("Not able to refresh the current page due to unknown error.", "FAIL");

		}
	}


	@Override
	public void verifyTextContainsByID(String ID, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext = driver.findElementById(ID).getText();
			if (actualtext.contains(text)) {
				//System.out.println("The element with id "+ID+" is holding the text "+actualtext+" is matched with excepted text "+text+" successfully. ");
				reportStep("The element with id "+ID+" is holding the text "+actualtext+" is matched with excepted text "+text+" successfully. ", "PASS");
			} else {
			    System.err.println("The element with id "+ID+" is holding the text "+actualtext+" is not matched with excepted text "+text);
				reportStep("The element with id "+ID+" is holding the text "+actualtext+" is not matched with excepted text "+text+". ", "FAIL");

			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+ID+" is not found in the DOM "+text);
			reportStep("The element with id "+ID+" is not found in the DOM "+text, "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+ID+" is not visible in the application. ");
			reportStep("The element with id "+ID+" is not visible in the application. "+text, "FAIL");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+ID+" is not interactable in the application. ");
			reportStep("The element with id "+ID+" is not interactable in the application. "+text, "FAIL");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+ID+" is not stable in the application. ");
			reportStep("The element with id "+ID+" is not stable in the application. "+text, "FAIL");

		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+ID+" is not verified text "+text+" due to unknown error. ");
			reportStep("The element with id "+ID+" is not verified text "+text+" due to unknown error. ","FAIL");

		}
		finally {
			takeSnap();
		}
	}

		@Override
	public void mouseoverbyxpath(String xpath) {
		// TODO Auto-generated method stub
		
			try {
				
				Actions builder = new Actions(driver);
				WebElement xpath1 = driver.findElementByXPath(xpath);
				builder.moveToElement(xpath1).perform();
				// System.out.println("The mouse hover successfully performed action on specific elements. ");
				 reportStep("It successfully performed mouse hover action on specific elements. ", "PASS");
			
			} catch (NoSuchElementException e) {
				// TODO: handle exception
				//System.out.println("It is unable to perform actions because specific elements are not found in the DOM. ");
				reportStep("It is unable to perform mouse hover actions because the elements are not found in the DOM. ", "FAIL");

				
			}catch (ElementNotVisibleException e) {
				// TODO: handle 
                //System.out.println("It is unable to perform actions because specific elements are not visible in the application. ");
				reportStep("It is unable to perform mouse hover actions because the elements are not visible in the application. ", "FAIL");
				
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.out.println("It is unable to perform mouse hover actions because the elements are not stable in the application. ");
				reportStep("It is unable to perform mouse hover actions because the elements are not stable in the application. ", "FAIL");

			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.out.println("It is unable to perform mouse hover actions due to an unknown error.  ");

				reportStep("It is unable to perform mouse hover actions due to an unknown error. ", "FAIL");

			}
			
	}

		
	public void loadobject() {
		
		prop = new  Properties();
		try {
			prop.load(new FileInputStream("./src/test/java/object.properties"));

		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		}
		
	}	
		
public void unloadobject() {
		
		prop = null;

		
	}	
		
		
		
		
		
		
		
		
		
		
}

	
	
	
	
	
	
		
	




	


	


