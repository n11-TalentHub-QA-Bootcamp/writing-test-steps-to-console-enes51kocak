import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        //tags = "@login",
        tags="@KaanDoumgunucocugu"
        //tags ="@cocoadslogin",
       // tags="@selleroffice-signup"
)
public class CucumberTestSuite {}
