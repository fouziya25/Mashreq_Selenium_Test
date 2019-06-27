package package_Mashreq;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SampleMashreq {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe"); // path for your exe file 
		WebDriver driver = new ChromeDriver();
		
		//Opens the Mashreq bank Web page 
		driver.get("https://www.mashreqbank.com/uae/en/personal/home");
		driver.manage().window().maximize();
		
		/* -------------Test case 1 : Check the Navigation Bar 
		------------------Starts here------------------------ */
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/div/div[1]")));
		boolean NavBarIsPresent=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/div/div[1]")).isEnabled();
		                                                        
		  if(NavBarIsPresent)
		  {
			System.out.print("Navigation bar is visible");  
			 //Check for 9 items
			 //1 Corporate Tab
		     int flag=0;
			 boolean CorporateIsPresent=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/div/div[1]/div/ul/li[2]/a")).isEnabled();
			    if(CorporateIsPresent)
				    {
			    	
				      System.out.print("\n Corporate Item Is Displayed");
				      flag++;
			        }
			      else
			        {
			    	System.out.print("\n Not displayed the item: Corporate");
			        }
			    
		     //2 Business Tab
			    boolean BusinessIsPresent=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/div/div[1]/div/ul/li[3]/a")).isEnabled();
			    if(BusinessIsPresent)
				    {
			    	
				      System.out.print("\n Business Item is Displayed");
				      flag++;
			        }
			      else
			        {
			    	System.out.print("Not displayed the item: Business");
			        }
			    
			  //3 International Tab
			    boolean InternationalIsPresent=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/div/div[1]/div/ul/li[4]")).isEnabled();
			    if(InternationalIsPresent)
				    {
			    	
				      System.out.print("\n International Item is Displayed");
				      flag++;
				     
				     }
			      else
			        {
			    	System.out.print("Not displayed the item: International");
			        }  
			    
              // 4 Private Banking Tab
			    boolean PrivateBankingIsPresent=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/div/div[1]/div/ul/li[5]/a")).isEnabled();
			    if(PrivateBankingIsPresent)
				    {
			    	
				      System.out.print("\n Private Banking Item is Displayed");
				      flag++;
				      //Done driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/div/div[1]/div/ul/li[5]/a")).click();
				     
				     }
			      else
			        {
			    	System.out.print("Not displayed the item: Private Banking");
			        }  
			    
			 // 5 Al Islami Tab
			    boolean AlIslamiIsPresent=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/div/div[1]/div/ul/li[6]/a")).isEnabled();
			    if(AlIslamiIsPresent)
				    {
			    	
				      System.out.print("\n Al Islami Item is Displayed");
				      flag++;
				      //Done driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/div/div[1]/div/ul/li[6]/a")).click();
				     
				     }
			      else
			        {
			    	System.out.print("Not displayed the item: Al Islami");
			        }  
			 // 6 Gold Tab
			    boolean GoldIsPresent=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/div/div[1]/div/ul/li[7]/a")).isEnabled();
			    if(GoldIsPresent)
				    {
			    	
				      System.out.print("\n Gold Item is Displayed");
				      flag++;
				      
				     }
			      else
			        {
			    	System.out.print("Not displayed the item: Gold");
			        }   
			 //7 Mashreq Security Tab
			    boolean MashreqSecurityIsPresent=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/div/div[1]/div/ul/li[8]/a")).isEnabled();
			    if(MashreqSecurityIsPresent)
				    {
			    	
				      System.out.print("\n Mashreq Security Item is Displayed");
				      flag++;

				      }
			      else
			        {
			    	System.out.print("Not displayed the item: Mashreq Security");
			        }   
			    
				// 8 Mashreq Capital Tab
			    boolean MashreqCapitalIsPresent=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/div/div[1]/div/ul/li[9]/a")).isEnabled();
			    if(MashreqCapitalIsPresent)
				    {
			    	
				      System.out.print("\n Mashreq Capital Item is Displayed");
				      flag++;

				      }
			      else
			        {
			    	System.out.print("Not displayed the item: Mashreq Capital");
			        } 
			    
			 //9 Mashreq Global Services Tab
			    boolean MashreqGlobalIsPresent=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/nav/div/div[1]/div/ul/li[9]/a")).isEnabled();
			    if(MashreqGlobalIsPresent)
				    {
			    	
				      System.out.print("\n Mashreq  Global Services is Displayed");
				      flag++;

				      }
			      else
			        {
			    	System.out.print("Not displayed the item: Mashreq  Global Services");
			        }
			    
			    if(flag==9)
			    {
			    	System.out.print("\n Test case 1 Passed");
			    	System.out.print("\n" +flag);
			    	
			    }
			    else
			    {
			    	System.out.print("\n Test case 1 Failed");
			    }
		  }
		  else
		  {
			 System.out.print("\n Navigation bar is NOT visible");   
		  }
		 //---------------------------Test case 1 ends here--------------- 
		  
	
		   /*Test Case 2 Checking the MASHREQ NEWS
		    ----------------Starts HERE-------------------- */
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;// Scrolling down
		  js.executeScript("window.scrollBy(0,1000)");
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[4]/div[3]/ui-view/div[1]/div[3]/div[2]/div[1]/div/div/div/div[3]/div/div/a/h4")));
		  boolean news=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[3]/ui-view/div[1]/div[3]/div[2]/div[1]/div/div/div/div[3]/div/div/a/h4")).isEnabled();
		  
		    if(news)
		    {
			   System.out.print("\n MASHREQ NEWS IS PRESENT");  
			   System.out.print("\nTest case 2 Passed");
		    }
		    else
		    {
			   System.out.print("\n MASHREQ NEWS IS NOT PRESENT"); 
			   System.out.print("\nTest case 2 Failed");
		    }
		  
		 /*Test Case 2 Checking the MASHREQ NEWS--
		    ------------Ends HERE---------- */
		 
		  //Test case 3 Checking for "CONTACT US" link and clicking on it
		    // ------------Starts Here----
		     boolean ContactUs=driver.findElement(By.xpath("//*[@id=\"ac-globaldiv\"]/div/section/div/section[4]/div/a/p")).isEnabled();
		  
		     if(ContactUs==true)
		       {
			     //Click on the CONTACT US link  
			     driver.findElement(By.xpath("//*[@id=\"ac-globaldiv\"]/div/section/div/section[4]/div/a/p")).click();
			     //Waiting for the next page to be loaded
			     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form\"]/div[1]/div[2]/a[1]")));
			     String status=driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/div[2]/a[1]")).getText();
			     System.out.print("\n"+status);
			     
			      if(driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/div[2]/a[1]")).isDisplayed())
			      {
			    	  System.out.print("\n ON CONTACT US PAGE");
			    	  System.out.print("\nTest case 3 Passed");
			      }
			    	
			      else
			      {
			    	  System.out.print("\n NOT ON CONTACT US PAGE"); 
			    	  System.out.print("\nTest case 3 Failed");
			    	  
			      }
			    	 
		        }
		     else 
		       {
			    System.out.print("\n CONTACT US link is not available ");
		        }
		   //Test case 3 Checking for "CONTACT US" link and clicking on it
		   // ------------Ends Here----
		     
		     
		     
		  //Test Case 4 Submitting the form without entering details..
		  //-------------Starts Here---------------

			  JavascriptExecutor js1 = (JavascriptExecutor) driver;// Scrolling down
			  js1.executeScript("window.scrollBy(0,500)");
			  driver.findElement(By.id("btnSubmit")).click();
			  String errorMsg=driver.findElement(By.xpath("//*[@id=\"reachoutforproduct\"]")).getAttribute("validationMessage");
			  System.out.print("\n"+errorMsg);
			  
			    if(errorMsg.equals("Please select an item in the list."))
				
			    {   
			    	System.out.print("\nPrinted the validation Message");
			    	System.out.print("\nTest Case 4 Passed"); 
			    }
			    else
			    {   System.out.print("\nNot Printed the validation Message");
			    	System.out.print("\nTest Case 4 Failed");
			    }
			  
		     //------------Test case 4 ends here-------------------------------
			    
			    
			 //Test case 5 Checking whether there are 4 options in the dropdown
			 //----Starts here-------------
			    String[] options = driver.findElement(By.id("reachoutforproduct")).getText().split("\n");
			    int len=options.length;	
			    System.out.print("\n"+len);
			     if(len==6)
			     {
			    	System.out.print("\n 4 values are present in Drop down");
				    System.out.print("\nTest Case 5 Passed");
			      }
			     else
			     {
			    	 System.out.print("\n Test case 5 Failed");
			     }
			   
			   //------Test case 5 Ends here/-----------
			     
			  //Test case 6 -Checking “Select Sub Product” field is initially empty or not
			  //------------------Starts here--------------------
			   
			   String produtString=driver.findElement(By.xpath("//*[@id=\"product\"]")).getText();
			   System.out.print(produtString);
			   
			                if(produtString.equals("-- Select Sub Product --"))
			                 {
			                    System.out.print("\nSub product is empty"); 	
			                    System.out.print("\n Test case 6 passed");
			                  }
			                else
			                 {   Thread.sleep(2000);
			    	             System.out.print("\nSub product is not empty"); 	
				                 System.out.print("\n Test case 6 failed");
			                  }
			   //----------Test case 6 ends here---------------------
			    
			    
			   /*Test case 7 -Selecting product "Loans" populates the “Select Sub Product”
			    drop down with 6 options including “Home Loan UAE Resident” 
			    -----------Starts here--------------*/
			   
			    int flag7=0;
			    driver.findElement(By.xpath("//*[@id=\"need\"]")).sendKeys("Loans");// Giving "Loans" 
			    Thread.sleep(2000);
			    String[] options1 = driver.findElement(By.xpath("//*[@id=\"product\"]")).getText().split("\n");
			    int len1=options1.length;	
			    System.out.print("\n"+len1);
			    
			    
			              if(len1 == 7)  //Checking the dropdown count in "Select Sub Product"
			                   {
			    	             System.out.print("\n 6 Options are present in Drop down");
				                 flag7++;
			                    }
			               else
			                   {
			    	            System.out.print("\n 6 Options are not present in Drop down");
			                    }
			    
			     //Checking whether the "Home Loan UAE Resident" option is available or not
			     String element = driver.findElement(By.xpath("//*[@id=\"product\"]/option[4]")).getText();
			     
			                       if(element.equals("Home Loan UAE Resident"))
			                        {
			    	                  System.out.print("\n Home Loan UAE Resident is available");
			    	                  flag7++;
			                         }
			     
			                       else
			                         {
			    	                  System.out.print("\\n Home Loan UAE Resident is not available");;
			                          }
			                   if(flag7 == 2)
			                   {
			                	  System.out.print("\n Test case7 passed");
			    
			                   }
			                   else
			                   {
			                	   System.out.print("\n Test case 7 Failed");
			                   }
			                	   
			                	   
			     
			     /*-----------Test case 7 ends here---------------
			    
                 /*----------Test case 8- Entering a 7 digit number throws an error
                  -------------Starts here--------------*/
			     driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("5663");
			     String mobError=driver.findElement(By.xpath("//*[@id=\"dvMain\"]/div/div/div[7]/div/div[2]/span")).getText();
			     
			                            if(mobError.equals("Mobile number should be 7 digit"))
			                              {
			    	                         System.out.print("\nTest case 8 Passed");
			    	                         System.out.print("\nThrows the error  "+ mobError);
			                               }
			     
			                            else
			                              {
			    	                       System.out.print("\\nTest case 8 Failed");
			                               }
	             //--------------Test case 8 Ends here------------------------------
			     
			     /*Test case 9-No error throws while entering 7 digit
			      -------------Starts here------------------------*/
			     driver.findElement(By.xpath("//*[@id=\"mobile\"]")).clear(); 
			     driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("7656765"); //Giving mobile number with 7 digits
			     boolean mobErr1=driver.findElement(By.xpath("//*[@id=\"dvMain\"]/div/div/div[7]/div/div[2]/span")).isDisplayed();
			     
			                   if(mobErr1==false)
			                    {
			    	              System.out.print("\n Test case 9 passed");
			    	              System.out.print("\n No error message displayed");
			                     }
			                     else
			                     {
			    	              System.out.print("\n Test case 9 Failed");
			    	              System.out.print("\n Error message displayed"); 
			                      }
			    	//--------Test case 9 ends here----------------- 
			    		 
			    		 
	}
	}

