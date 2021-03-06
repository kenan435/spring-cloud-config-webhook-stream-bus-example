package com.springbootdev.springcloud.examples.employeeservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DemoController {

  @Value("${mysql.properties.password}")
  private String testProperty;

  @RequestMapping("/demo")
  public String test() {
    StringBuilder builder = new StringBuilder();
    builder.append("global property - ").append(testProperty);
    return builder.toString();
  }
}
