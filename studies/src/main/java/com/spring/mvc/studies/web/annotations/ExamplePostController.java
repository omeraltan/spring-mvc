package com.spring.mvc.studies.web.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/post")
public class ExamplePostController {

    @PostMapping("/response")
    @ResponseBody
    public ResponseTransfer postResponseController(@RequestBody LoginForm loginForm){
        return new ResponseTransfer("Thanks For Posting!!!");
    }

    @PostMapping(value = "/content", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseTransfer postResponseJsonContent(@RequestBody LoginForm loginForm){
        return new ResponseTransfer("JSON Content!");
    }

    @PostMapping(value = "/content", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public ResponseTransfer postResponseXmlContent(@RequestBody LoginForm loginForm){
        return new ResponseTransfer("XML Content");
    }

}
class ResponseTransfer{
    private String text;

    public ResponseTransfer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

class LoginForm{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
