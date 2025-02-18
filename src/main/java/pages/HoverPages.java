package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPages {
    private WebDriver driver;

    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");


    public HoverPages(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @param index starts at 0
     */
    public FigureCaption hoverOverFigure(int index) {
        WebElement figure = driver.findElements(figureBox).get(index);

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();

        return new FigureCaption(figure.findElement(boxCaption));
    }

    public class FigureCaption {
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption) {

            this.caption = caption;
        }

        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }

        public String getTitle() {
            return caption.findElement(header).getText();
        }

        public String getLink() {
            return caption.findElement(link).getDomAttribute("href");
        }

        public String getLinkText() {
            return caption.findElement(link).getText();
        }
    }


}
