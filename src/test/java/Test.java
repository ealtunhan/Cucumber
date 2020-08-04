
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.*;

public class Test {
    WebDriver webDriver = null;

    @Given("^I open chrome browser$")
    public void i_open_chrome_browser() throws Throwable {
        System.out.println("Chrome is running...");
        webDriver = DriverInitializer.getDriver();
    }
    @When("^I navigate to home page$")
    public void i_navigate_to_home_page() throws Throwable {
        System.out.println("Go to home page !");
        webDriver.get(DriverInitializer.getProperty("home.url"));
    }
    @Then("^Check Test (\\d+)$")
    public void check_Test(int arg1) throws Throwable {
        if(arg1 == 1){
            System.out.println("\n==== Test 1 ====");
            WebElement email_element = webDriver.findElement(By.id("inputEmail"));
            WebElement password_element = webDriver.findElement(By.id("inputPassword"));
            //check email and password field is exist or not
            assertNotNull(email_element);
            assertNotNull(password_element);
            //enter email and password
            email_element.sendKeys("test@gmail.com");
            password_element.sendKeys("12345");
        }
        //second test case
        else if(arg1 == 2){
            System.out.println("\n==== Test 2 ====");
            //check three values are exist in list group
            WebElement list_group = webDriver.findElement(By.className("list-group"));
            List<WebElement> elements = list_group.findElements(By.tagName("li"));
            int element_number = elements.size();
            //check element counter is 3 or not
            assertEquals(3, element_number);

            //get second item value
            String value = elements.get(1).getText();
            String[] splits = value.split("\\s+");
            value = "";
            for(int i = 0; i < splits.length - 1; i++){
                value += splits[i] + " ";
            }
            value = value.trim();
            System.out.println("Second Item: " + value);
            assertEquals("List Item 2", value);
            //check badge value
            WebElement badge = elements.get(1).findElement(By.tagName("span"));
            String badge_value = badge.getText();
            assertEquals("6", badge_value);
            System.out.println("Second Item Badge: " + badge_value);
        }
        //test 2
        else if(arg1 == 3){
            System.out.println("\n==== Test 3 ====");
            WebElement dropdown_btn = webDriver.findElement(By.id("dropdownMenuButton"));
            String default_value = dropdown_btn.getText().toString();
            //check default value is Option 1
            System.out.println("Default value: " + default_value);
            assertEquals("Option 1", default_value);

            WebElement drop_menu = webDriver.findElement(By.className("dropdown-menu"));
            List<WebElement> menu_list = drop_menu.findElements(By.className("dropdown-item"));
            //select option 3
            WebElement menu = menu_list.get(2);
            dropdown_btn.click(); //click dropdown button and select third element
            menu.click();
        }
        //test 4
        else if(arg1 == 4){
            System.out.println("\n==== Test 4 ====");
            WebElement button_area = webDriver.findElement(By.id("test-4-div"));
            //get two buttons
            List<WebElement> button_list = button_area.findElements(By.tagName("button"));
            //test first button is enabled
            assertTrue(button_list.get(0).isEnabled());
            System.out.println("First button is enabled !");
            assertFalse(button_list.get(1).isEnabled());
            System.out.println("First button is disabled !");
        }else if(arg1 == 5){
            System.out.println("\n==== Test 5 ====");
            //wait button is displayed and clickable
            WebDriverWait wait = new WebDriverWait(webDriver,60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("test5-button")));
            WebElement button = webDriver.findElement(By.id("test5-button"));
            button.click();
            System.out.println("Button is clicked !");

            //confirm message is shown
            WebElement alert_area = webDriver.findElement(By.id("test5-alert"));
            assertTrue(alert_area.isDisplayed());
            assertFalse(button.isEnabled());
            System.out.println("Message is shown and Button is disabled !");
        }else if(arg1 == 6){
            System.out.println("\n==== Test 6 ====");
            //get 2 * 2 cell value
            String cell = findTableCell(2, 2);
            assertEquals("Ventosanzap", cell);
            System.out.println("Cell value is \"" + cell + "\" !");
        }
    }

    /**
     * get any cell value
     * @param row
     * @param col
     * @return
     */
    public String findTableCell(int row, int col){
        WebElement table_area = webDriver.findElement(By.id("test-6-div"));
        WebElement table = table_area.findElement(By.tagName("table"));
        WebElement body = table.findElement(By.tagName("tbody"));
        //get row
        List<WebElement> rows = body.findElements(By.tagName("tr"));
        int row_num = rows.size();
        int column_num = rows.get(0).findElements(By.tagName("td")).size();
        if(row >= row_num || col >= column_num){
            return null;
        }
        WebElement column = rows.get(row);
        WebElement cell = column.findElements(By.tagName("td")).get(col);
        //get text value
        String cell_value = cell.getText();
        return cell_value;
    }
}
