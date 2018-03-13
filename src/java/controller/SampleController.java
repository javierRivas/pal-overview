import ...

@RestController
public class SampleController {

    private String welcomeMessage;

    public WelcomeController(@Value("${welcome_message}") String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @GetMapping("/")
    public String sayHello() {
      return welcomeMessage;
    }

    @PostMapping("/")
    public String receivePing(@RequestBody Srting ping) {
      return ping.equals("ping") ? "pong" : "Expeced ping..."
    }
}
