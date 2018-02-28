package com.example.demo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@Tag("integration")
@RunWith(JUnitPlatform.class)
@ExtendWith(SpringExtension.class)
public class DemoApplicationTests {

  @Test
  public void contextLoads() {
  }

}
