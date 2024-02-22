package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;

@RunWith(CucumberSerenityRunner.class)

@CucumberOptions(features = "src/test/resources/Features",glue = "com/steps",tags = "@Loactions")
public class Runner {

}
