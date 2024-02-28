package whoisrealminjueun;

import com.equo.application.api.IEquoApplication;
import com.equo.application.model.EquoApplicationBuilder;
import com.equo.dev.EquoApp;
import org.osgi.service.component.annotations.Component;

@Component
public class WhoisrealminjueunApplication implements IEquoApplication {

    public static void main(String[] args) throws Exception {
        EquoApp.launch();
    }

    public EquoApplicationBuilder buildApp(EquoApplicationBuilder appBuilder) {
        return appBuilder
                .withUI("index.html")
                .start();
    }
}
