package com.org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="policy", glue="", dryRun=false, plugin= {"pretty", "html:target/Destination", "junit:target/cucumber-reports/Cucumber.xml"}, monochrome=true)
public class Runner {

}
