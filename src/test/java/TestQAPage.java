import config.BaseClass;
import objects.QATestingPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestQAPage extends BaseClass {
     static QATestingPage qaTestingPage;
     @BeforeClass
     public static void bTest(){
         driver.get("https://www.softwaretestinghelp.com/tools/");
         qaTestingPage = PageFactory.initElements(driver, QATestingPage.class);
     }

     @Test
      public void test1(){
         qaTestingPage.printText(QATestingPage.bestSoftTittle);
         qaTestingPage.printText(QATestingPage.QATittleMenu);
         qaTestingPage.printText(QATestingPage.listTittle);
         qaTestingPage.printText(QATestingPage.sometext);
         qaTestingPage.printText(QATestingPage.typesTittle);
     }
}
