package gr;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import io.quarkiverse.playwright.InjectPlaywright;
import io.quarkiverse.playwright.WithPlaywright;
import io.quarkus.qute.Qute;
import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.net.URL;

@QuarkusTest
@WithPlaywright(debug = true)
public class PlaywrightTest {

    @TestHTTPResource
    URL localhost;

    @InjectPlaywright
    BrowserContext context;

    @Test
    public void test() throws InterruptedException {
        Page page = context.newPage();
        String render = Qute.fmt("{#bundle /}").render();
        page.navigate(localhost.toString());
        page.setContent(render);
        Thread.sleep(60*1000);
    }

}
