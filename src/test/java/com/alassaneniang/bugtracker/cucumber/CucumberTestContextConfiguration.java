package com.alassaneniang.bugtracker.cucumber;

import com.alassaneniang.bugtracker.BugTrackerJHipsterApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = BugTrackerJHipsterApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
