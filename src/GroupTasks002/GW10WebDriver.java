package GroupTasks002;
/*
10. Provide Implementation for the diagram below.
Then create a test class in which you need
to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes
and see which methods available to them.

WebDriver Interface:
void open();
void close();
String getTitle(); ----->   RemoteWebDriver Interface:
                            void navigate();------------>   The following interfaces and classes:
 */
interface GW10WebDriver {
    void open();
    void close();
    String getTitle();
}
interface Screenshot{
    void takeScreenShot();
}
interface RemoteWebDriver extends GW10WebDriver, Screenshot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open(){
        System.out.println("Opened Browser");
    }
    @Override
    public void close(){
        System.out.println("Closed Browser");
    }
    @Override
    public String getTitle(){
        return "Chrome";
    }
    @Override
    public void takeScreenShot(){
        System.out.println("Took screenShot");
    }
    @Override
    public void navigate(){
        System.out.println("Navigated");
    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open(){
        System.out.println("Opened Browser");
    }
    @Override
    public void close(){
        System.out.println("Closed Browser");
    }
    @Override
    public String getTitle(){
        return "Firefox";
    }
    @Override
    public void takeScreenShot(){
        System.out.println("Took screenShot");
    }
    @Override
    public void navigate(){
        System.out.println("Navigated");
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open(){
        System.out.println("Opened Browser");
    }
    @Override
    public void close(){
        System.out.println("Closed Browser");
    }
    @Override
    public String getTitle(){
        return "Safari";
    }
    @Override
    public void takeScreenShot(){
        System.out.println("Took screenShot");
    }
    @Override
    public void navigate(){
        System.out.println("Navigated");
    }
}
class WebDriverTester{
    public static void main(String[] args) {
        RemoteWebDriver [] webdrivers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver d: webdrivers){
            d.open();
            d.navigate();
            System.out.println(d.getTitle());
            d.takeScreenShot();
            d.close();
        }
    }
}