package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QATestingPage {
    @FindBy(xpath = "//*[@id=\"post-10588\"]/div/header/h1")
     public static  WebElement bestSoftTittle;

    @FindBy(xpath = "//*[@id=\"toc_container\"]/ul/li[2]/a")
    public static WebElement QATittleMenu;

    @FindBy(xpath = "//*[@id=\"List_of_the_BEST_Software_Testing_Tools\"]")
    public static WebElement listTittle;

    @FindBy(xpath = "//*[@id=\"post-10588\"]/div/div[2]/p[3]/strong")
    public static WebElement sometext;

    @FindBy(xpath = "//*[@id=\"toc_container\"]/ul/li[2]/ul/li[1]/a")
    public static WebElement typesTittle;



    public void printText(WebElement element){
        System.out.println(element.getText());

    }
}
