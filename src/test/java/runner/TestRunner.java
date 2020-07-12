package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Eclipse-java-Practical\\Mavenproject\\src\\test\\java\\featutres",
glue="stepdefinitions",
plugin= {"pretty","html:text-output","json:json-ou/repo.xml","junit:junit-output/report.junit"},
monochrome=true,
tags="@prime",
dryRun=false)

public class TestRunner {

}
